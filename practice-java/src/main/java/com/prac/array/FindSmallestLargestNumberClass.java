package com.prac.array;

import org.apache.log4j.Logger;

public class FindSmallestLargestNumberClass {

  private static final Logger logger = Logger.getLogger(FindSmallestLargestNumberClass.class);

  public void findSamllestLargestNumber(int[] arr){

    int largetNum = arr[0];
    int smallestNum = arr[0];
    for (int num: arr) {
      if (num > largetNum){
        largetNum = num;
      }else if(num < smallestNum){
        smallestNum = num;
      }
    }
    System.out.println("Larget number in the array is "+largetNum);
    System.out.println("Smallest number in the array is "+smallestNum);
  }
}
