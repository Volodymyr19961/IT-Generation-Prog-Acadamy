 import java.util.Scanner;

    public class BitcoinPrice {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("What is Bitcoin price today?");
            double price = scan.nextInt();
            System.out.println("How much $ do you have?");
            double cash = scan.nextInt();
            double TotalAmount = cash / price;
            System.out.println("You can buy " + String.format("%.7f", TotalAmount) + " BTC");
        }
    }