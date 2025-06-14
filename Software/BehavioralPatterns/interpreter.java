// INTERPRETER PATTERN
interface Expression {
    boolean interpret(String context);
}

class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        return context.contains(data);
    }
}

class OrExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}

class AndExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression isJava = new TerminalExpression("Java");
        Expression isPython = new TerminalExpression("Python");
        Expression isJavaOrPython = new OrExpression(isJava, isPython);

        System.out.println("Is 'I love Java' valid? " + isJavaOrPython.interpret("I love Java"));
        System.out.println("Is 'I love Kotlin' valid? " + isJavaOrPython.interpret("I love Kotlin"));
    }
}
