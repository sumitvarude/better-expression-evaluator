package sumitvar.lib;

public class Minus implements ArithmeticOperator {
    @Override
    public double operate(Expression left, Expression right) {
        return left.evaluate() - right.evaluate();
    }
}
