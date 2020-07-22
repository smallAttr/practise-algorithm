package com.github.smallAttr;

/**
 * @author smallAttr
 * @since 2019-12-26 16:39
 */
public class MyPow {

    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2147483648;
        System.out.println(myPow(x, n));

    }


    public static double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / x * myPow(1 / x, Math.abs(n + 1));
        } else if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else {
            return myPow(x * x, n / 2) * x;
        }
    }
}
