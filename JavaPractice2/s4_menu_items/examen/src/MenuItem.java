public class MenuItem {
    public long itemId;
    public String name;
    public String category;
    public Double price;
    public String availability;

    public MenuItem(long itemId, String name, String category, Double price, String availability) {
        this.itemId = itemId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.availability = availability;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
