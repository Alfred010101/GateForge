package design.components;

import java.awt.Shape;

public final class GateShape
{
    public static Shape getAndShape()
    {
        return new GateShapeBuilder().begin()
                    .createPinIn(0, 10, 20, 10)
                    .createPinIn(0, 30, 20, 30)
                    .creatAndBody()
                    .createPinOut(79, 20, 100, 20)
                    .build();
    }

    public static Shape getOrShape() 
    {
        return new GateShapeBuilder().begin()
                    .createPinIn(0, 10, 33, 10)
                    .createPinIn(0, 30, 33, 30)
                    .createOrBody()
                    .createPinOut(79, 20, 100, 20)
                    .build();
    }

    public static Shape getNotShape()
    {
        return new GateShapeBuilder().begin()
                .createPinIn(0, 20, 20, 20)
                .createNotBody()
                .createCircleNot(39, 17)
                .createPinOut(45,20,60, 20)
                .build();
    }

    public static Shape getNAndShape()
    {
        return new GateShapeBuilder().begin()
                    .createPinIn(0, 10, 20, 10)
                    .createPinIn(0, 30, 20, 30)
                    .creatAndBody()
                    .createCircleNot(79, 17)
                    .createPinOut(85, 20, 100, 20)
                    .build();
    }

    public static Shape getNOrShape() 
    {
        return new GateShapeBuilder().begin()
                    .createPinIn(0, 10, 33, 10)
                    .createPinIn(0, 30, 33, 30)
                    .createOrBody()
                    .createCircleNot(79, 17)
                    .createPinOut(85, 20,100, 20)
                    .build();
    }

    public static Shape getXOrShape() 
    {
        return new GateShapeBuilder().begin()
                    .createPinIn(0, 10, 26, 10)
                    .createPinIn(0, 30, 26, 30)
                    .createArcX()
                    .createOrBody()                    
                    .createPinOut(79, 20, 100, 20)
                    .build();
    }

    public static Shape getNXOrShape() 
    {
        return new GateShapeBuilder().begin()
                    .createPinIn(0, 10, 26, 10)
                    .createPinIn(0, 30, 26, 30)
                    .createArcX()
                    .createOrBody()
                    .createCircleNot(79, 17)
                    .createPinOut(85, 20,100, 20)
                    .build();
    }
}
