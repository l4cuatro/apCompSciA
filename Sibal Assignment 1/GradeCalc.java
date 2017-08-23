import java.util.Scanner;
import java.lang.Math;

class GradeCalc {
  
  static double[] testScore = new double[3];
  static int[] quizScore = new int[2];
  static double hwAvg;
  static double[] weight = new double[3];
  static double[] scoreAvg = new double[2];
  static double grade;
  
  static protected void setWts(double weight1, double weight2, double weight3) {
    weight[0] = weight1;
    weight[1] = weight2;
    weight[2] = weight3;
    return;
  }
  
  static private double calcAvg(int[] vals) {
    int sum = 0;
    for(int i = 0; i < vals.length; i++)
      sum += vals[i];
    return (double)(1.0 * sum / vals.length);
  }
  
  static private double calcAvg(double[] vals) {
    double sum = 0;
    for(int i = 0; i < vals.length; i++)
      sum += vals[i];
    return (double)(1.0 * sum / vals.length);
  }
  
  public static void main(String[] args) {
    
    Scanner Scan = new Scanner(System.in);
    
    setWts(.4, .35, .25);
    
    //Prompt & receive test scores
    System.out.print("\nPlease enter your test scores: ");
    for(int i = 0; i < testScore.length; i++) {
      System.out.print("\nScore " + (i + 1));
      testScore[i] = Scan.nextDouble();
    }
    
    //Prompt & receive quiz scores
    System.out.print("\nPlease enter your quiz scores: ");
    for(int i = 0; i < quizScore.length; i++) {
      System.out.print("\nScore " + (i + 1));
      quizScore[i] = Scan.nextInt();
    }
    
    //Prompt & receive homework average input
    System.out.print("\nPlease enter your homework average: ");
    hwAvg = Scan.nextDouble();
    
    scoreAvg[0] = calcAvg(testScore);
    scoreAvg[1] = calcAvg(quizScore);
    
    grade = scoreAvg[0] * weight[0] + scoreAvg[1] * weight[1] + hwAvg * weight[2];
    
    System.out.println("\nTest Average: " + scoreAvg[0]);
    System.out.println("Quiz Average: " + scoreAvg[1]);
    System.out.println("Final Grade: " + grade);
    
  }
}
    
