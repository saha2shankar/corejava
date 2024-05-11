package OOP;

public class ooptest {
    public static void main(String[] args) {
    	
        Employees employee1 = new Employees("Robert", 1994, 50000, "64C- WallsStreat");
        Employees employee2 = new Employees("Sam", 2000, 60000, "68D- WallsStreat");
        Employees employee3 = new Employees("John", 1999, 55000, "26B- WallsStreat");
        

        System.out.println("Name\tYear of Joining    Salaray \tAddress");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}