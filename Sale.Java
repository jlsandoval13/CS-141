public class Sale
{
    private String itemName;
    private double price;

    public Sale(String IN, double P)
    {
        itemName = IN;
        price = P;
    }

    public String[] setItemName(String Item)
    { itemName = Item;
        return new String[0];
    }

    public void setPrice(double Price)
    { price = Price; }

    public String getItemName()
    { return itemName; }

    public double getPrice()
    { return price; }
}
