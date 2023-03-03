import java.util.Scanner;

// 3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class Interest {
   public static void main(String[] args) {
    Scanner p = new Scanner(System.in);
    Scanner t = new Scanner(System.in);
    Scanner r = new Scanner(System.in);
    System.out.println("Enter Principal = ");
    int principal = p.nextInt();
    
    System.out.println("Enter Time = ");
    int time = t.nextInt();
    
    System.out.println("Enter Rate = ");
    int rate = r.nextInt();
    
    int interest = (principal*time*rate)/100;
    System.out.println("Simple Interest with Principal " + principal + " ,time " + time + " and rate " + rate + " is " + interest);
    p.close();
    t.close();
    r.close();
   } 
}
