package ControlStatement;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        int x = 100;
        int y = 50;
        char math;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What operation do you want to perform? (+, -, *, /)");
        math = sc.next().charAt(0); // Read the operation character
        
        switch (math) {
            case '+':
                System.out.println("Sum of " + x + " and " + y + " is " + (x + y));
                break;
            case '-':
                System.out.println("Difference of " + x + " and " + y + " is " + (x - y));
                break;
            case '*':
                System.out.println("Product of " + x + " and " + y + " is " + (x * y));
                break;
            case '/':
                if (y != 0) {
                    System.out.println("Division of " + x + " and " + y + " is " + ((double)x / y));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
