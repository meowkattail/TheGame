package geometry;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.awt.geom.Point2D;

/**
 * Created by Kathy on 1/29/2016.
 */
public abstract class Shape {
    public double size;
    public Point2D.Double location;

    public abstract void drawMyself(GraphicsContext gc);

    public Color color;

    public void setColor(Color color) {
        this.color = color;
    }

}
