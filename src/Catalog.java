// Class representing a catalog that manages a collection of positions
import java.util.ArrayList;
import java.util.List;

public class Catalog implements IManagePositions {

    private String thematicSection;
    private List<Position> positions = new ArrayList<>();

    // Default constructor
    public Catalog()
    { }

    // Constructor with parameters
    public Catalog(String thematicSection)
    {
        this.thematicSection = thematicSection;
    }

    // Getter for thematicSection
    public String getThematicSection() {
        return thematicSection;
    }

    // Setter for thematicSection
    public void setThematicSection(String thematicSection) {
        this.thematicSection = thematicSection;
    }

    // Method to add a position
    public void addPosition(Position position)
    {
        positions.add(position);
    }

    // Method to print all positions
    public void printAllPositions()
    {
        for (Position position : positions)
        {
            position.printInfo();
        }
    }

    // Method to find positions by year of publication
    public List<Position> findPositionsByYearOfPublication(int yearOfPublication)
    {
        List<Position> found = new ArrayList<>();
        for (Position p : positions) {
            if (p.yearOfPublication == yearOfPublication) {
                found.add(p);
            }
        }
        if (found != null) {
            return found;
        }
        return null;
    }

    // Method to find positions by title
    public List<Position> findPositionsByTitle(String title)
    {
        List<Position> found = new ArrayList<>();
        for (Position p : positions)
        {
            if (title.equals(p.getTitle()))
                found.add(p);
        }
        if (found != null)
            return found;
        else
            return null;
    }

    // Method to find positions by id
    public List<Position> findPositionsById(int id)
    {
        List<Position> found = new ArrayList<>();
        for (Position p : positions)
        {
            if (id == p.getId())
                found.add(p);
        }
        if (found != null)
            return found;
        else
            return null;
    }
}