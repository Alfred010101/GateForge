package design;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import design.list.ItemTool;
import design.list.ToolSelectionModel;

public class PanelToolsWork extends JPanel
{
    private final ToolSelectionModel selectionModel = new ToolSelectionModel();

    {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
    }

    public PanelToolsWork()
    {
        initComponents();
    }

    private void initComponents()
    {
        selectionModel.addListener((oldItem, newItem) -> {

            if (oldItem != null)
                oldItem.setSelected(false);

            if (newItem != null)
                newItem.setSelected(true);
        });

        addItem(new ItemTool("AND"));
        addItem(new ItemTool("OR"));
        addItem(new ItemTool("NOT"));        
    }

    private void addItem(ItemTool item) 
    {
        item.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                selectionModel.setSelected(item);
            }
        });
        add(item);
    }
}
