/**
 * Auto Generated Java Class.
 */
//Import package
import java.util.Scanner;
public class Change {
  
  public Change() { 
  }
  
  public static void main(String[] args) { 
  // declare data types
    int dollar, quarter, dime, nick, penny;
   
    //Get user input
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount of change required for example 11.56");
    double change=sc.nextDouble();
    
    //Perform computation
    dollar =(int)change;
    double rem= change-dollar;
    quarter=(int) (rem/0.25);
    rem=rem-(quarter*0.25);
    dime=(int)(rem/0.10);
    rem=rem-(dime*0.10);
    nick= (int) (rem/0.05);
    rem=rem-(nick*0.05);
    penny=(int) (rem/0.01);
    
    //Set up output
    System.out.println( dollar+" dollars\n"+quarter+" quaters\n"+dime+" dimes\n"+nick+" nickels\n"+penny+" pennies");
                         
    
      
      
      
      
     
      
  }
  
  /* ADD YOUR CODE HERE */
  
}
