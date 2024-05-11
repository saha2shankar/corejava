package OOP;

import java.util.Scanner;

public class AreaPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area rectangle = new Area();

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        rectangle.setDim(length, breadth);

        System.out.println("Area of the rectangle: " + rectangle.getArea());

    }
}
