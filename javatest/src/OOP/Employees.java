package OOP;

class Employees {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    Employees(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    void displayInfo() {
        System.out.println(name + "\t" + yearOfJoining + "           \t"+salary +" \t" + address);
    }
}

