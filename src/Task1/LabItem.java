package Task1;

public class LabItem extends Item
{
    private String itemString;
    public static int counter = 0;

    public LabItem(String name, int ID, String itemString)
    {
        super(name, ID);
        this.itemString = itemString;
        counter++;
    }

    public String getItemString() {
        return itemString;
    }

    public void setItemString(String itemString) {
        this.itemString = itemString;
    }


    public static int getCounter() {
        return counter;
    }

    @Override
    public String getName() {
        return "Item Name: " + itemString;
    }
}
