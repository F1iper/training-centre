package streamskodilla.methodwithparam.code;

import java.math.BigDecimal;

public class ExpressionExecutor {
    public void executeExpression(BigDecimal a, BigDecimal b, MathExpression mathExpression) {
        BigDecimal result = mathExpression.calculateExpression(a, b);
        System.out.println("Result = " + result);
    }
    public void executeMethodReference(double a, double b, MethodExpression methodExpression) {
        double result = methodExpression.calculateExpression(a, b);
        System.out.println("Result = " + result);
    }
}
