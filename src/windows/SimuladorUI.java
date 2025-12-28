package windows;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

// import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

import design.PanelDraw;
// import design.PanelTools;
import design.PanelToolsWork;

public class SimuladorUI extends JFrame implements Runnable{

    private JPanel mainPanel;
    // private JPanel toolsPanel;
    private JPanel toolsPanelWork;

    private JScrollPane scrollPane;

    {
        setTitle("Simulador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setLocationRelativeTo(null);
        setMinimumSize(new Dimension(900, 650));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public SimuladorUI()
    {
        initComponents();
    }

    private void initComponents()
    {
        this.setLayout(new BorderLayout());
        mainPanel = new PanelDraw();
        scrollPane = new JScrollPane(mainPanel);
        // toolsPanel = new PanelTools();
        toolsPanelWork = new PanelToolsWork();

        // add(toolsPanel, BorderLayout.NORTH);
        add(toolsPanelWork, BorderLayout.WEST);
        add(scrollPane, BorderLayout.CENTER);

        scrollPane.getViewport().addComponentListener(new ComponentAdapter() 
        {
            @Override
            public void componentResized(ComponentEvent e) {
                centerCanvas();
            }
        });
    }

    @Override
    public void run(){
        setVisible(true);
    }

    private void centerCanvas() 
    {
        JViewport viewport = scrollPane.getViewport();

        Dimension viewSize = viewport.getViewSize();
        Dimension extentSize = viewport.getExtentSize();

        if (viewSize.width <= extentSize.width ||
            viewSize.height <= extentSize.height)
            return;

        int x = (viewSize.width - extentSize.width) / 2;
        int y = (viewSize.height - extentSize.height) / 2;

        viewport.setViewPosition(new Point(x, y));
    }

}
