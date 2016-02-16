package geometry;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Created by Kathy on 1/31/2016.
 */
public class QuestionMark extends Shape {
    @Override
    public void drawMyself(GraphicsContext gc) {
        gc.setFill(Color.RED);
    }
}
