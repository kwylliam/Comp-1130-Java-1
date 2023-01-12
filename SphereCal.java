/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class SphereCal {
  
  
  public static void main(String[] args) { 
 //Get input
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius of the sphere");
    double r=sc.nextDouble();
    
    //Compute volume
    double volume = (4.0/3)*(Math.PI)*(Math.pow(r, 3));
    double area= 4.0*(Math.PI)*(Math.pow(r, 4));
    
    //Output
   DecimalFormat fmt =new DecimalFormat("0.###");
    System.out.println("The volume of the sphere is "+fmt.format(volume) +"\n The surface area of the sphere is "+fmt.format(area));
  }
  
  
}
