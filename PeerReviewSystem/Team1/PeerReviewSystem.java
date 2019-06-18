import java.util.Map;
import java.util.HashMap;


public class PeerReviewSystem {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Assignment> assignments = new HashMap<>();
    private SchoolStrategy schoolStrategy;

    public void addAssignment(Assigment assignment) {
        assignments.put(assignment.getId(), assignment);
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