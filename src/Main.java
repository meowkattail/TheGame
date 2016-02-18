import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Main extends Application {
    public double windowWideth = 1000;
    public double windowHeight = 500;
    public GraphicsContext gc;
    public Thread physicsThread;
    public GameWorld gameWorld;


    @Override
    public void init() throws Exception {
        super.init();
        gameWorld = new GameWorld();
        physicsThread = new Thread(new Runnable() {
            @Override
            public void run() {
                runPhysicsThread();
            }
        });
        physicsThread.setDaemon(true);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void runPhysicsThread() {

    }

    public void drawGameWorld(){
        long currentTime = System.currentTimeMillis();
        long nextTime;
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("breaking");
                break;
            }
            gameWorld.drawMyself(gc);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("THE GAME");
        Group intro = new Group();
        Canvas canvas = new Canvas(windowWideth, windowHeight);
        intro.getChildren().add(canvas);
        Scene primaryScene = new Scene(intro, windowWideth, windowHeight);
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        gc = canvas.getGraphicsContext2D();
        gameWorld.init();
        Runnable drawRunnable = new Runnable() {
            @Override
            public void run() {
                gameWorld.drawMyself(gc);
            }
        };
        new AnimationTimer(){

            @Override
            public void handle(long now) {
                Platform.runLater(drawRunnable);
            }
        }.start();
        physicsThread.start();
    }
}