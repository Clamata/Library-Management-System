// Abstract class representing a general position (book, magazine, etc.) with common attributes
abstract class Position
{
    protected String title;
    protected int id;
    protected String publisher;
    protected int yearOfPublication;

    // Default constructor
    public Position()
    { }

    // Constructor with parameters
    public Position(String title, int id, String publisher, int yearOfPublication)
    {
        this.title = title;
        this.id = id;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for publisher
    public String getPublisher() {
        return publisher;
    }

    // Getter for year of publication
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Setter for publisher
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Setter for year of publication
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    // Abstract method to display information
    public abstract void printInfo();
}