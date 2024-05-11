package OOP;

public class Area {
	int length;
	int breadth;
	
	void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }

}
