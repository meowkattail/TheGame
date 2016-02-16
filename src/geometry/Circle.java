package geometry;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Created by Kathy on 1/31/2016.
 */
public class Circle extends Shape {

    @Override
    public void drawMyself(GraphicsContext gc) {
        gc.setFill(Color.PINK);
        gc.fillOval(500, 250, 30, 30);
    }
}
