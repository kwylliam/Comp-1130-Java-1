/**
 * Auto Generated Java Class.
 */
//import the package
import java.util.Scanner;
  
public class Converter {
  
  
  public static void main(String[] args) { 
  //declare data types
    double pounds, kg;
    
    //Get user input
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number of pounds");
    
    //Assign input to a variable
    pounds= sc.nextDouble();
    
    //Perform computation
    kg=pounds*0.454;
    
    //Set up output
    System.out.println(pounds+" pounds ="+kg+" kilograms");
      
    
      
      
      
  }
  
  /* ADD YOUR CODE HERE */
  
}
