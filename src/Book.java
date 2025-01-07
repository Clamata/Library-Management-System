// Class representing a book, extending Position with additional attributes and methods
import java.util.ArrayList;
import java.util.List;

public class Book extends Position {

    private int numberOfPages;
    private List<Author> authorList = new ArrayList<>();

    // Default constructor
    public Book() {}

    // Constructor with parameters
    public Book(String title, int id, String publisher, int yearOfPublication, int numberOfPages) {
        super(title, id, publisher, yearOfPublication);
        this.numberOfPages = numberOfPages;
    }

    // Method to add an author
    public void addAuthor(Author author)
    {
        authorList.add(author);
    }

    // Method to print book info
    @Override
    public void printInfo()
    {
        System.out.println("Title: " + title);
        System.out.println("Id: " + id);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year of Publication: " + yearOfPublication);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Authors:");
        for (Author author : authorList)
        {
            System.out.println(author.getFirstName() + ' ' + author.getLastName());
        }
    }
}