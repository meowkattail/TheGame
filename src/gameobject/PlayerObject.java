package gameobject;

import geometry.Shape;
import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Kathy on 1/29/2016.
 */
public class PlayerObject extends GameObject{
    @Override
    public void setShape(Shape circle) {
        super.setShape(circle);
    }

    public void jump(){
    }
    public void respondToForce(){
    }
    public void respondToCollision(){
    }
}
