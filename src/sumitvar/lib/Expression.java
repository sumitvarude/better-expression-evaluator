package sumitvar.lib;

public class Expression {
    double value = 0;
    Expression left, right;
    ArithmeticOperator operation;

    public Expression(double value) {
        this.value = value;
    }

    public Expression(Expression left, Expression right, ArithmeticOperator operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    public double evaluate() {
        return (value != 0) ? value : operation.operate(left , right);
    }
}
