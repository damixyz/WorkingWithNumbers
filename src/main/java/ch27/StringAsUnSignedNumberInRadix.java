package ch27;

public class StringAsUnSignedNumberInRadix {

    private static final String nri = "255500";

    static int result = Integer.parseUnsignedInt(nri, Character.MAX_RADIX);

    static int result2 = Integer.parseUnsignedInt(nri);

    static int result3 = Integer.parseUnsignedInt(nri, 1, 4, Character.MAX_RADIX);


    // Integer.MAX_VALUE + 1 = 2147483647 + 1 = 21474483648
//    static int maxValuePlus1 = Integer.parseUnsignedInt("21474483648");

    public static void main(String[] args) {
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
//        System.out.println(maxValuePlus1);
    }
}
