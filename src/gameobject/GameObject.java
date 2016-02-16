package gameobject;

import geometry.Shape;
import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Kathy on 1/29/2016.
 */
public class GameObject {
    public Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void changeOverTime() {
    }

    public void drawMyself(GraphicsContext gc) {
        shape.drawMyself(gc);
    }
}
