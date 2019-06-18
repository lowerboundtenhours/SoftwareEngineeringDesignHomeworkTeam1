import java.util.ArrayList;
class Homework{
    Homework(Assignment a, Student s){
        this.assignment = a;
        this.student = s;
        this.reviews = new ArrayList<Review>();
    }
    public void addReview(Review r){
        reviews.add(r);
    }
    public Assignment getAssignment(){
        return assignment;
    }
    public Student getStudent(){
        return student;
    }
    public ArrayList<Review> getReviews(){
        return reviews;
    }
    public void setReviewers(Student s){
        
    }

    public void printStatus(){
        System.out.printf("Homework status\n");
        System.out.printf("Assignment Id: %s\n", assignment.getId());
        System.out.printf("write by %s\n", student.getId());
        for(Review review: reviews){
            review.printStatus();
        }
    }
    private Assignment assignment;
    private Student student;
    private ArrayList<Review> reviews;
}
