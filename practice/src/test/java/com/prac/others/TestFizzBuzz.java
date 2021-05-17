package com.prac.others;

import java.util.List;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TestFizzBuzz {

  private static final Logger logger = Logger.getLogger(TestFizzBuzz.class);

  @Test
  public void testFizzBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int inputNumber = 15;
    List<String> respondList = fizzBuzz.fizzBuzz(inputNumber);
    logger.info(respondList);
  }
}
