import java.io.FileNotFoundException;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        ArrayList<MenuItem> menuItemsArrayList = ReadItemsFromFile.readItemsFromFile("C:\\Users\\naomi\\MAP_SEM3\\s4_menu_items\\examen\\src\\menu_items.csv");
        System.out.println(menuItemsArrayList);
//        CategoriesStream.categoriesStream(menuItemsArrayList);
        WriteToFile.writeToFile(menuItemsArrayList, "C:\\Users\\naomi\\MAP_SEM3\\s4_menu_items\\examen\\src\\unavailable_items.txt");
//
//        MenuItem menuItem = new MenuItem(11, "prajitura", "desert", 10.10, "true");
        RestaurantThread restaurantThread = new RestaurantThread(menuItemsArrayList);
        restaurantThread.simulateOrders();

    }
}