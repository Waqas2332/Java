// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner operator = new Scanner(System.in);
        System.out.println("Enter 1st Number = ");
        int a = num1.nextInt();
        System.out.println("Enter 2nd Number = ");
        int b = num2.nextInt();
        System.out.println("Enter Operator = ");
        String op = operator.next();
        if(op.equalsIgnoreCase("+")){
            int sum = a+b;
            System.out.println("Sum of " + a + " and " + b  + " is " + sum);
        }
        else if(op.equalsIgnoreCase("-")){
            int sub = a-b;
            System.out.println("Subtraction of " + a + " and " + b  + " is " + sub);
        }
        else if(op.equalsIgnoreCase("*")){
            int mult = a*b;
            System.out.println("Product of " + a + " and " + b  + " is " + mult);
        }
        else if(op.equalsIgnoreCase("/")){
            int div = a/b;
            System.out.println("Division of " + a + " and " + b  + " is " + div);
        }
        else{
            System.out.println("Invalid Operator");
        }
        num1.close();
        num2.close();
        operator.close();
    }
}
