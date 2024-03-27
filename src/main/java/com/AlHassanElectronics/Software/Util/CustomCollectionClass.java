package com.AlHassanElectronics.Software.Util;

import java.util.Arrays;
import java.util.List;

public class CustomCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j) && i != j) {
                    list.remove(j);
                }
            }
            System.out.println(list);

        }
    }
}
