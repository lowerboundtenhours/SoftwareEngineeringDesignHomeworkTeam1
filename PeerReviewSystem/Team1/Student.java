import java.util.ArrayList;
class Student{
    Student(String _id){
        id = _id;
    }
    public addHomework(Homework h){
        homeworks.add(h);
    }

    public addReview(Review r){
        reviews.add(r);
    }

    public String getId(){
        return id;
    }

    public ArrayList<Homework> getHomeworks(){
        return homeworks;
    }

    public Homework write(Assignment a){
        Homework homework = new Homework(a, this);
        homeworks.add(homework);
        a.addHomework(homework);
        return homework;
    }

    public review review(Homework h, String scoreFile){
       Review review = new Review(h, this, scoreFile);
       return review;
    }

    
    private String id;
    private ArrayList<Homework> homeworks;
    private ReviewList<Review> reviews;
}
