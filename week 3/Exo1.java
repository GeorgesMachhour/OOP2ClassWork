import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exo1 extends Application {

    @Override
    public void start(Stage stage) {

   /*  Stage s = new Stage();
    Button btn2 = new Button("OK");
    Scene scene2 = new Scene(btn2, 200, 250);
    s.setTitle("My Second GUI");
    s.setScene(scene2);
    s.setX(20);
    s.setY(20);
    s.show(); */

  /*   StackPane pane = new StackPane();
    Button btn1 = new Button("OK");
    pane.getChildren().add(btn1);
    Button btn2 = new Button("Last");
    pane.getChildren().add(btn2);
    Scene scene = new Scene(pane, 200, 250);
    stage.setTitle("My First GUI");
    stage.setScene(scene);
    stage.show(); */

    FlowPane pane = new FlowPane();
    Button btn1 = new Button("OK");
    pane.getChildren().add(btn1);
    Button btn2 = new Button("Last");
    pane.getChildren().add(btn2);
    Scene scene = new Scene(pane, 200, 250);
    stage.setTitle("My First GUI");
    stage.setScene(scene);
    stage.show(); 

    Circle c = new Circle();
    c.setRadius(50);
    c.setCenterX(100);
    c.setCenterY(100);
    c.setStroke(Color.RED);
    c.setFill(Color.YELLOW);
    StackPane pane2 = new StackPane();
    pane2.getChildren().add(c);
    Scene scene2 = new Scene(pane2, 200, 250);
    stage.setTitle("My First GUI");
    stage.setScene(scene2);
    stage.show();


   /*  Button btn1 = new Button("OK");
    Scene scene = new Scene(btn1, 200, 250);
    stage.setTitle("My First GUI");
    stage.setScene(scene);
    stage.show(); */

    }

    public static void main(String[] args) {
        launch(args);
    }
    
}