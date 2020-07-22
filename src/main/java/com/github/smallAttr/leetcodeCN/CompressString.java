package com.github.smallAttr.leetcodeCN;

/**
 * @author smallAttr
 * @since 2020-03-16 14:52
 */
public class CompressString {

    public static void main(String[] args) {

        final String str = "aabcccccaaa";
//        System.out.println(compressString(str));

        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        System.out.printf("%.5f\n", t);


    }

    public static String compressString(String S) {
        if (S == null || S.length() == 0) {
            return S;
        }
        int sourceLen = S.length();
        StringBuffer stringBuffer = new StringBuffer();
        char previous = S.charAt(0);
        int count = 1;
        for (int i = 1; i < sourceLen; i++) {
            if (S.charAt(i) == previous) {
                count++;
            } else {
                stringBuffer.append(previous).append(count);
                previous = S.charAt(i);
                count = 1;
            }
        }
        stringBuffer.append(previous).append(count);
        int targetLen = stringBuffer.toString().length();
        return targetLen < sourceLen ? stringBuffer.toString() : S;
    }
}
