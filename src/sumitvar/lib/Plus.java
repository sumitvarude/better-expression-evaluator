package sumitvar.lib;

public class Plus implements ArithmeticOperator{
    @Override
    public double operate(Expression left,Expression right){
        return left.evaluate() + right.evaluate();
    }
}
