import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CategoriesStream {

    public static void categoriesStream(List<MenuItem> menuItems)
    {
        menuItems.stream()
                .collect(Collectors.groupingBy(MenuItem::getCategory, Collectors.counting()))
                .entrySet().stream()
                .sorted((entry1, entry2)->entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() +": "+entry.getValue()));
    }
}
