// Class representing a magazine, extending Position with additional attributes and methods
public class Magazine extends Position {
    private int number;

    // Constructor with parameters
    public Magazine(String title, int id, String publisher, int yearOfPublication, int number) {
        super(title, id, publisher, yearOfPublication);
        this.number = number;
    }

    // Getter for number
    public int getNumber() {
        return number;
    }

    // Setter for number
    public void setNumber(int number) {
        this.number = number;
    }

    // Method to print magazine info
    @Override
    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Id: " + id);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year of Publication: " + yearOfPublication);
        System.out.println("Number: " + number);
    }
}
