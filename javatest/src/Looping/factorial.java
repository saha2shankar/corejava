package Looping;

public class factorial {
public static void main(String[] args) {
	int x=3;
	int y=1;
	while(x>=1) {
		y=y*x;
		x--;
	}
	System.out.println("Factorial of "+y);
}
}
