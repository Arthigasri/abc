import java.io.*;
import java.util.Scanner;
public class Swapeveodd
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String even_odd =sc.nextLine();
    char[] a=even_odd.tocharAt(0);
    System.out.println(Arrays.toString(a));
    for(int i=a[0];i<a.length();i=i+2)
    System.out.println(Arrays.toString(a[i]));
    }
    }
    
    
