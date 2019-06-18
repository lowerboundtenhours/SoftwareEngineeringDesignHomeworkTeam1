import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class Rubric {

    private ArrayList<Criterion> criteria = new ArrayList<>();

    private List<String> readFile(String filename) {
        List<String> allLines = new ArrayList<String>();
        try {
            allLines = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allLines;
    }

    public void readRubricFile(String filename, SchoolStrategy schoolStrategy) {
        for (String line : this.readFile(filename)) {
            String[] words = line.split("\t");
            String criterionName = words[0];
            String levelName = words[1];
            String description = words[2];

            Level level = schoolStrategy.getLevelByName(levelName);
            if (level != null) {
                Criterion criterion = getCriterion(criterionName);
                if (criterion == null) {
                    criterion = new Criterion(criterionName);
                    this.criteria.add(criterion);
                }
                criterion.addDescriptor(level, description);
            }
            else {
                // error handling
                throw new RuntimeException("level name not found in school strategy!");
            }
        }
    }

    private Criterion getCriterion(String name) {
        for (Criterion c: criteria) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }
}
