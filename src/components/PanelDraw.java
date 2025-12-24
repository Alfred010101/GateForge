package components;

import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;

public class PanelDraw extends JPanel
{
    @Override
    protected void paintComponent(Graphics g) {
        // super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Paint defPaint = g2.getPaint();
        // g2.setPaint(Color.RED);
        // g2.drawLine(30, 25, 200, 25);

        g2.setStroke(new BasicStroke(5.6f));    

        Shape andSahpe = Compuerta.getAndShape(200,20, g2);
        g2.draw(andSahpe);
        
        g2.setPaint(Color.BLUE);
        g2.fillRect(197, 20 + 7, 6,  6);
        g2.fillRect(197, 20 + 37, 6,  6);

        g2.setPaint(Color.RED);
        g2.fillRect(307, 20 + 22, 6,  6);

        g2.setPaint(defPaint);
        
        g2.draw(Compuerta.getOrShape(200,200, g2));
    }
}
