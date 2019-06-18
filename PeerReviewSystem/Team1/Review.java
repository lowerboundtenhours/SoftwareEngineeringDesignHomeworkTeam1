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
    }

    public ArrayList<Level> getLevels(){
        return levels;
    }

    public void printStatus(){
        System.out.print("review status\n");
        System.out.printf("review Id %s\n", reviewer.getId());
        for(Level l:levels){
            System.out.printf("%s ", l.getName());
        }
        System.out.printf("\n");
    }
    private Student reviewer;
    private Homework homework;
    private ArrayList<Level> levels;
}
