import java.io.FileNotFoundException;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Student> studentArrayList = ReadStudentsFromFile.readStudentsFromFile("C:\\Users\\naomi\\MAP_SEM3\\s3_courses\\examen\\src\\course_registration.csv");
        System.out.println(studentArrayList);
        CoursesStream.coursesStream(studentArrayList);

        WriteStudentsToFile.writeStudentsToFile(studentArrayList, "C:\\Users\\naomi\\MAP_SEM3\\s3_courses\\examen\\src\\failed_students");
    }
}