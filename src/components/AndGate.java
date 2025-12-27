package components;

import java.awt.Shape;

import design.components.GateShape;

public class AndGate extends Gate{

    public AndGate(){
        super(GateShape.getAndShape());
    }

    protected AndGate(Shape shape){
        super(shape);
    }
}
