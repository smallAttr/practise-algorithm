package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-12-27 10:23
 */
public class WordBreak {
    public static void main(String[] args) {
        String s = "catsandog";
        String[] strings = {"cats", "dog", "sand", "and", "cat"};
        wordBreak(s, Arrays.asList(strings));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict == null) {
            return false;
        }
        int size = wordDict.size();
        if (size == 0) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (s.contains(wordDict.get(i))) {
                s = s.replace(wordDict.get(i), "");
            } else {
                return false;
            }
        }
        return true;
    }
}
