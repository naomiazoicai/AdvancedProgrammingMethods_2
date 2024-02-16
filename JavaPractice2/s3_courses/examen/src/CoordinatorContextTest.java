import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoordinatorContextTest {

    @Test
    public void testCourseCoordination()
    {
        CoordinatorContext context = new CoordinatorContext(new CourseCoordinatorStrategy());
        String expectedOutput = "CourseCoordinator coordinating";
//        assertEquals(expectedOutput, context.coordinateCourse());

    }
}
