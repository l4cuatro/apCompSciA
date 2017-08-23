import java.lang.Math;
import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
    int secsSinceEpoch,
      secsRemainder;
    
    int[] secsPer = new int[5];
    
    secsPer[4] = 60; //Minutes
    
    secsPer[3] = secsPer[4] * 60; //Hours
    
    secsPer[2] = secsPer[3] * 24; //Days
    
    secsPer[1] = secsPer[2] * 30; //Months
    
    secsPer[0] = secsPer[1] * 12; //Years
    
    int[] since = new int[6];
    
    Scanner Scan = new Scanner(System.in);
    
    System.out.print("Seconds Since Unix Epoch:");
    
    secsRemainder = secsSinceEpoch = Scan.nextInt();
    
    for(int i = 0; i < secsPer.length; i++) {
      since[i] = (int)Math.floor(secsRemainder / secsPer[i]);
      
      secsRemainder %= secsPer[i];
      
    }
    
    since[5] = secsRemainder;
    String[] outStr = new String[6];
    
    outStr[0] = "Year: " + (since[0] + 1970);
    outStr[1] = "Month: " + since[1];
    outStr[2] = "Day: " + since[2];
    outStr[3] = "Hour: " + since[3];
    outStr[4] = "Min: " + since[4];
    outStr[5] = "Sec: " + secsRemainder;
    
    for(int i = 0; i < outStr.length; i++)
      System.out.println(outStr[i]); 
    
  }
}
