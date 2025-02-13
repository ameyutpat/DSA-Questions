package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        Arrays.stream(twoSum(arr,6)).forEach(data-> System.out.println(data + " "));
    }

    // brute force with time complexity = o(n^2)
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i < nums.length;i++){
            int remainingValue = target - nums[i];
            for(int j=1; j < nums.length;j++){
                if(nums[j] == remainingValue){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSumWithMap(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i < nums.length;i++){
            int remainingValue = target - nums[i];
            if(map.containsKey(remainingValue)){
                return new int[]{map.get(remainingValue),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }

    public static int[] twoSumWithJavaStreams(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        return IntStream.range(0, nums.length).mapToObj(data -> {
            int remainingValue = target - nums[data];
            if(map.containsKey(remainingValue)){
                return new int[]{data,map.get(remainingValue)};
            }else {
                map.put(nums[data],data);
                return null;
            }
        }).filter(Objects :: nonNull).findFirst().orElseThrow(() -> new IllegalArgumentException("No solution found.."));
    }


}
