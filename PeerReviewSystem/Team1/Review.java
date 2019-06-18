import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

class Review{
    Review(Homework h, Student r, String scoreFile, SchoolStrategy schoolStrategy){
        this.homework = h;
        this.reviewer = r;
        this.levels = new ArrayList<Level>();
        Scanner input = null;
        try{
            input = new Scanner(new FileReader(scoreFile));
        }
        catch(IOException e){
            e.printStackTrace();
        }
        while(input.hasNext()){
            Level level = schoolStrategy.getLevelByName(input.next());
            this.levels.add(level);
        }
        input.close();
    }

    public ArrayList<Level> getLevels(){
        return levels;
    }

    private Student reviewer;
    private Homework homework;
    private ArrayList<Level> levels;
}
