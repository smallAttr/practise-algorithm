package com.github.smallAttr;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-08-26 17:30
 */
public class SubstringWithConcatenationOfAllWords {

    public static void main(String[] args) {
        List<Integer> list = findSubstring("barfoothefoobarman", new String[]{"foo","bar"});
        list.stream().forEach(System.out::println);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        if (s == null || s.length() == 0 || words.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> targetList = new ArrayList<>();
        int len = s.length();
        int listLen = words.length;
        int wordLength = words[0].length();
        Map<String, Integer> map = new HashMap<>();
        Set<Character> firstCharSet = new HashSet<>();
        for (int i = 0; i < listLen; i++) {
            firstCharSet.add(words[i].charAt(0));
            int value = map.getOrDefault(words[i], 0);
            map.put(words[i], ++value);
        }
        int wordCharLen = wordLength * listLen;
        int flag = 0;
        for (int i = 0; i <= len - wordCharLen; i++) {
            if (!firstCharSet.contains(s.charAt(i))) {
                continue;
            }
            String substring = s.substring(i, i + wordCharLen);
            List<String> list = splitString(substring, wordLength);
            int size = list.size();
            for (int j = 0; j < size; j++) {
                String target = list.get(j);
                if (map.get(target) != null && map.get(target) != 0) {
                    ++flag;
                    Integer value = map.get(target);
                    map.put(target, --value);
                }
                else {
                    break;
                }
            }
            if (flag == size) {
                targetList.add(i);
            }
            flag = 0;
            map = resetMap(words);
        }
        return targetList;
    }

    private static List<String> splitString(String substring, int wordLength) {
        List<String> list = new ArrayList<>();
        int length = substring.length();
        for (int i = 0; i < length; i += wordLength) {
            list.add(substring.substring(i, i + wordLength));
        }
        return list;
    }


    private static Map<String, Integer> resetMap(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int length = words.length;
        for (int i = 0; i < length; i++) {
            int value = map.getOrDefault(words[i], 0);
            map.put(words[i], ++value);
        }
        return map;
    }

}
