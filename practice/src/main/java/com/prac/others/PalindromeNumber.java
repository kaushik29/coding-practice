package com.prac.others;

import org.apache.log4j.Logger;

/*
 * kaushik29
 * leetcode-9
 * */
public class PalindromeNumber {

  private static final Logger logger = Logger.getLogger(PalindromeNumber.class);

  public boolean isPalindrome(int x) {
    logger.debug("The number input for Palindrome check  --> " + x);
    //if its negative, ends with 0 its not palindrome
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }
    //basically we are divinding the number in two things, and making one part reversed at the same time.
    int revertedNumber = 0;
    while (x > revertedNumber) {
      //get the last character of the number and adding in the last
      revertedNumber = revertedNumber * 10 + x % 10;
      //remove the last number from the actual number to keep getting different last number
      x /= 10;
      logger.debug("The revertedNumber =" + revertedNumber + " and the x=" + x);
    }
    logger.debug("before returning The revertedNumber =" + revertedNumber + " and the x=" + x);
    //once we got the distribution of the number more than just equal, compare.
    // if number is even number both are same,
    // else last number in revertedNumber will be the middle of the actual number so we can skip and compare
    return x == revertedNumber || x == revertedNumber / 10;
  }
}
