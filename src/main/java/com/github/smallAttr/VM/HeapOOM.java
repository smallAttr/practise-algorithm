package com.github.smallAttr.VM;

import java.util.*;

/**
 * @author smallAttr
 * @since 2019-12-27 16:00
 */
public class HeapOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
