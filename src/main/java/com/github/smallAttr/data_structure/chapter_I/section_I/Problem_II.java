package com.github.smallAttr.data_structure.chapter_I.section_I;

import java.util.*;

/**
 * @author smallAttr
 * @since 2020-04-04 23:28
 * print stack
 */
public class Problem_II {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (!s.equals("-")) {
                stack.push(s);
            } else if (!s.isEmpty()){
                System.out.println(stack.pop());
            }
        }
    }

    // was best times of the was the it

}
