/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Calc {
  
  
  public static void main(String[] args) { 
    //Data type declaration
    double sum, product, difference;
    
    //Input setup
    Scanner num=new Scanner(System.in);
    System.out.println("Enter a a number" );
   float num1=num.nextFloat();
    Scanner number=new Scanner(System.in);
      System.out.println("Enter another number" );
    float num2=number.nextFloat();
    
    //Coputation
    sum=num1+num2;
    difference=num1-num2;
    product=num1*num2;
    
    //Output setup
    System.out.println(num1+"+"+num2+"="+sum+"\n"+num1+"-"+num2+"="+difference+"\n"+num1+"*"+num2+"="+product+"\n");
      
  }
  
  
}
