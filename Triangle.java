/**
 * Auto Generated Java Class.
 */
//William Mwangi
import java.util.Scanner;
public class Triangle {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three angles of a triangle. Separate with a space.");
double alpha=sc.nextDouble();
double beta=sc.nextDouble();
double theta=sc.nextDouble();

double sum= alpha + beta + theta;

//check validity and right angle
if (sum != 180.0)
  System.out.println("The angles entered do not result in a valid triangle");
else if(alpha==90.0 || beta==90.0 || theta==90.0)
  System.out.println("This is a valid right triangle");
else
  System.out.println("This is a valid triangle");

    

    
  }
  
  /* ADD YOUR CODE HERE */
  
}
