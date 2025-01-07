// Class representing a library, which manages librarians and catalogs
import java.util.ArrayList;
import java.util.List;

public class Library implements IManagePositions, IManageLibrarians {

    String address;
    List<Librarian> librarianList = new ArrayList<>();
    List<Catalog> catalogList = new ArrayList<>();

    // Default constructor
    public Library() {}

    // Constructor with parameters
    public Library(String address)
    {
        this.address = address;
    }

    // Method to add librarian
    public void addLibrarian(Librarian librarian)
    {
        librarianList.add(librarian);
    }

    // Method to print librarians
    public void printLibrarians()
    {
        for (Librarian librarian : librarianList)
        {
            librarian.printInfo();
        }
    }

    // Method to add catalog
    public void addCatalog(Catalog catalog)
    {
        catalogList.add(catalog);
    }

    // Method to add position to catalog
    public void addPosition(Position position, String thematicSection)
    {
        for (Catalog catalog : catalogList)
            if (catalog.getThematicSection().equals(thematicSection)) {
                catalog.addPosition(position);
                return;
            }
    }

    // Method to print all positions from all catalogs
    public void printAllPositions()
    {
        for (Catalog catalog : catalogList)
        {
            catalog.printAllPositions();
        }
    }

    // Method to find positions by title across all catalogs
    public List<Position> findPositionsByTitle(String title)
    {
        List<Position> foundPositions = new ArrayList<>();
        List<Position> allPositions = new ArrayList<>();
        for (Catalog catalog : catalogList)
        {
            foundPositions = catalog.findPositionsByTitle(title);
            allPositions.addAll(foundPositions);
        }
        if (allPositions != null)
            return allPositions;
        else
            return null;
    }

    // Method to find positions by id across all catalogs
    public List<Position> findPositionsById(int id)
    {
        List<Position> foundPositions = new ArrayList<>();
        List<Position> allFoundPositions = new ArrayList<>();
        for (Catalog catalog : catalogList) {
            foundPositions = catalog.findPositionsById(id);
            allFoundPositions.addAll(foundPositions);
        }
        return allFoundPositions;
    }
}