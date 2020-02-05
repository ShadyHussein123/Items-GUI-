package Task1;

import java.util.HashMap;

public class ItemCollection
{
    private static HashMap<Integer,Item> map = new HashMap<>();


    public ItemCollection()
    {
        super();
    }

    public static void addStationaryItem(StationaryItem stationItem)
    {
        map.put(stationItem.getID(),stationItem);
    }

    public static void addLabItem(LabItem labItem)
    {
        map.put(labItem.getID(),labItem);
    }

    public int itemSize()
    {
        return map.size();
    }

    @Override
    public String toString()
    {
        if (map.isEmpty())
        {
            return "No items available !";
        }

        return "Item Collection" + map;
    }
}
