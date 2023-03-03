import java.util.Scanner;

// 2. Take name as input and print a greeting message for that particular name.
public class Greeting {
    public static void main(String[] args){
        System.out.println("Enter Your Name ");
        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();
        System.out.println("Hey " + userName + "! Nice to See you");
    }
}