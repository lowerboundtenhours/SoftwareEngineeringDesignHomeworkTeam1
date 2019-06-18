import java.util.ArrayList;

public class SchoolStrategy {
    private ArrayList<Level> levels = new ArrayList<>();

    public void addLevel(Level level) {
        this.levels.add(level);
    }

    public ArrayList<Level> getLevels() {
        return this.levels;
    }
}