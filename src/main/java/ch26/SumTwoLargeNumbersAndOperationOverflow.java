package ch26;

import java.util.function.BinaryOperator;

public class SumTwoLargeNumbersAndOperationOverflow {

    public static void main(String[] args) {

        System.out.println(sumUpFunctionalStyle());
        System.out.println(sumUp1());
        System.out.println(sumUp2());
        System.out.println(sumUp3());
        System.out.println(sumUp4());
        System.out.println(sumUp5());
        System.out.println(sumUp6());
    }

    private static int sumUpFunctionalStyle() {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;

        BinaryOperator<Integer> operator = Math::addExact;
        return operator.apply(x, y);
    }

    private static int sumUp6() {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        return Math.addExact(x, y); //  Throws Arithmetic Exception if the result overflows an int
    }

    private static long sumUp5() {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        return x + y; //  -2
    }

    private static long sumUp4() {
        long x = Integer.MAX_VALUE;
        long y = Integer.MAX_VALUE;
        return x + y; //  4294967294
    }

    private static int sumUp1() {
        int x = 2;
        int y = 7;
        return x + y; // 9
    }

    private static int sumUp2() {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        return x + y; // -2
    }

    private static int sumUp3() {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        return x + y; // -2
    }
}
