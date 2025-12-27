package design.list;

import java.util.ArrayList;
import java.util.List;

public class ToolSelectionModel 
{
    private ItemTool selected;
    private final List<ToolSelectionListener> listeners = new ArrayList<>();

    public void setSelected(ItemTool tool) 
    {
        if (selected == tool) return;

        ItemTool old = selected;
        selected = tool;

        notifyListeners(old, selected);
    }

    public void addListener(ToolSelectionListener l) 
    {
        listeners.add(l);
    }

    private void notifyListeners(ItemTool oldTool, ItemTool newTool) 
    {
        for (ToolSelectionListener l : listeners) 
        {
            l.onSelectionChanged(oldTool, newTool);
        }
    }
}

