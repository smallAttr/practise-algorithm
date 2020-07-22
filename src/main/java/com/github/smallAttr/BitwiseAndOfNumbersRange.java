package com.github.smallAttr;

/**
 * @author smallAttr
 * @since 2020-01-03 16:23
 */
public class BitwiseAndOfNumbersRange {

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(11, 15));
    }


    public static int rangeBitwiseAnd(int m, int n) {
        int count = 0;
        while(m != n){
            m >>= 1;
            n >>= 1;
            count ++;
        }
        return (m << count);
    }
}
