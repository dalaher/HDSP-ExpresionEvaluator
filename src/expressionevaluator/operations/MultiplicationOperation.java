package expressionevaluator.operations;

import expressionevaluator.operators.BinaryOperator;
import expressionevaluator.operatorfactories.BinaryOperatorFactory;
import expressionevaluator.Expression;

public class MultiplicationOperation extends BinaryOperation{

    public MultiplicationOperation(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }
    
   @Override
    public Object calculate() {
        return getOperator().evaluate(leftExpression.calculate(), rightExpression.calculate());
    }

    private BinaryOperator getOperator() {
        return new BinaryOperatorFactory().buildMultiplictionOperator(leftExpression.calculate(), rightExpression.calculate());
    }
}
