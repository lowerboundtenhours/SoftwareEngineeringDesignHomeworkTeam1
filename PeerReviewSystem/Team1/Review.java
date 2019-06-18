import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

class Review{
    Review(Homework h, Student r, String scoreFile, SchoolStrategy schoolStrategy){
        this.homework = h;
        this.reviewer = r;
        this.levels = new ArrayList<Level>();
        Scanner input = null;
        int maxLevel = h.getAssignment().getCriteriaLength();
        int levelNum = 0;
        try{
            input = new Scanner(new FileReader(scoreFile));
        }
        catch(IOException e){
            e.printStackTrace();
        }
        while(input.hasNext() && levelNum < maxLevel){
            Level level = schoolStrategy.getLevelByName(input.next());
            this.levels.add(level);
            ++levelNum;
        }
        input.close();
    }

    public ArrayList<Level> getLevels(){
        return levels;
    }

    public String getLevelString(){
        String ret = "";
        for(Level l: levels){
            ret += " ";
            ret += l.getName();
        }
        return ret;
    }

    private Student reviewer;
    private Homework homework;
    private ArrayList<Level> levels;
}
