import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadStudentsFromFile {

    public static ArrayList<Student> readStudentsFromFile(String filename) throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String header = br.readLine();
            String line;
            while((line = br.readLine()) != null)
            {
                String[] data = line.split("_");
                Student student = new Student(Long.parseLong(data[0]), data[1], Long.parseLong(data[2]), Long.parseLong(data[3]), data[4]);
                students.add(student);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return students;
    }
}
