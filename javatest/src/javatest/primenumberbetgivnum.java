package javatest;

import java.util.Scanner;

public class primenumberbetgivnum {
    public static void main(String[] args) {
        int n, o, i, j;
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
            // If i is prime, print it
            if (isPrime && i > 1) {
                System.out.println(i);
            }
        }
    }
}
