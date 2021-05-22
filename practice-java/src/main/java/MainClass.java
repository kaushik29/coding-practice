import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * This is the fist class
 * Author @kaushik29
 * */
public class MainClass {

  private static final Logger logger = Logger.getLogger(MainClass.class);

  public static void main(String[] args) throws InterruptedException {
    // just a formally first commit with hello world
String om1 = new String("morgan");
om1 = null;
System.gc();
Thread.sleep(1000);
System.out.println("enid");
Object[] objects = { new Integer(1), new String("aa"), new Boolean(true)};

Arrays.sort(objects);
    for (int i = 0; i < objects.length; i++) {
      System.out.println(objects[i].toString());
    }
long[] aa = {1,23,4};
long[] bb = fix(aa);
System.out.println(Arrays.toString(aa));
System.out.println(Arrays.toString(bb));

//    logger.info("Hello world");
//    Integer s= 5;
//    Short s1 = 5;
//    Integer s2 = 5;
//
//    logger.info("this is "+s.equals(s1));
//    logger.info("this is "+s.equals(s2));
////    MainClass mainClass = new MainClass();
////    logger.info(mainClass.isPalindrome(99999));
//    List<String> stringList = new ArrayList<String>();
//    stringList.add("aaa");
//    stringList.add("bbb");
//
//    logger.info("this is array "+ Arrays.toString(stringList.toArray(stringList.toArray(new String[stringList.size()]))));

  }

  private static long[] fix(long[] aa) {
    aa[2] = 8;
    return aa;
  }

  @Override
  protected void finalize(){
    System.out.println("MMMMMM");
  }
  public boolean isPalindrome(int x) {
    if(x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }

    int revertedNumber = 0;
    while(x > revertedNumber) {
      revertedNumber = revertedNumber * 10 + x % 10;
      x /= 10;
//      logger.info("x" +x );
//      logger.info("revertedNumber" +revertedNumber );
    }
//  logger.info("X is "+x+ " and the revertedNumber is "+revertedNumber);
    return x == revertedNumber || x == revertedNumber/10;
  }
}
