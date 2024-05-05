package ControlStatement;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        int l;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        l = sc.nextInt();
        System.out.println("Enter breadth:");
        b = sc.nextInt();
        
        if (l == 0 || b == 0) {
            System.out.println("Length or Breadth cannot be zero");
        } else {
            int area = l * b;
            System.out.println("Area is equal to: " + area);
        }
    }
}
