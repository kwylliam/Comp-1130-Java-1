/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
import java.util.Random;
public class Username {
  
  
  public static void main(String[] args) { 
    //Get user input
    Scanner name1= new Scanner(System.in);
    System.out.println("Enter your first name ");
    String fname=name1.nextLine();
    
    Scanner name2= new Scanner(System.in);
    System.out.println("Enter your last name ");
    String lname=name2.nextLine();
    
    //Generate username
    Random gen=new Random();
    int num=gen.nextInt(100)+10;
    String usname = fname.substring(0, 1)+lname.substring(0,5)+num;
    System.out.println(usname);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
