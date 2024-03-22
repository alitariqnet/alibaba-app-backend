//package com.AlHassanElectronics.Software.Util;
//
//import java.util.Collections;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//import static sun.jvm.hotspot.runtime.BasicObjectLock.size;
//
//public class CollectionsUtils {
//    public static void main(String[] args) {
//
//        Map<String, String> map = Collections.synchronizedMap(new LinkedHashMap<>());
//        map.put("one", "1");
//        map.put("two", "2");
//        map.put("three", "3");
//        map.put("four", "4");
//        map.put("five", "5");
//        System.out.println(map.toString());
//        for (Map.Entry entry : map.entrySet()) {
//            removeEldestEntry(entry);
//        }
//
//        Map<String,String> map1 = new ConcurrentHashMap<>();
//        map1.put("a","1");
//        map1.put("b","2");
//        map1.put("c","3");
//        System.out.println(map1.toString());
//    }
//
//    private static final int MAX_ENTRIES = 100;
//
//    protected static boolean removeEldestEntry(Map.Entry eldest) {
//        return size() > MAX_ENTRIES;
//    }
//}
