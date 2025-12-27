package components;

import design.components.GateShape;

public class NAndGate extends AndGate{

    public NAndGate(){
        super(GateShape.getNAndShape());
    }
}
