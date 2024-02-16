import java.io.*;
import java.util.List;

public class WriteToFile {

    public static void writeToFile(List<MenuItem> menuItems, String filename) throws FileNotFoundException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename)))
        {
            menuItems.stream()
                    .filter(menuItem -> menuItem.getAvailability().equals("false"))
                    .map(menuItem -> menuItem.getName().length())
                    .forEach(menuItemLen ->{
                        try {
                            bw.write(menuItemLen + "\n");
                        } catch (IOException e)
                        {
                            throw new RuntimeException(e);
                        }
                    });
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}