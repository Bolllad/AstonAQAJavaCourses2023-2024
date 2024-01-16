public class Employee {
    protected String fullName;
    protected String position;
    protected String email;
    protected String phoneNumber;
    protected double wage;
    protected int age;

    public Employee(String fullName, String position, String email, String phoneNumber, double wage, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wage = wage;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("Name: " + this.fullName + ", position: " + this.position + ", email: " + this.email +
                ", phone number: " + this.phoneNumber + ", wage: " + this.wage + ", age: " + this.age);
    }
}
