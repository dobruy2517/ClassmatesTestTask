import java.util.ArrayList;
import java.util.List;

public class Professor extends Human {

    public Professor(){
       super();
    }

    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public List<Student> checkStudentsPresents(List<Student> studentList){
        List<Student> presentStudents = new ArrayList<Student>();
        for (Student student: studentList) {
            if (student.isPresent()){
                presentStudents.add(student);
            }
        }
        return presentStudents;
    }
}
