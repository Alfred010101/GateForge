package components;

import java.awt.Shape;
import java.awt.geom.Point2D;

public abstract class Gate {

    private Point2D.Double position;

    public Shape shape;

    {
        position = new Point2D.Double(0, 0);
    }

    public Gate(Shape shape){
        this.shape = shape;
    }

    public void setPositionX(int posX){
        this.position.setLocation(posX, position.getY());
    }

    public Double getPositionX(){
        return this.position.getX();
    }

    public void setPositionY(int posY){
        this.position.setLocation(position.getX(), posY);
    }

    public Double getPositionY(){
        return this.position.getY();
    }

    public void setPosition(Point2D.Double position){
        this.position = position;
    }

    public Point2D getPosition(){
        return this.position;
    }

}
