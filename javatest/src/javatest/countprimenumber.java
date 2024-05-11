package javatest;

import java.util.Scanner;

public class countprimenumber {
    public static void main(String[] args) {
        int n, o, i, j, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        n = sc.nextInt();
        System.out.println("Enter last number: ");
        o = sc.nextInt();

        for (i = n; i <= o; i++) {
            boolean isPrime = true;
            // Check if i is prime
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // If i is prime and greater than 1, increment the count
            if (isPrime && i > 1) {
                count++;
            }
        }
        System.out.println("Number of prime numbers between " + n + " and " + o + ": " + count);
    }
}
