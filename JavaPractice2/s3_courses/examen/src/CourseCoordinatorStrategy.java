import java.sql.SQLOutput;

public class CourseCoordinatorStrategy implements CoordonationStrategy{

    @Override
    public void coordinateCourse() {
        System.out.println("CourseCoordinator coordinating");
    }
}
