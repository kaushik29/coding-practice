package com.prac.array;

import org.apache.log4j.Logger;

public class FindSmallestLargestNumberClass {

  private static final Logger logger = Logger.getLogger(FindSmallestLargestNumberClass.class);

  public int[] findSamllestLargestNumber(int[] arr){

    int largetNum = arr[0];
    int smallestNum = arr[0];
    for (int num: arr) {
      if (num > largetNum){
        largetNum = num;
      }else if(num < smallestNum){
        smallestNum = num;
      }
    }
    return new int[]{smallestNum,largetNum};
  }
}
