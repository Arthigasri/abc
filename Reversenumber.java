# abc

import java.util.*;
import java.io.*; 
public class Reversenumber
{   
  public static void main(String args[])  
  {
  int a, b, c = 0,d;
  Scanner s = new Scanner(System.in);
  System.out.println("Enter any reverse number");
  a = s.nextInt();
  b= a;
    while(a > 0)
  {
    d = a % 10;
    c = c* 10 + d;
    a = a/ 10;
  }
  if(c == b)
  {
    System.out.println("Given number "+b+" is Palindrome");
  }
  else
  {
    System.out.println("Given number "+b+" is Not Palindrome");
  }
}
}
  
