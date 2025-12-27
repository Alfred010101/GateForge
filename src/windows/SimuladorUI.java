package windows;

import java.awt.BorderLayout;

// import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import design.PanelDraw;
// import design.PanelTools;
import design.PanelToolsWork;

public class SimuladorUI extends JFrame implements Runnable{

    private JPanel mainPanel;
    // private JPanel toolsPanel;
    private JPanel toolsPanelWork;


    {
        setTitle("Simulador");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public SimuladorUI()
    {
        initComponents();
    }

    private void initComponents()
    {
        this.setLayout(new BorderLayout());
        mainPanel = new PanelDraw();
        // toolsPanel = new PanelTools();
        toolsPanelWork = new PanelToolsWork();

        // add(toolsPanel, BorderLayout.NORTH);
        add(toolsPanelWork, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);
    }

    @Override
    public void run(){
        setVisible(true);
    }
}
