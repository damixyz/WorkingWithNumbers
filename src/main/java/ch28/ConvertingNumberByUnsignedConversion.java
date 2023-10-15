package ch28;

public class ConvertingNumberByUnsignedConversion {
    // Consider signed Integer.MIN_VALUE, which is -2,147,483,648.
    public static void main(String[] args) {
        long result = Integer.toUnsignedLong(Integer.MIN_VALUE);
        int result1 = Short.toUnsignedInt(Short.MIN_VALUE);
        int result2 = Short.toUnsignedInt(Short.MAX_VALUE);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
