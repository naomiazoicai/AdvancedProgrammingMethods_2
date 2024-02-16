import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KitchenTest {
    @Test
    public void testPrepareMenuItem()
    {
        MenuItem item1 = Kitchen.prepareMenuItem("Salad");
        MenuItem item2 = Kitchen.prepareMenuItem("Cheesecake");

        assertNotNull(item1);
        assertNotNull(item2);

        assertEquals("Salad", item1.getName());
        assertEquals("Cheesecake", item2.getName());
    }
}
