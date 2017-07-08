import java.io.*;
import java.util.*;
public class min
{
  public static void main (String[] args)
  {   
    int a,b,num =0,c=0;;
    String  primeNumbers = "";
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the interval1");
    a = s.nextInt();
    System.out.println("Enter the interval2");
    b=s.nextInt();
    for (int i = a+1; i <b; i++)         
    {           
      
      for(num =i; num>=1; num--)
      {
        if(i%num==0)
        {
          c=c+ 1;
        }
      }
      if (c==2)
      {
        
        primeNumbers = primeNumbers + i + " ";
      } 
    } 
    System.out.println("Prime numbers from "+a+" to "+b+" are :");
    System.out.println(primeNumbers);
  }
}
