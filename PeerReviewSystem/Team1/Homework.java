import java.util.ArrayList;
class Homework{
    Homework(Assignment a, Student s){
        this.assignment = a;
        this.student = s;
        this.reviews = new ArrayList();
        a.addHomework(s.getId(), this);
        s.addHomework(this);
    }
    public addReview(Review r){
        reviews.add(r);
    }
    public Assignment getAssignment(){
        return assignment;
    }
    public getStudent(){
        return student;
    }
    public ArrayList<Review> getReviews(){
        return reviews;
    }
    public setReviewers(Student s){
        
    }
    private Assignment assignment;
    private Student student;
    private ArrayList<Review> reviews;
}
