# abc

import java.io.*;
import java.util.Scanner;
public class CamelCase1
 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String n = sc.nextLine();
    String r = "";
    char a = n.charAt(0);
    r = r + Character.toUpperCase(a);
    for (int i = 1; i < n.length(); i++) {
      char b = n.charAt(i);
      char c = n.charAt(i - 1);
      if (c == ' ') {
        r = r + Character.toUpperCase(b);
      } else {
        r = r + b;
      }
    }
    System.out.println(r);
  }
}
