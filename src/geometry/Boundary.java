package geometry;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.awt.geom.Point2D;
import java.util.List;

/**
 * Created by Kathy on 1/31/2016.
 */
public class Boundary {
    public boolean isOuterBoundary;
    public double[] xPoints;
    public double[] yPoints;

    public void setBoundaryPoints(List<Point2D.Double> boundaryPoints) {
        xPoints = new double[boundaryPoints.size()];
        yPoints = new double[boundaryPoints.size()];
        for (int i = 0; i < boundaryPoints.size(); i++) {
            xPoints[i] = boundaryPoints.get(i).getX();
            yPoints[i] = boundaryPoints.get(i).getY();
        }
    }

    public void setIsOuterBoundary(boolean isOuterBoundary) {
        this.isOuterBoundary = isOuterBoundary;
    }

    public void drawMyself(GraphicsContext gc) {
//        double[] xs = new double[3]; set the array(similar to a list but store things one by one, it is a general type) with size 3.
//        xs[2]; To get the third index since indices start with 0
        gc.setFill(Color.BROWN);
        gc.fillPolygon(xPoints, yPoints, xPoints.length);
    }

    public void respondtoCollision() {
    }
    //gc.fill?
    //boolean(placehoder+setter/something to set the value about true and false)
    //draw itself

}
