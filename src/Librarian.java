// Class representing a librarian, extending Person with additional attributes and methods
public class Librarian extends Person {

    private String hiringDate;
    private double salary;

    // Default constructor
    public Librarian()
    { }

    // Constructor with parameters
    public Librarian(String firstName, String lastName, String hiringDate, double salary)
    {
        super(firstName, lastName);
        this.hiringDate = hiringDate;
        this.salary = salary;
    }

    // Getter for hiringDate
    public String getHiringDate() {
        return hiringDate;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for hiringDate
    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to print librarian info
    public void printInfo() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Hiring Date: " + getHiringDate());
        System.out.println("Salary: " + getSalary());
    }
}