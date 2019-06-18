import java.util.ArrayList;

public class SchoolStrategy {
    private ArrayList<Level> levels = new ArrayList<>();

    public void addLevel(Level level) {
        this.levels.add(level);
    }

    public ArrayList<Level> getLevels() {
        return this.levels;
    }

    public Level getLevelByName(String name) {

        for (Level level : this.levels) {
            if (level.getName().equals(name)) {
                return level;
            }
        }
        return null;
    }
}