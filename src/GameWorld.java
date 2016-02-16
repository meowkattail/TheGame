import gameobject.PlayerObject;
import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Kathy on 1/29/2016.
 */
public class GameWorld {
    public double garvity = 9.8;
    public PlayerObject playerObject;
    public Level level;

    public void drawMyself(GraphicsContext gc) {
        playerObject.drawMyself(gc);
        level.drawMyself(gc);
    }
}
