import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
            String line;
            PeerReviewSystem system = new PeerReviewSystem();
            Instructor instructor = new Instructor();

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
                if (tokens[0].equals("student")) {
                    // student [StudentId] [StudentId]...
                    // guarantees the "student" command contains at least one [StudentID]
                    for (int i = 1; i < tokens.length; ++i) {
                        Student newStudent = new Student(tokens[i]);
                        system.addStudent(newStudent);
                    }
                } else if (tokens[0].equals("schoolStrategy")) {
                    // schoolStrategy [Level],[Score] [Level],[Score] …
                    // guarantees the "schoolStrategy" command contains at least one [Level],[Score]
                    SchoolStrategy strat = system.getSchoolStrategy();
                    for (int i = 1; i < tokens.length; ++i) {
                        String[] subTokens = tokens[i].split(",");
                        Level newLevel = new Level(subTokens[0],  Float.parseFloat(subTokens[1]));
                        strat.addLevel(newLevel);
                    }
                    system.setSchoolStrategy(strat);

                } else if (tokens[0].equals("designCriterion")) {
                    // designCriterion [AssignmentID] [RubricFile]
                    Rubric newRubric = new Rubric();
                    newRubric.readRubricFile(tokens[2], system.getSchoolStrategy());

                    instructor.setAssignemntRubric(instructor.createAssignment(tokens[1]), newRubric);
                                
                } else if (tokens[0].equals("assignment")) {
                    // assignment [AssignmentID] [StudentID] [ReviewrID],[SampleScoreFile] [ReviewrID],[SampleScoreFile]...
                    boolean reviewOwn = false;
                    for (int i = 3; i < tokens.length; ++i) {
                        if (tokens[2].equals(tokens[i].split(",")[0])) {
                            reviewOwn = true;
                            break;
                        }
                    }

                    if (reviewOwn) {
                        System.out.println("Cannot review one's own assignment.");
                    } else if (tokens.length < 6 || tokens.length > 8) {
                        System.out.println("Assignment should be reviewed by 3-5 students.");
                    } else {
                        for (int i = 3; i < tokens.length; ++i) {
                            String[] subTokens = tokens[i].split(",");
                            // tokens: AssignmentID, StudentID
                            // subTokens: ReviewerId, SampleScoreFile
                        }
                    }
                    // # SampleScoreFile format
                    // [Level]
                    // [Level]
                    // [Level]
 
                } else if (tokens[0].equals("printRubric")) {
                    // printRubric [AssignmentID]
                    system.printRubric(tokens[1]);

                } else if (tokens[0].equals("averageCriterion")) {
                    // averageCriterion [AssignmentID]
                    instructor.getAssignmentAverageCriterion(tokens[1]);
                    
                } else if (tokens[0].equals("calculateScore")) {
                    // calculateScore [AssignmentID] [StudentID] [RankingStrategy]
                    instructor.getStudentScore(tokens[1], tokens[2], tokens[3]);

                } else if (tokens[0].equals("findStrength")) {
                    // findStrength [AssignmentID] [StudentID] [RankingStrategy]
                    instructor.getStudentStrength(tokens[1], tokens[2], tokens[3]);
                    
                } else if (tokens[0].equals("findWeakness")) {
                    // findWeakness [AssignmentID] [StudentID] [RankingStrategy]
                    instructor.getStudentWeakness(tokens[1], tokens[2], tokens[3]);
                }
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}