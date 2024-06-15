
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String input = "int x = 5; x = x + 3; System.out.println(x);" +
                "while (x < 20) { x = x + 1; System.out.println(x); }" +
                "int a = 10; int b = 5; System.out.println(a < b);";

        JavaSubsetLexer lexer = new JavaSubsetLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaSubsetParser parser = new JavaSubsetParser(tokens);

        JavaSubsetParser.ProgramContext tree = parser.program();
        System.out.println(tree.toStringTree(parser));

        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
    }
}