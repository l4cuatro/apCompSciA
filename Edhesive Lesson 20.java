/*
 * Lesson 20 Coding Activity 
 * 
 * Computer science jobs are in demand. Right now we have a shortage 
 * of people that can do computer programming, and one of the fastest
 * growing areas of new jobs in the sector are so-called hybrid jobs. 
 * This means you specialize in an area like biology, 
 * and then use computer programming to do your job. 
 * 
 * These hybrid jobs exist in the arts, sciences,
 * economics, healthcare, and entertainment fields.
 * 
 * One of these jobs is computational biology. Computational Biology, 
 * sometimes referred to as bioinformatics, is the science of 
 * using biological data to develop algorithms and relations
 * among various biological systems.
 * 
 * In this lab we are going to investigate the data from a
 * grey seal named Gracie. WeÕll input the longitude and
 * latitude data from a tracking device. We want to investigate 
 * the farthest north, south, east and west Gracie has been.
 * 
 * We will use the latitude to measure this.
 * Write a program to enter GracieÕs longitude and Latitude data. 
 * Each time through the loop it should ask if you want to continue. 
 * Enter 1 to repeat, 0 to stop.
 * 
 * Any value for latitude not between -90 and 90 inclusive should be ignored.
 * 
 * Any value for longitude not between -180 and 180 inclusive should be ignored.
 *
 *
 *          Sample Run:
 *
 *              Please enter the latitude:
 *              41.678
 *              Please enter the longitude:
 *              69.938
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.755
 *              Please enter the longitude:
 *              69.862
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.829
 *              Please enter the longitude:
 *              69.947
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              300
 *              Please enter the longitude:
 *              69.947
 *              Incorrect Latitude or Longitude
 *              Please enter the latitude:
 *              41.827
 *              Please enter the longitude: 
 *              69.904
 *              Would you like to enter another location?
 *              0
 *              Farthest North: 41.829
 *              Farthest South: 41.678
 *              Farthest East: 69.947  
 *              Farthest West: 69.862
 *   
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_20_Activity{
  
  static double fmaxf(double in1, double in2) {
    return (in1 > in2)
      ? in1
      : in2;
  }
  
  static double fminf(double in1, double in2) {
    return (in1 < in2)
      ? in1
      : in2;
  }
  
    public static void main(String[] args)
     {
/*
 * Write your code here
 * Copy and paste your entire program to Code Runner
 * to complete the activity, from the first import statement
 * to the last bracket.
 */
      
      Scanner Scan = new Scanner(System.in);
      
      double maxLat = 0,
        minLat = 0,
        maxLong = 0,
        minLong = 0;
      
      int cont;
      
      do {
        
        System.out.println("Please enter the latitude:");
        double inLat = Scan.nextDouble();
        System.out.println("Please enter the longitude:");
        double inLong = Scan.nextDouble();
        
        if(Math.abs(inLat) <= 90) {
          maxLat = fmaxf(maxLat, inLat);
          minLat = fminf(minLat, inLat);
        }
        if(Math.abs(inLong) <= 180) {
        maxLong = fmaxf(maxLong, inLong);
        minLong = fminf(minLong, inLong);
        }
        System.out.println("Would you like to enter another location?");
        cont = Scan.nextInt();
      } while(cont != 0);
      
      System.out.println("Farthest North: " + maxLat);
      System.out.println("Farthest South: " + minLat);
      System.out.println("Farthest East: " + maxLong);
      System.out.println("Farthest West: " + minLong);
      
      
    }
}
