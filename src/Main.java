import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create books
        Book book1 = new Book("Wiedźmin", 10, "SuperNowa", 2018, 350);
        Book book2 = new Book("Ziemia Obiecana", 11, "Albatros", 2005, 500);
        Book book3 = new Book("Lalka", 12, "Iskry", 1999, 350);

        // Create magazines
        Magazine magazine1 = new Magazine("Nauka i Technika", 20, "Nauka", 2015, 50);
        Magazine magazine2 = new Magazine("Podróże", 21, "Travel", 2021, 60);

        // Create authors
        Author author1 = new Author("Andrzej", "Sapkowski", "Poland");
        Author author2 = new Author("Władysław", "Reymont", "Poland");
        Author author3 = new Author("Bolesław", "Prus", "Poland");

        // Add authors to books
        book1.addAuthor(author1);
        book2.addAuthor(author2);
        book3.addAuthor(author3);

        // Create catalogs with different data
        Catalog catalog1 = new Catalog("Fantasy");
        catalog1.addPosition(book1);

        Catalog catalog2 = new Catalog("Literature");
        catalog2.addPosition(book2);
        catalog2.addPosition(book3);

        Catalog catalog3 = new Catalog("Magazines");
        catalog3.addPosition(magazine1);
        catalog3.addPosition(magazine2);

        // Create library and add catalogs
        Library library = new Library();
        library.addCatalog(catalog1);
        library.addCatalog(catalog2);
        library.addCatalog(catalog3);

        // Create librarian and add to library
        Librarian librarian = new Librarian("Anna", "Nowak", "01.12.2010", 4000);
        library.addLibrarian(librarian);

        System.out.println("=== All Items in the Library ===");
        library.printAllPositions();

        System.out.println("\n=== Search for items by ID ===");

        // Search for positions by ID
        List<Position> positionsById = library.findPositionsById(20); // Search by ID 20 (should find "Nauka i Technika")
        if (positionsById != null) {
            for (Position position : positionsById) {
                position.printInfo();
            }
        } else {
            System.out.println("No items found with that ID.");
        }

        System.out.println("\n=== Search for items by Title ===");

        // Search for positions by title
        List<Position> positionsByTitle = library.findPositionsByTitle("Wiedźmin"); // Search by title "Wiedźmin"
        if (positionsByTitle != null) {
            for (Position position : positionsByTitle) {
                position.printInfo();
            }
        } else {
            System.out.println("No items found with that title.");
        }

        System.out.println("\n=== Librarians in the Library ===");
        library.printLibrarians();
    }
}
