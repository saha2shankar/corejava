package Looping;

public class sumof1to100 {
	public static void main(String[] args) {
		int x=0;
		for(int i=1; i<=100; i++) {
			x = x+i;
			System.out.println(i);
		}
		System.out.println("Sum of 1 to 100 is :"+x);
	}

}
