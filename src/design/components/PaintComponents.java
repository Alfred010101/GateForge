package design.components;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import components.Gate;
import settings.Config;

public class PaintComponents {

    private static final Color colorFill = new Color(201, 201, 172);
    private static final Color colorBorder = new Color(119, 3, 7);

    public static void draw(Graphics2D g2d, Gate gate){
        
        if(g2d == null || gate == null || gate.getPosition() == null)
            return;

        AffineTransform at = new AffineTransform();

        at.translate(gate.getPositionX(), gate.getPositionY());
        at.scale(Config.escaleView, Config.escaleView);
        
        if(gate.shape != null){
            gate.shape = at.createTransformedShape(gate.shape);
            g2d.setPaint(colorFill);
            g2d.fill(gate.shape);
            g2d.setPaint(colorBorder);
            g2d.draw(gate.shape);
        }
    }

}
