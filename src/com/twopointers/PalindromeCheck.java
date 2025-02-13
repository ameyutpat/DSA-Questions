package com.twopointers;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        checkIsPalindrome(input);
    }

    private static void checkIsPalindrome(String input) {
        char[] charArray = input.toCharArray();
        int start =0;
        int end= charArray.length-1;
        boolean isPalindrome = true;
        while(start <= end){
            if(charArray[start] != charArray[end]){
                System.out.println(""+input + " is not a palindrome.");
                isPalindrome=false;
                break;
            }else{
                start++;
                end--;
            }
        }
        if(isPalindrome){
            System.out.println(""+input + " is a palindrome.");
        }
    }
}
