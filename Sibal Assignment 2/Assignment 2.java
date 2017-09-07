import java.util.*;
import java.lang.*;
  
class Assignment2 {
  
  public static void println(String Str) {
    System.out.println(Str);
  }
  
  public static void print(String Str) {
    System.out.print(Str);
  }
  
  public static void main(String[] args) {
    
    double paidDbl,
      owedDbl,
      changeDbl;
    
    int paidInt,
      owedInt,
      changeInt,
      pennies,
      nickels,
      dimes,
      quarters,
      changeCalc;
    
    Scanner Scan = new Scanner(System.in);
    
    println("Amount Paid: ");
    paidDbl = Scan.nextDouble();
    
    println("Amount Owed: ");
    owedDbl = Scan.nextDouble();
    
    paidInt = (int)(Math.round(paidDbl * 100.0));
    //println("paidInt = " + paidInt);
    owedInt = (int)(Math.round(owedDbl * 100.0));
    //println("owedInt = " + owedInt);
    
    changeCalc = changeInt = paidInt - owedInt;
    println("changeInt = " + changeInt);
    
    changeDbl = (double)(changeInt / 100.0);
    println("Change: " + changeDbl);
    
    quarters = (int)(Math.floor(changeCalc / 25));
    changeCalc %= 25;
    println("Quarters: " + quarters);
    //println("changeCalc = " + changeCalc);
    
    dimes = (int)(Math.floor(changeCalc / 10));
    changeCalc %= 10;
    println("Dimes: " + dimes);
    //println("changeCalc = " + changeCalc);
    
    nickels = (int)(Math.floor(changeCalc / 5));
    changeCalc %= 5;
    println("Nickels: " + nickels);
    //println("changeCalc = " + changeCalc);
    
    pennies = changeCalc;
    println("Pennies: " + pennies);
  }
}
