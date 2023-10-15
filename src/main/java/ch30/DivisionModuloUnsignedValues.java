package ch30;

public class DivisionModuloUnsignedValues {
    /**
     * Signed Division
     */
    // -1
    int divisionSignedMinMax = Integer.MIN_VALUE / Integer.MAX_VALUE;

    // 0
    int divisionSignedMaxMin = Integer.MAX_VALUE / Integer.MIN_VALUE;

    /**
     * Signed Modulo
     */
    // -1
    int moduloSignedMinMax = Integer.MIN_VALUE % Integer.MAX_VALUE;

    // 2147483637
    int moduloSignedMaxMin = Integer.MAX_VALUE % Integer.MIN_VALUE;

    // modulo unsigned
    int moduloUnsignedMinMax = Integer.remainderUnsigned(
            Integer.MIN_VALUE, Integer.MAX_VALUE
    ); // 1

    int moduloUnsignedMaxMin = Integer.remainderUnsigned(
            Integer.MAX_VALUE, Integer.MIN_VALUE
    ); // 2147483647
}
