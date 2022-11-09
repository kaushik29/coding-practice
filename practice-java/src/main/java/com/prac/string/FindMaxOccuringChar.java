package com.prac.string;

/*
Find maximum occurring character in a string
* /

 */
public class FindMaxOccuringChar {

    public static void main(String[] args) {

        String str = "KAUSHIK";
        int[] arr = new int[256];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        int maxNumber = -1;
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {
            char currentStr = str.charAt(i);
            if (maxNumber < arr[currentStr]) {
                maxNumber = arr[currentStr];
                result = currentStr;
            }
        }
        System.out.println("char ->" + result + "<-  has occurance of " + maxNumber);
    }
}
