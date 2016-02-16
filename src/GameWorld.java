import gameobject.PlayerObject;
import geometry.Circle;
import geometry.Shape;
import javafx.scene.canvas.GraphicsContext;

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
    }

    public void drawMyself(GraphicsContext gc) {
        playerObject.drawMyself(gc);
        level.drawMyself(gc);
    }
}
