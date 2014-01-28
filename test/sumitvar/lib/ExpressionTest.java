package sumitvar.lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void testEvaluateWillAddTwoOperands() throws Exception {
        Expression exp = new Expression(new Expression(2d),new Expression(3d),new Plus());
        assertEquals(5d , exp.evaluate(),0.0);
    }

    @Test
    public void testEvaluateWillSubtractTwoOperands() throws Exception {
        Expression exp = new Expression(new Expression(10d),new Expression(3d),new Minus());
        assertEquals(7d , exp.evaluate(),0.0);
    }

    @Test
    public void testEvaluateWillMultiplyTwoOperands() throws Exception {
        Expression exp = new Expression(new Expression(2d),new Expression(3d),new Multiplication());
        assertEquals(6d , exp.evaluate(),0.0);
    }
}
