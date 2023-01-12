/**
 * Auto Generated Java Class.
 */
//William Mwangi
import java.util.Scanner;
public class Students {
  
  
  public static void main(String[] args) {
    
Scanner scan= new Scanner(System.in);
System.out.println("Enter your year of study at university");
int year=scan.nextInt(); //assumes that the user will enter an integer

switch(year)
{
  case 1:
    System.out.println("Freshman");
    break;
  case 2:
    System.out.println("Sophomore");
    break;
  case 3:
    System.out.println ("Junior");
    break;
  case 4:
    System.out.println ("Senior");
    break;
  default:
    if (year > 4)
    System.out.println ("Grad Student");
    else
      System.out.println("Unknown");
}



    
  }
  
}
