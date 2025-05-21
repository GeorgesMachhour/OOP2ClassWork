import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exo2 extends Application {

    @Override
    public void start(Stage stage) {

        int radius = 20;
        StackPane pane = new StackPane();

        for(int i=1; i<=20; i++){
            Circle c = new Circle();
            c.setCenterX(200);
            c.setCenterY(200);
            c.setRadius(radius);
            c.setStroke(Color.RED);
            c.setFill(Color.TRANSPARENT);
           // c.setOpacity(1.0);
            pane.getChildren().add(c);
            radius += 10;
        }

        Scene scene = new Scene(pane, 500, 500);
        stage.setTitle("Circle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}