import java.util.List;
import java.util.stream.Collectors;

public class CoursesStream {
        public static void coursesStream(List<Student> students)
        {
            students.stream()
                    .collect(Collectors.groupingBy(Student::getCourseCode, Collectors.counting()))
                    .entrySet().stream()
                    .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        }
}
