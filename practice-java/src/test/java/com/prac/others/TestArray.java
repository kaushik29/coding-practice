package com.prac.others;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.prac.array.FindSmallestLargestNumberClass;
import com.prac.array.RemoveDuplicatesFromSortedArray;

public class TestArray {
  private static final Logger logger = Logger.getLogger(TestArray.class);

  @Test
  public void testFindSmallestLargestNumberClass(){
    FindSmallestLargestNumberClass findNumbObj =  new FindSmallestLargestNumberClass();
    int[] arr = new int[]{1,2,9,3,4,5,6,11,23,55,77,11,223,6};
    arr  = findNumbObj.findSamllestLargestNumber(arr);
    Assert.assertEquals(1,arr[0]);
    Assert.assertEquals(223,arr[1]);
    System.out.println(Arrays.toString(arr));
  }

  @Test
  public void testRemoveDuplicatesFromSortedArray(){
// leetcode-26
    int[] arr = new  int[]{1,2,3,4,6,7,7,8,8,8};
    Assert.assertEquals(7, RemoveDuplicatesFromSortedArray.removeDuplicates(arr));
  }

}
