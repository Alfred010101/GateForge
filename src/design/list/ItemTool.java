package design.list;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemTool extends JPanel
{
    {
        Dimension max = new Dimension(100, 25);
        setLayout(new FlowLayout(FlowLayout.LEFT, 4, 4));
        setMaximumSize(max);
        setPreferredSize(max);
        nameTool = new JLabel();
        setBackground(Color.WHITE);
    }

    private JLabel nameTool;
    private boolean selected = false;
    private final MouseEventHandler mouseEventHandler;

    public ItemTool(String nameTool)
    {
        this.nameTool.setText(nameTool);
        this.mouseEventHandler = new MouseEventHandler(ItemTool.this);
        initComponents();
    }

    private void initComponents()
    {
        addMouseListener(mouseEventHandler);
        add(nameTool);
    }

    public void setSelected(boolean selected) 
    {
        this.selected = selected;
        setBackground(selected
                ? new Color(116, 212, 255)
                : Color.WHITE);
        repaint();
    }

    public boolean isSelected() {
        return selected;
    }
}
