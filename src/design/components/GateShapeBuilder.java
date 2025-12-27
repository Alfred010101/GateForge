package design.components;

import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;

public final class GateShapeBuilder
{

    private GeneralPath gp = new GeneralPath();

    public GateShapeBuilder begin()
    {
        this.gp = new GeneralPath();

        return this;
    }

    public GeneralPath build()
    {
        return this.gp;
    }

    public GateShapeBuilder createPinIn(int x1, int y1, int x2, int y2)
    {
        return createPin(x1, y1, x2, y2);
    }

    public GateShapeBuilder createPinOut(int x1, int y1, int x2, int y2)
    {
        return createPin(x1, y1, x2, y2);
    }

    private GateShapeBuilder createPin(int x1, int y1, int x2, int y2)
    {
        this.gp.moveTo(x1, y1);
        this.gp.lineTo(x2, y2);

        return this;
    }

    public GateShapeBuilder creatAndBody()
    {
        this.gp.moveTo(20, 0);
        this.gp.lineTo(20, 40);
        this.gp.append(new Arc2D.Double(
                39, 0,
                40, 40,
                -90, 180,
                Arc2D.OPEN
        ),true);

        this.gp.closePath();

        return this;
    }

    public GateShapeBuilder createOrBody()
    {
        this.gp.append(new Arc2D.Double(
                10, 0, 
                25, 40,
                -90, 180,
                Arc2D.OPEN
        ), false);

        this.gp.append(new Arc2D.Double(
                25, 0,
                60, 101,
                90, -52.7,
                Arc2D.OPEN
        ), true);

        this.gp.append(new Arc2D.Double(
                25, -61,
                60, 101,
                -37.3, -52.7,
                Arc2D.OPEN
        ), true);

        this.gp.closePath();

        return this;
    }

    public GateShapeBuilder createNotBody()
    {
        this.gp.moveTo(20, 5);
        this.gp.lineTo(20, 35);
        this.gp.lineTo(39, 20);
        this.gp.closePath();
        return this;
    }

    public GateShapeBuilder createArcX(){
        this.gp.append(new Arc2D.Double(
                3, 0, 
                25, 40,
                -90, 180,
                Arc2D.OPEN
        ), false);
        
        this.gp.append(new Arc2D.Double(
                3, 0, 
                25, 40,
                90, -180,
                Arc2D.OPEN
        ), true);

        this.gp.closePath();

        return this;
    }

    
    public GateShapeBuilder createCircleNot(int x, int y){
        gp.append(new Arc2D.Double(
            x, y, 
            6, 6, 
            0, 360, 
            Arc2D.OPEN
        ), false);

        return this;
    }
}
