import java.util.*;
public class recursion {
  public static double SquareRt(double n, double p) {
    if(n == 0.0) {return 0.0;}
    double guess = 1.0;
    return closer(n, guess);
  }
  public static double closer(double n, double guess) {
    if((guess * guess) / n > 0.9999 && (guess * guess) / n < 1.0001) {
      return guess;
    }
    else {
      return closer(n, (n / guess + guess) / 2);
    }
  }
  public static int fib(int n) {
    return fh(n);
  }
  public static int fh(int n) {
    if(n == 0 || n == 1) {return n;}
    else {return fh(n - 1) + fh(n - 2);}
  }
  public static ArrayList<Integer> makeAllSums(int n) {
    ArrayList<Integer> rew = new ArrayList<Integer>();
    mash(0, n, rew);
    return rew;
  }
  public static void mash(int su, int co, ArrayList<Integer> re) {
    if(co == 0) {re.add(su);}
    else {
      mash(su + co, co - 1, re);
      mash(su, co - 1, re);
    }
  }
  public static void main(String[] args) {
    System.out.println(makeAllSums(4).toString());
  }
}
