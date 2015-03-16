package expressionevaluator.operators.division;

import expressionevaluator.operators.BinaryOperator;

public class DoubleDoubleDivision extends BinaryOperator {

    public DoubleDoubleDivision() {
    }

    @Override
    public Object evaluate(Object left, Object right) {
        return (Double) left / (Double) right;
    }

}
//j