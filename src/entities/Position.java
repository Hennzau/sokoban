package entities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("409f3e62-427e-44fa-a451-4cd652e531d8")
public class Position {
// Position in a grid
    @objid ("457f2a1d-6712-4686-9009-ddd92e9d9d24")
    private int x = 0;

    @objid ("493f0647-7903-45c0-8aa1-0fcbf5fbdd6f")
    private int y = 0;

    @objid ("81855c02-90a5-4cf7-8313-a6e1ec3b10a8")
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
