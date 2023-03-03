import java.util.Scanner;

// 1.Write a program to print whether a number is even or odd, also take input from the user.
public class Even_Odd{
    public static void main(String[] args) {
        System.out.println("Enter any Number = ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        if(number%2==0){
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is odd");
        }

    }
}