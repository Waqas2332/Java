// 5. Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Largest{
    public static void main(String[] args) {
        Scanner val1 = new Scanner(System.in);
        Scanner val2 = new Scanner(System.in);
        System.out.println("Enter First Number = ");
        int num1 = val1.nextInt();
        System.out.println("Enter 2nd Number = ");
        int num2 = val2.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num1 < num2){
            System.out.println(num2 + " is greater than " + num1);
        }
        else{
            System.out.println("Both are equal");
        }
        val1.close();
        val2.close();
    }
}