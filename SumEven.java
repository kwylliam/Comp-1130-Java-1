import java.util.Scanner;
public class SumEven {
  
  
public static void main(String[] args) { 
  
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer greater than 2");
 int num=sc.nextInt();
 sc.close();
  int sum = 0;
  int t=3;
  if (num<2)
    System.out.println("Error: Number entered was smaller than 2");
   else
     while (t>2 && t <= num)
   {
     if (t%2==0)
       sum+=t;
    }
System.out.println("The sum of all even integers between 2 and "+num+" is  "+sum);
      
  }
  
}
