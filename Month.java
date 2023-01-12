/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Month {
  
  
  public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of the month");
    int m= sc.nextInt();
    if (m==4 || m==6 || m==9 || m==11)
    {
      System.out.println("The month has 30 days");
    }
    else if  (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
    {
      System.out.println("The month has 31 days");
    }
    else if (m==2)
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the year for which you want to know the number of days in Febrary");
       int year= scan.nextInt();
       if (year % 4 == 0)
         System.out.println("February has 29 days");
       else
         System.out.println("February has 28 days");
    }
    else
      System.out.println("Unknown");
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
