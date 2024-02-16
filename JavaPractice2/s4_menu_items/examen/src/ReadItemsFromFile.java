import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadItemsFromFile {
    public static ArrayList<MenuItem> readItemsFromFile(String filename) throws FileNotFoundException {
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String header = br.readLine();
            String line;
            while((line = br.readLine()) != null)
            {
                String[] data = line.split("-");
                MenuItem menuItem = new MenuItem(Long.parseLong(data[0]), data[1], data[2], Double.parseDouble(data[3]), data[4]);
                menuItems.add(menuItem);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return menuItems;
    }
}
