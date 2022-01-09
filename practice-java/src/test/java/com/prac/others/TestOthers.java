package com.prac.others;

import java.util.List;
import org.apache.log4j.Logger;
import org.junit.Test;

import com.prac.array.FindSmallestLargestNumberClass;

public class TestOthers {

  private static final Logger logger = Logger.getLogger(TestOthers.class);

  @Test
  public void testFizzBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int inputNumber = 15;
    List<String> respondList = fizzBuzz.fizzBuzz(inputNumber);
    logger.info(respondList);
  }

  @Test
  public void testPalindromeNumber() {

    PalindromeNumber palindromeNumberTest = new PalindromeNumber();
    Boolean postiveUseCase = palindromeNumberTest.isPalindrome(123454321);
    Boolean negativeUseCase = palindromeNumberTest.isPalindrome(1234121);
    if (negativeUseCase == false && postiveUseCase == true) {
      logger.info("its working fine");
    }
  }

  @Test
  public void testFactorialTrailingZero() {

    FactorialTrailingZero factorialTrailingZero = new FactorialTrailingZero();
    int number = 12;
    logger.info("trailing zeros in the number " + number + " factorial's is " + factorialTrailingZero
        .trailingZeroes(number));

  }

  @Test
  public void testFindSmallestLargestNumberClass(){
    FindSmallestLargestNumberClass findNumbObj =  new FindSmallestLargestNumberClass();
    int[] arr = new int[]{1,2,9,3,4,5,6,11,23,55,77,11,223,6,};
    findNumbObj.findSamllestLargestNumber(arr);
  }
}
