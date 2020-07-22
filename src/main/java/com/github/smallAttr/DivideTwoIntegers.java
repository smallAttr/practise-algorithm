package com.github.smallAttr;

/**
 * @author smallAttr
 * @since 2019-08-26 11:02
 */
public class DivideTwoIntegers {


    public static void main(String[] args) {
        int dividend = 12;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));
    }


    public static int divide(int dividend, int divisor) {
        Long sum = divideLong(dividend, divisor);
        return sum > Integer.MAX_VALUE ? Integer.MAX_VALUE : sum.intValue();
    }

    private static long divideLong(long dividend, long divisor) {
        boolean positive = dividend > 0 == divisor > 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        if (dividend < divisor) {
            return 0L;
        }
        long sum = divisor;
        long target = 1;
        while ((sum + sum) < dividend) {
            sum += sum;
            target += target;
        }
        return positive ? target + divideLong(dividend - sum, divisor) : -(target + divideLong(dividend - sum, divisor));
    }
}
