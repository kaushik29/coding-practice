package com.prac.others;

import org.apache.log4j.Logger;

public class FactorialTrailingZero {

  private static final Logger logger = Logger.getLogger(FactorialTrailingZero.class);

  public int trailingZeroes(int number) {
    logger.debug("The number input for facto check  --> " + number);

    int count = 0;
    while (number > 4) {
      //the reason we are finding 5 here is explained after code in detail.
      number /= 5;
      count += number;
    }

    return count;
  }

}
/*
 *  we want to find the trailing zeros so we need to think when we will have trailing zero in the any factorials answer,
 *  ANS: whenver we find the factorial and in the process
 *   i.e X! = x*(x-1)*(x-2).....*1
 *   in suh case when we have somewhere in the calculation 5, it will give us the 0 trailing, (because 5*2 will become 10*(rest of the numbers))
 * we dont have to worry about even numbers as every 2nd number will be even/divisible by 2
 *  now for all the number more then 4 will have atleast one trailing zero
 *  for calculating the for more trailing, basically  we want to check occurrence of 5 in the factorial,
 *  i.e in 15! 15*14*13*12*11*10*9*8*7*6*5*4*3*2*1
 *           = (3*5)*14*13*12*11*(2*5)*9*8*7*6*5*4*3*2*1
 *  you can see the number of 5's in the above example is 3 and the 15! = 1307674368000 (three trailing zeros!!!)
 * */