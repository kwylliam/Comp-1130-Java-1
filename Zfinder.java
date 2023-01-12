/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Zfinder {
public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a word");
 String name=sc.nextLine();
 int num=0;
 int i;
 int ind=name.indexOf("z");
 if (ind== -1)
 {
  System.out.println(" No occurrence of z found");
 }
 else
   do
  {
    i=ind;
    ind=name.indexOf("z", i);
    num+=1;  
  }
  while(ind != -1);
System.out.println(num);
}}


  
