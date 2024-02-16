import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteStudentsToFile {
    public static void writeStudentsToFile(ArrayList<Student> students, String filename)
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename)))
        {
            students.stream()
                    .filter(student -> student.getStatus().equals("Failed"))
                    .map(student -> student.getStudentId())
                    .forEach(studentID -> {
                        try {
                            bw.write((int) (studentID + '\n'));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    });
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
