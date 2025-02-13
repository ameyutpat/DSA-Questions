package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicates {

    public static void main(String[] args) {
        int[] arr = {2,3,2,2,7,6,6,3};
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i=0;i < arr.length; i++){
            if(countMap.containsKey(arr[i])){
                countMap.put(arr[i],countMap.get(arr[i])+1);
            }else {
                countMap.put(arr[i], 1);
            }
        }
        System.out.println(countMap);
    }
}
