import java.util.Scanner;
import java.lang.Math;

public class Main {
 static int[] webRevs = new int[3];
 static double[] focusRates = new double[2];
 static double criticRev;
 static double[] avgs = new double[3];
 static double[] avgWts = { .2, .3, .5 };
 
 public static int getWebRev(int arrVal) {
  if(arrVal >= 0 && arrVal < 3)
   return webRevs[arrVal];
  return Integer.MIN_VALUE;
 }
 
 public static double getFocusRate(int arrVal) {
  if(arrVal >= 0 && arrVal < 2)
   return focusRates[arrVal];
  return Integer.MIN_VALUE;
 }
 
 public static double getCriticRev() {
  return criticRev;
 }
 
 public static double getAvgs(int arrVal) {
  if(arrVal >= 0 && arrVal < 2)
   return avgs[arrVal];
  return Integer.MIN_VALUE;
 }
 
 public static int setWebRev(int arrVal, int val) {
  if(arrVal >= 0 && arrVal < 3)
   return webRevs[arrVal] = val;
  return Integer.MIN_VALUE;
 }
 
 public static double setFocusRate(int arrVal, double val) {
  if(arrVal >= 0 && arrVal < 2)
   return focusRates[arrVal] = val;
  return Integer.MIN_VALUE;
 }
 
 public static double setCriticRev(double val) {
  return criticRev = val;
 }
 
 public static double setAvg(int arrVal, double val) {
  if(arrVal >= 0 && arrVal < 3)
   return avgs[arrVal] = val;
  return Integer.MIN_VALUE;
 }
 
 private Scanner Scan = new Scanner(System.in);
 
 public static void main(String[] args) {
  Scanner Scan = new Scanner(System.in);
  System.out.println("Please enter ratings from the movie review website.");
  for(int i = 0; i < 3; i++) {
   System.out.println("Number: " + (i + 1));
   setWebRev(i, Scan.nextInt());
  }
  
  System.out.println("Please enter ratings from the focus group.");
  for(int i = 0; i < 2; i++) {
   System.out.println("Number: " + (i + 1));
   setFocusRate(i, Scan.nextDouble());
  }
  
  System.out.println("Please enter the average movie critic rating.");
  setCriticRev(Scan.nextDouble());
  
  
  for(int i = 0; i < 3; i++)
    setAvg(0, (getAvgs(0) + getWebRev(i)));
  setAvg(0, (getAvgs(0) / 3.0));
  setAvg(1, (getFocusRate(0) + getFocusRate(1)) / 2.0);
  setAvg(2, (avgs[0] * avgWts[0]) + (avgs[1] * avgWts[1]) + (criticRev * avgWts[2]));
  System.out.println("Average website rating: " + avgs[0]);
  System.out.println("Average focus group rating: " + avgs[1]);
  System.out.println("Average movie critic rating: " + criticRev);
  System.out.println("Overall movie rating: " + avgs[2]);
 }
}
