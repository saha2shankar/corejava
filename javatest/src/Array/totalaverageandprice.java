package Array;
import java.util.Scanner;

public  class totalaverageandprice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store book prices
        double[] bookPrices = new double[10];
        
        // Input book prices
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter price for book " + (i + 1) + ": ");
            bookPrices[i] = scanner.nextDouble();
        }
        
        // Calculate total price and average price
        double totalPrice = 0;
        for (double price : bookPrices) {
            totalPrice += price;
        }
        double averagePrice = totalPrice / 10;
        
        // Print total price and average price
        System.out.println("Total price of all books: " + totalPrice);
        System.out.println("Average price of all books: " + averagePrice);
        
        scanner.close(); // Closing the scanner
    }
}
