/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Subtraction {
  
  
  public static void main(String[] args) { 
   
  //Generate 2 random numbers

  
  //check that a>b
  int start=(int) System.currentTimeMillis();
   
    for(int t=1; t<6; t++){
      int a, b, c, correct, ans;
      a=(int) (Math.random()*10);
      b=(int) (Math.random()*10);
      if (a <= b)
      {c=a;
        a=b;
        b=c;}
  correct=a-b;
  Scanner scan=new Scanner(System.in);
  System.out.println(a+" - "+b+" = ?");
  ans=scan.nextInt();
  
  //Check correctness
  if (ans == correct)
  {System.out.println("Correct");}
  else
  {System.out.println("Wrong. The correct answer is "+correct);}}
  int time= ((int)(System.currentTimeMillis())-start); 
  System.out.println("Time taken: "+ (time/1000)+" seconds");
  }}
                       
                  
  
  
    
   