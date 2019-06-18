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
            Level level = schoolStrategy.getLevelByName(words[1]);
            if (level != null) {
                Criterion criterion = new Criterion(words[0], level, words[2]);
                this.criteria.add(criterion);
            }
        }
    }
}