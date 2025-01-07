// Class representing an Author, which extends Person and adds nationality
public class Author extends Person {

    private String nationality;

    // Default constructor
    public Author() { }

    // Constructor with parameters
    public Author(String firstName, String lastName, String nationality)
    {
        super(firstName, lastName);
        this.nationality = nationality;
    }

    // Getter for nationality
    public String getNationality() {
        return nationality;
    }

    // Setter for nationality
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}