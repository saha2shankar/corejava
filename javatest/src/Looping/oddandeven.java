package Looping;

public class oddandeven {
public static void main(String[] args) {
	int even=0;
	int odd=0;
	int x;
	for (x=1; x<=100; x++) {
		if(x%2==0) {
			even =even+x;
		}else {
		odd= odd+x;
		}
		System.out.println(x);
	}
	System.out.println("Even number:"+even);
	System.out.println("Odd number:"+odd);
	System.out.println("Total of even and odd is: "+even+odd);
}
}
