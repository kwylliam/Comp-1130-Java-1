/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Coordinates {
  
  
  public static void main(String[] args) { 
    double x1, x2, y1, y2, dx, dy, distance;
  //Get data
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your x-y coordinates in the format: x y");
    x1=(double) sc.nextDouble();
    y1=(double)sc.nextDouble();
     Scanner scan=new Scanner(System.in);
     
    System.out.println("Enter another set of x-y coordinates in the format: x y");
    x2=(double) scan.nextDouble();
    y2=(double)scan.nextDouble();
    
    //Compute distance
    dx=Math.pow((x2-x1), 2);
    dy=Math.pow((y2-y1), 2);
    distance=Math.sqrt(dx+dy);
    
    //Output
    System.out.println("The distance between "+"("+x1+", "+y1+")"+" and"+"("+x2+", "+y2+") is "+distance);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
