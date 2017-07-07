# abc
import java.io.*;
import java.util.Scanner;
public class Primerange
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int a,b,c,i,j,flag=0;
    System.out.print("Enter the lower limit");
    a= sc.nextInt();
    System.out.println("Enter the upper limit");
    b=sc.nextInt();
    System.out.println("Enter the prime number in a range");
    for(i=a;i<=b;i++)
      {
    for(j=2;j<i;j++)
    {
    if(i%j==0)
        {
    flag=0;
    break;
        }      
    else
    {
          flag=1;
          }
          }
          if(flag==0)
           {
        
        
        System.out.println(i);
      }
    }  
  }
    }
