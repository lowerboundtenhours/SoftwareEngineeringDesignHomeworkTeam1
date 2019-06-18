import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

class Review{
    Review(Homework h, Student r, String scoreFile){
        this.homework = h;
        this.reviewer = r;
        this.levels = new ArrayList();
        Scanner input = null;
        try{
            input = new Scanner(new FileReader(scoreFile));
        }
        catch(IOException e){
            e.printStackTrace();
        }
        while(input.hasNext()){
            this.levels.add(input.next());
        }
        h.addReview(this);
        r.addReview(this);
    }
    public ArrayList<String> getLevels(){
        return levels;
    }
    private Student reviewer;
    private Homework homework;
    private ArrayList<String> levels;
}
