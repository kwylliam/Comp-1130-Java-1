/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Hexagon {
  
  
  public static void main(String[] args) { 
    //Get input
    Scanner alpha=new Scanner(System.in);
    System.out.println("Enter the lenght of a side: ");
    double side=alpha.nextDouble();
    
    //Compute Area
    double factor, area;
    factor=(3.0*Math.sqrt(3))/2.0;
    area=factor*(Math.pow(side, 2));
    
    //Set up output
    System.out.println("The area of the hexagon is "+ area);
    
  }
  
}
