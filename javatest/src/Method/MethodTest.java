package Method;

public class MethodTest {
public static void main(String[] args) {
	sum();
	area(10,10);
	int sumof100=multiple();
	System.out.println("sum of 1 to 100 is ="+sumof100);
	int sv = findsmallest(100,1000);
	System.out.println("smallest number is "+sv);
	
}
static void sum() {
	int a=10;
	int b=30;
	int sum = a+b;
	System.out.println("sum of a and b is :"+sum);

}
static void area(int l, int b) {
	 int area = l*b;
	 System.out.println("the area is :"+area);
}

static int multiple() {
	int s=0;
	for(int i=1; i<=100; i++) {
		s=s+i;
		
	}
	return s;
}
static int findsmallest(int a, int b) {
	if(a<b) {
		return a;
	}else {
		return b;
	}
}

}
