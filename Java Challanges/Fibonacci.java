import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter Number = ");
        int N = n.nextInt();
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < N) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
            n.close();
        }
    }
}