package com.twopointers;

import java.util.Arrays;
import java.util.Map;

public class PairOfSum {
    public static void main(String[] args) {
        int[] arr = {-5,1,-40,20,6,8,7};
        Arrays.sort(arr);
        usingTwoPtrs(arr, arr.length,15);
    }


    static void bruteForceApproach(int[] array, int length, int targetSum) {
        for(int i=0; i < length-1;i++){
            for(int j=i+1; i < length-1;j++){
                if(array[i] + array[j] == targetSum){
                    System.out.println(" Pair found for target sum is: "+array[i] +" "+ array[j]);
                    break;
                }
            }
        }
    }

    static void usingTwoPtrs(int[] array, int length, int targetSum){
        int l=0,r=length-1;
        while(l < r){
            if((array[l] + array[r])   == targetSum){
                System.out.println(" Pair found for target sum is: "+array[l] +" "+ array[r]);
            }else if(array[l]+array[r] < targetSum){
                l = l+1;
            }else {
                r = r-1;
            }
        }
    }
}
