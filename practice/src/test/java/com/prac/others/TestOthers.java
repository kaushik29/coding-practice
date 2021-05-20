package com.prac.others;

import java.util.List;
import org.apache.log4j.Logger;
import org.junit.Test;


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
    Boolean negatvieUseCase = palindromeNumberTest.isPalindrome(1234121);
    if (negatvieUseCase == false && postiveUseCase == true) {
      logger.info("its working fine");
    }
  }
}
