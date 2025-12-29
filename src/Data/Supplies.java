
package Data;


public class Supplies {
    private String Name;
    private String Quantity;
    private int Price;
    private String Category;

    public Supplies(String Name, String Quantity, int Price, String Category) {
        this.Name = Name;
        this.Quantity = Quantity;
        this.Price = Price;
        this.Category = Category;
    }

    public String getName() {
        return Name;
    }

    public String getQuantity() {
        return Quantity;
    }

    public int getPrice() {
        return Price;
    }

    public String getCategory() {
        return Category;
    }
    
}
