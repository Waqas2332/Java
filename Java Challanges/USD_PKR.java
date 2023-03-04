import java.util.Scanner;

// 6-Input currency in rupees and output in USD.

public class USD_PKR {
    public static void main(String[] args) {
        Scanner curr = new Scanner(System.in);
        System.out.println("Enter Rupees : ");
        int pkr = curr.nextInt();
        int usd = pkr/270;
        System.out.println("Rs. " + pkr + " in USD is " + usd);
        curr.close();
    }
}
