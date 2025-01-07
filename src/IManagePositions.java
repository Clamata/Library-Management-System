import java.util.List;
// Interface to manage positions (add, find, print)
public interface IManagePositions {

    // Method to find positions by title
    public List<Position> findPositionsByTitle(String title);

    // Method to find positions by id
    public List<Position> findPositionsById(int id);

    // Method to print all positions
    public void printAllPositions();
}
