package design;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

import components.AndGate;
import components.NAndGate;
import components.NOrGate;
import components.NotGate;
import components.OrGate;
import components.XNOrGate;
import components.XOrGate;
import design.components.PaintComponents;
import settings.Config;

public class PanelDraw extends JPanel {

    {
        setBackground(new Color(255, 247, 237));
        setBackground(new Color(223, 234, 208));
        setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.LIGHT_GRAY);

        Config.escaleView = 1.2;

        int malla = (int) (Config.escaleView * 10);

        for(int i = malla; i < getWidth(); i += malla){
            g2d.drawLine(i, 0, i, getHeight());
        }

        for(int i = malla; i < getHeight(); i += malla){
            g2d.drawLine(0, i, getWidth(), i);
        }

        g2d.setStroke(new BasicStroke(3.0f));
        g2d.setPaint(Color.RED);
        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );

        AndGate andShape = new AndGate();
        andShape.setPosition(new Point2D.Double(3 * malla, 2 * malla));
        PaintComponents.draw(g2d, andShape);

        OrGate orShape = new OrGate();
        orShape.setPosition(new Point2D.Double(3 * malla, 8 * malla));
        PaintComponents.draw(g2d, orShape);

        NotGate notShape = new NotGate();
        notShape.setPosition(new Point2D.Double(3 * malla, 14 * malla));
        PaintComponents.draw(g2d, notShape);

        NAndGate nAndShape = new NAndGate();
        nAndShape.setPosition(new Point2D.Double(17 * malla, 2 * malla));
        PaintComponents.draw(g2d, nAndShape);

        NOrGate nOrShape = new NOrGate();
        nOrShape.setPosition(new Point2D.Double(17 * malla, 8 * malla));
        PaintComponents.draw(g2d, nOrShape);

        XOrGate xOrShape = new XOrGate();
        xOrShape.setPosition(new Point2D.Double(17 * malla, 14 * malla));
        PaintComponents.draw(g2d, xOrShape);

        XNOrGate xNOrShape = new XNOrGate();
        xNOrShape.setPosition(new Point2D.Double(17 * malla, 20 * malla));
        PaintComponents.draw(g2d, xNOrShape);
        
    }
}
