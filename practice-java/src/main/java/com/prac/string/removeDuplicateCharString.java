package com.prac.string;

import java.util.HashSet;
import java.util.Iterator;

/*
*How to remove all duplicates from a given string?
*/

public class removeDuplicateCharString {

    public static void main(String[] args) {

        String str = "KAUSHIK";
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0 ; i <str.length();i++) {
            hashSet.add(str.charAt(i));
        }
        Iterator<Character> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            stringBuilder.append(iterator.next());
        }
        System.out.println(stringBuilder.toString());
    }


}
