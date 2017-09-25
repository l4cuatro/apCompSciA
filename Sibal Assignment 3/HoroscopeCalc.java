import java.lang.Math;
import java.util.Scanner;

class HoroscopeCalc {
  public static void main(String[] args) {
    
    int day,
      month;
    
    Scanner Scan = new Scanner(System.in);
    
    System.out.println("On what day were you born (integer)?");
    day = Scan.nextInt();
    System.out.println("In which month were you born (integer)?\ne.g. January = 1, September = 9");
    month = Scan.nextInt();
    if((day > 0 && day <= 31) && (month > 0 && month <= 12)) {
      System.out.print("Your sign is: ");
      switch(month) {
        case 1:
          System.out.println((day <= 19)
            ? "Capricorn"
            : "Aquarius");
        break;
        case 2:
          System.out.println((day <= 18)
            ? "Aquarius"
            : "Pisces");
        break;
        case 3:
          System.out.println((day <= 20)
            ? "Pisces"
            : "Aries");
        break;
        case 4:
          System.out.println((day <= 20)
            ? "Aries"
            : "Taurus");
        break;
        case 5:
          System.out.println((day <= 20)
            ? "Taurus"
            : "Gemini");
        break;
        case 6:
          System.out.println((day <= 20)
            ? "Gemini"
            : "Cancer");
        break;
        case 7:
          System.out.println((day <= 22)
            ? "Cancer"
            : "Leo");
        break;
        case 8:
          System.out.println((day <= 22)
            ? "Leo"
            : "Virgo");
        break;
        case 9:
          System.out.println((day <= 22)
            ? "Virgo"
            : "Libra");
        break;
        case 10:
          System.out.println((day <= 22)
            ? "Libra"
            : "Scorpio");
        break;
        case 11:
          System.out.println((day <= 21)
            ? "Scorpio"
            : "Sagittarius");
        break;
        case 12:
          System.out.println((day <= 21)
            ? "Sagittarius"
            : "Capricorn");
        break;
      }
      System.out.print("Your birthday is: ");
      switch(month) {
        case 1:
          System.out.print("January ");
          break;
        case 2:
          System.out.print("February ");
          break;
        case 3:
          System.out.print("March ");
          break;
        case 4:
          System.out.print("April ");
          break;
        case 5:
          System.out.print("May ");
          break;
        case 6:
          System.out.print("June ");
          break;
        case 7:
          System.out.print("July ");
          break;
        case 8:
          System.out.print("August ");
          break;
        case 9:
          System.out.print("September ");
          break;
        case 10:
          System.out.print("October ");
          break;
        case 11:
          System.out.print("November ");
          break;
        case 12:
          System.out.print("December ");
          break;
      }
      switch(day) {
        case 31:
          System.out.println("thirty-first");
          break;
        case 30:
          System.out.println("thirtieth");
          break;
        case 29:
        case 28:
        case 27:
        case 26:
        case 25:
        case 24:
        case 23:
        case 22:
        case 21:
          System.out.print("twenty-");
          if(day % 10 == 1)
            System.out.println("first");
          else if(day % 10 == 2)
            System.out.println("second");
          else if(day % 10 == 3)
            System.out.println("third");
          else if(day % 10 == 4)
            System.out.println("fourth");
          else if(day % 10 == 5)
            System.out.println("fifth");
          else if(day % 10 == 6)
            System.out.println("sixth");
          else if(day % 10 == 7)
            System.out.println("seventh");
          else if(day % 10 == 8)
            System.out.println("eighth");
          else if(day % 10 == 9)
            System.out.println("ninth");
          break;
        case 20:
          System.out.println("twentieth");
          break;
        case 19:
          System.out.println("nineteenth");
          break;
        case 18:
          System.out.println("eighteenth");
          break;
        case 17:
          System.out.println("seventeenth");
          break;
        case 16:
          System.out.println("sixteenth");
          break;
        case 15:
          System.out.println("fifteenth");
          break;
        case 14:
          System.out.println("fourteenth");
          break;
        case 13:
          System.out.println("thirteenth");
          break;
        case 12:
          System.out.println("twelfth");
          break;
        case 11:
          System.out.println("eleventh");
          break;
        case 10:
          System.out.println("tenth");
          break;
        case 9:
          System.out.println("ninth");
          break;
        case 8:
          System.out.println("eighth");
          break;
        case 7:
          System.out.println("seventh");
          break;
        case 6:
          System.out.println("sixth");
          break;
        case 5:
          System.out.println("fifth");
          break;
        case 4:
          System.out.println("fourth");
          break;
        case 3:
          System.out.println("third");
          break;
        case 2:
          System.out.println("second");
          break;
        case 1:
          System.out.println("first");
          break;
        
      }
    }
    else
      System.out.println("Error");
  }
}
