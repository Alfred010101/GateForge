package components;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;

public class Compuerta{

    // private static final int width = 110;
    // private static final int height = 50;

    public static Shape getAndShape(int x, int y, Graphics2D g2){
        GeneralPath compuertaAnd = new GeneralPath();

        // Cuerpo
        compuertaAnd.moveTo(x + 30,  y);
        compuertaAnd.lineTo(x + 30, y + 50);
        compuertaAnd.lineTo(x + 40, y + 50);
        compuertaAnd.append(new Arc2D.Double(
            x + 30, y,      
            50, 50,
            -90, 180,
            Arc2D.OPEN
        ), true);
        compuertaAnd.closePath();

        // Input A
        compuertaAnd.moveTo(x, y + 10);
        compuertaAnd.lineTo(x + 30, y + 10);

        // Input B
        compuertaAnd.moveTo(x, y + 40);
        compuertaAnd.lineTo(x + 30, y + 40);

        // Output
        compuertaAnd.moveTo(x + 110, y + 25);
        compuertaAnd.lineTo(x + 80, y + 25);

        return compuertaAnd;
    }

    public static Shape getOrShape(int x, int y, Graphics2D g2){
        GeneralPath compuertaOr = new GeneralPath();

        // Cuerpo
        compuertaOr.append(new Arc2D.Double(x - 12, y - 9, 50, 70, -60, 120, Arc2D.OPEN), true);
        compuertaOr.lineTo(x + 75, y - 5);
        // compuertaOr.append(new Arc2D.Double(x + 17, y - 9, 20, 40, 0, 60, Arc2D.OPEN), true);

        // Input A
        compuertaOr.moveTo(x, y + 10);
        compuertaOr.lineTo(x + 30, y + 10);

        // Input B
        compuertaOr.moveTo(x, y + 40);
        compuertaOr.lineTo(x + 30, y + 40);

        // Output
        compuertaOr.moveTo(x + 110, y + 25);
        compuertaOr.lineTo(x + 80, y + 25);

        return compuertaOr;
    }
    
}
