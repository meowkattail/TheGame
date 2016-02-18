import gameobject.TempoaryObject;
import geometry.Boundary;
import javafx.scene.canvas.GraphicsContext;

import java.util.List;

/**
 * Created by Kathy on 1/29/2016.
 */
public class Level {
    public List<Boundary> boundaries;
    public List<TempoaryObject> tempoaryObjects;
    public double scaleOfTO;

    public void setBoundaries(List<Boundary> boundaries) {
        this.boundaries = boundaries;
    }

    public void addGoalObject(){
    }
    public double WallObject;
    public void drawMyself(GraphicsContext gc){
        for (int i = 0; i < boundaries.size() ; i++) {
            boundaries.get(i).drawMyself(gc);
        }
    }
}
