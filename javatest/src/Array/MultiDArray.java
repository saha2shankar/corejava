package Array;

import java.util.Scanner;

public class MultiDArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int mat[][] = new int [2][2];
	for(int i=0; i<2; i++) {
		for(int j=0; j<2; j++) {
			System.out.println("Enter your Num 1");
			mat[i][j] = sc.nextInt();
		}
	}
	
	for(int i=0; i<2; i++) {
		for(int j=0; j<2; j++) {
			System.out.print(mat[i][j]+" ");
			}
		System.out.println();
		}
}
}
