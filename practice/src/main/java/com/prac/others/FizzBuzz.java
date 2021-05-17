package com.prac.others;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class FizzBuzz {

  private static final Logger logger = Logger.getLogger(FizzBuzz.class);

  public List<String> fizzBuzz(int n) {
    logger.debug("got the number of integer te be printed " + n);

    List<String> fizzBuzzList = new ArrayList<String>();
    for (int i = 1; i <= n; i++) {
      logger.debug("current number is -->" + i);
      if ((i % 3 == 0) && (i % 5 == 0)) {
        fizzBuzzList.add("FizzBuzz");
      } else if (i % 3 == 0) {
        fizzBuzzList.add("Fizz");
      } else if (i % 5 == 0) {
        fizzBuzzList.add("Buzz");
      } else {
        fizzBuzzList.add(String.valueOf(i));
      }
      logger.debug("The Updated list " + fizzBuzzList.toString());
    }
    return fizzBuzzList;
  }
}
