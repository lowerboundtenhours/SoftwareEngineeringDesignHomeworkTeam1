import java.util.Map;
import java.util.HashMap;


public class PeerReviewSystem {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Assignment> assignments = new HashMap<>();
    private SchoolStrategy schoolStrategy;

    public void addAssignment(Assignment assignment) {
        assignments.put(assignment.getId(), assignment);
    }

    public Student getStudent(String id){
        return students.get(id);
    }

    public Assignment getAssignment(String id){
        return assignments.get(id);
    }
    public Boolean assignmentIsExist(String id){
        return this.assignments.containsKey(id);
    }

    public void printRubric(String id) {
        assignments.get(id).printRubric();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void setSchoolStrategy(SchoolStrategy ss) {
        this.schoolStrategy = ss;
    }

    public SchoolStrategy getSchoolStrategy() {
        return this.schoolStrategy;
    }
}
