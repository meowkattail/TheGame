import gameobject.PlayerObject;
import geometry.Boundary;
import geometry.Circle;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kathy on 1/29/2016.
 */
public class GameWorld {
    public double garvity = 9.8;
    public PlayerObject playerObject;
    public Level level;

    public void init() throws Exception {
        playerObject = new PlayerObject();
        playerObject.setShape(new Circle());
        level = new Level();
        Point2D.Double leftTopPt = new Point2D.Double(100,150);
        Point2D.Double rightTopPt = new Point2D.Double(900,150);
        Point2D.Double leftBotPt = new Point2D.Double(100,350);
        Point2D.Double rightBotPt = new Point2D.Double(900,350);
        Boundary boundary = new Boundary();
        List<Point2D.Double> boundaryPoints = new ArrayList<>(); //List of BoundaryPoints!
        boundaryPoints.add(leftTopPt);
        boundaryPoints.add(leftBotPt);
        boundaryPoints.add(rightBotPt);
        boundaryPoints.add(rightTopPt);
        boundary.setBoundaryPoints(boundaryPoints);
        List<Boundary> boundaries = new ArrayList<>(); //List of Boundaries!
        boundaries.add(boundary);
        level.setBoundaries(boundaries);
    }

    public void drawMyself(GraphicsContext gc) {
        level.drawMyself(gc);
        playerObject.drawMyself(gc);
    }
}
