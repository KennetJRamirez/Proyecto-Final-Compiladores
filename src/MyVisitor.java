// MyVisitor.java
import java.util.HashMap;
import java.util.Map;

public class MyVisitor extends JavaSubsetBaseVisitor<Void> {
    private Map<String, Integer> memory = new HashMap<>();

    @Override
    public Void visitVarDecl(JavaSubsetParser.VarDeclContext ctx) {
        String varName = ctx.ID().getText();
        int value = evaluateExpression(ctx.expr());
        memory.put(varName, value);
        System.out.println("Declared int variable " + varName + " with value " + value);
        return null;
    }

    @Override

    public Void visitAssignment(JavaSubsetParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        int value = evaluateExpression(ctx.expr());
        memory.put(varName, value);
        System.out.println("Assigned variable " + varName + " with value " + value);
        return null;
    }

    @Override
    public Void visitPrintStatement(JavaSubsetParser.PrintStatementContext ctx) {
        int value = evaluateExpression(ctx.expr());
        System.out.println("Output: " + value);
        return null;
    }

    @Override
    public Void visitLoop(JavaSubsetParser.LoopContext ctx) {
        if (ctx.getChild(0).getText().equals("for")) {
            visit(ctx.varDecl());
            while (evaluateComparison(ctx.comparison())) {
                visit(ctx.block());
                visit(ctx.assignment());
            }
        } else if (ctx.getChild(0).getText().equals("while")) {
            while (evaluateComparison(ctx.comparison())) {
                visit(ctx.block());
            }
        } else if (ctx.getChild(0).getText().equals("do")) {
            do {
                visit(ctx.block());
            } while (evaluateComparison(ctx.comparison()));
        }
        return null;
    }

    private int evaluateExpression(JavaSubsetParser.ExprContext ctx) {
        if (ctx.INT() != null) {
            return Integer.parseInt(ctx.INT().getText());
        } else if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            if (memory.containsKey(varName)) {
                return memory.get(varName);
            } else {
                throw new RuntimeException("Variable " + varName + " not defined");
            }
        } else if (ctx.expr().size() == 1) {
            return evaluateExpression(ctx.expr(0));
        } else if (ctx.expr().size() == 2) {
            int left = evaluateExpression(ctx.expr(0));
            int right = evaluateExpression(ctx.expr(1));
            switch (ctx.getChild(1).getText()) {
                case "+":
                    return left + right;
                case "-":
                    return left - right;
                case "*":
                    return left * right;
                case "/":
                    return left / right;
                case "==":
                    return left == right ? 1 : 0;
                case "!=":
                    return left != right ? 1 : 0;
                case "<":
                    return left < right ? 1 : 0;
                case ">":
                    return left > right ? 1 : 0;
                case "<=":
                    return left <= right ? 1 : 0;
                case ">=":
                    return left >= right ? 1 : 0;
                default:
                    throw new RuntimeException("Unknown operator: " + ctx.getChild(1).getText());
            }
        }
        throw new RuntimeException("Invalid expression");
    }

    private boolean evaluateComparison(JavaSubsetParser.ComparisonContext ctx) {
        int left = evaluateExpression(ctx.expr(0));
        int right = evaluateExpression(ctx.expr(1));
        switch (ctx.getChild(1).getText()) {
            case "==":
                return left == right;
            case "!=":
                return left != right;
            case "<":
                return left < right;
            case ">":
                return left > right;
            case "<=":
                return left <= right;
            case ">=":
                return left >= right;
            default:
                throw new RuntimeException("Unknown operator: " + ctx.getChild(1).getText());
        }

    }
}
