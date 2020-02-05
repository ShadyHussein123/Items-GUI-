package Task1;

public class StationaryItem extends Item
{
    private int itemSize;
    public static int counter = 0;

    public static int getCounter()
    {
        return counter;
    }

    public StationaryItem(String name, int ID, int itemSize)
    {
        super(name, ID);
        this.itemSize = itemSize;
        counter++;
    }

    public int getItemSize() {
        return itemSize;
    }

    public void setItemSize(int itemSize) {
        this.itemSize = itemSize;
    }

    @Override
    public String getName() {
        return "Item Size: " + itemSize;
    }
}
