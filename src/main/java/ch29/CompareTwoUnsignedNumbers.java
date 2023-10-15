package ch29;

public class CompareTwoUnsignedNumbers {
    /**
     * Consider two signed Integers, Integer.MIN_VALUE(-2,147,483,648) and
     * Integer.MAX_VALUE (2,147,483,648). Comparing these integers (signed values) will
     * result in -2,147,483,648 being smaller than 2,147,483,648:
     */

    public static void main(String[] args) {
        // resultSigned is equal to -1 indicating that
        // MIN_VALUE is smaller than MAX_VALUE
        int resultSigned = Integer
                .compare(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(resultSigned);


        // resultUnsigned is equal to 1 indicating that
        // MIN_VALUE is greater than MAX_VALUE
        int resultUnsigned = Integer
                .compareUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(resultUnsigned);
    }
}
