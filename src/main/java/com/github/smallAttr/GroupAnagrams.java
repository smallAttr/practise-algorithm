package com.github.smallAttr;

import java.util.*;
import java.util.stream.*;

/**
 * @author smallAttr
 * @since 2019-12-25 18:22
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strings);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        int length = strs.length;

        List<String> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String str = strs[i];
            int len = str.length();
            List<Integer> anotherList = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                anotherList.add(str.charAt(j) - '0');
            }
            Collections.sort(anotherList);
            String value = anotherList.stream().map(item -> String.valueOf(item)).collect(Collectors.joining(""));
            list.add(value);
        }
        Set<String> set = new HashSet<>(list);
        int listSize = list.size();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            List<String> stringList = new ArrayList<>();
            for (int j = 0; j < listSize; j++) {
                if (list.get(j).equals(value)) {
                    stringList.add(strs[j]);
                }
            }
            result.add(stringList);
        }
        return result;
    }
}
