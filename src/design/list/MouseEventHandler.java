package design.list;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MouseEventHandler extends MouseAdapter
{
    private final ItemTool panel;

    public MouseEventHandler(ItemTool panel)
    {
        this.panel = panel;
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        if (!panel.isSelected())
            panel.setBackground(new Color(184, 230, 254));
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        if (!panel.isSelected())
            panel.setBackground(Color.WHITE);
    }

}
