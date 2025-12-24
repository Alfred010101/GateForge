package windows;

import javax.swing.JFrame;
import javax.swing.JPanel;

import components.PanelDraw;

public class SimuladorUI extends JFrame implements Runnable{

    private JPanel mainPanel;

    {
        mainPanel = new PanelDraw();
        setTitle("Simulador");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(mainPanel);
    }

    public SimuladorUI(){}

    @Override
    public void run(){
        setVisible(true);
    }
}
