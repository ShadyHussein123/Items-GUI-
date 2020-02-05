package Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemCollectionFrame extends JFrame
{
    private ItemCollection itemCollection = new ItemCollection();


    private JPanel mainPanel, bPanel, textPanel, textAreaPanel ;
    private JButton addStation, addLabItem, display ,exit, refresh;
    private JTextArea textArea;
    private JTextField nameEntry, idEntry, itemSizeEntry;
    private JLabel nameLabel, idLabel, itemSizeLabel, totalLab, totalStationary, total;

    public ItemCollectionFrame()
    {
        setSize(500,500);
        frameComponents();
        add(mainPanel);
    }

    public void frameComponents()
    {

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        textPanel = new JPanel();

        textAreaPanel = new JPanel();


        bPanel = new JPanel();
        bPanel.setLayout(new BoxLayout(bPanel,1));


        refresh = new JButton("Refresh");
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                totalStationary.setText("Stationary Items: " + StationaryItem.getCounter());
                totalLab.setText("Lab Items: "+ LabItem.getCounter());
                total.setText("Total Items: " + itemCollection.itemSize());
            }
        });
        bPanel.add(refresh);


        addStation = new JButton("Add Stationary item");
        bPanel.add(addStation);
        addStation.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                itemCollection.addStationaryItem(new StationaryItem(nameEntry.getText(), Integer.parseInt(idEntry.getText()), Integer.parseInt(itemSizeEntry.getText())));
            }
        });

        addLabItem = new JButton("Add Lab item");
        bPanel.add(addLabItem);
        addLabItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
               itemCollection.addLabItem(new LabItem(nameEntry.getText(), Integer.parseInt(idEntry.getText()), itemSizeLabel.getText()));
            }
        });


        display = new JButton("Display");
        bPanel.add(display);
        display.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                textArea.setText(itemCollection.toString());
            }
        });

        exit = new JButton("Exit");
        bPanel.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                System.exit(0);
            }
        });



        mainPanel.add(bPanel, BorderLayout.WEST);


        textArea = new JTextArea(20,20);
        textAreaPanel.add(textArea);

        mainPanel.add(textAreaPanel, BorderLayout.EAST);


        nameLabel = new JLabel("Enter item name:-");
        textPanel.add(nameLabel);



        nameEntry = new JTextField();
        nameEntry.setPreferredSize(new Dimension(50,20));
        textPanel.add(nameEntry);


        idLabel = new JLabel("Enter item ID:-");
        textPanel.add(idLabel);

        idEntry = new JTextField();
        idEntry.setPreferredSize(new Dimension(50,20));
        textPanel.add(idEntry);

        itemSizeLabel = new JLabel("Enter the size of the item:-");
        textPanel.add(itemSizeLabel);
        itemSizeEntry = new JTextField();
        itemSizeEntry.setPreferredSize(new Dimension(50,20));
        textPanel.add(itemSizeEntry);

        totalLab = new JLabel("A");
        textPanel.add(totalLab);

        totalStationary = new JLabel("B");
        textPanel.add(totalStationary);

        total =  new JLabel("C");
        textPanel.add(total);

        mainPanel.add(textPanel, BorderLayout. CENTER);


    }



}
