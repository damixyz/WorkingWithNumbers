package ch25;

import java.util.function.BinaryOperator;

public class ComputeMaxMinNumber {
    int i1 = -45;
    int i2 = -14;
    int min = Math.min(i1, i2);

    int max = Math.max(i1, i2);


    /**
     * Primitive Numeric types using the dedicaated min() and max() methods
     */
    double d1 = 0.023844D;
    double d2 = 0.35468856D;
    double minDouble = Double.min(d1, d2);
    double maxDouble = Double.max(d1, d2);

    /**
     * Making using of functional style
     */

    float f1 = 33.34F;
    float f2 = 33.213F;
    float minFloat = BinaryOperator.minBy(Float::compare).apply(f1, f2);
    float maxFloat = BinaryOperator.maxBy(Float::compare).apply(f1, f2);

}
