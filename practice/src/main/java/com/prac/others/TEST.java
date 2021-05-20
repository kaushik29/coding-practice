package com.prac.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface A{void x();}
class B implements A{public void x(){} public void y(){} }
class C extends B{public void x(){} }

public class TEST extends  Thread {

  public static void main(String[] args) {
    long[] aa = {1,2,3,4};
    long[] bb = fixme(aa);
    System.out.println("aaaaaaaaaaaaaaa"+ Arrays.toString(aa));
    System.out.println("bbbbbbbbbbbbbbbbb"+Arrays.toString(bb));
  }

  private static long[] fixme(long[] aa) {
    aa[2] = 99;
    return aa;
  }
  //
//  private static int x;
//  public synchronized void doThings(){
//    int aa= x;
//    aa++;
//    x= aa;
//    System.out.println(x);
//  }
//  public void run(){
//    doThings();
//  }
}
