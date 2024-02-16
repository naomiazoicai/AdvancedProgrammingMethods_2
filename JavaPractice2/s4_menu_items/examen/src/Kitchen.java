public class Kitchen {
    public static MenuItem prepareMenuItem(String itemName)
    {
        if (itemName.equalsIgnoreCase("Salad"))
        {
            return new MenuItem(3, "Salad", "Dinner", 6.99, "false");

        }
        else if (itemName.equalsIgnoreCase("Cheesecake"))
        {
            return new MenuItem(5, "Cheesecake", "Dessert", 5.99, "true");

        }
        else
        {
            return null;
        }
    }

}
