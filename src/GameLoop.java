import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GameLoop extends AnimationTimer {

    private GraphicsContext gc;
    private double playerX = 100;
    private double playerY = 100;

    public GameLoop(GraphicsContext gc) {
        this.gc = gc;
    }

    @Override
    public void handle(long now) {
        // Bersihkan layar
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(0, 0, 800, 600);

        // Gambar player
        gc.setFill(Color.RED);
        gc.fillRect(playerX, playerY, 40, 40); // ukuran player

        // TODO: gerakan dan logika nanti di sini
    }
}
