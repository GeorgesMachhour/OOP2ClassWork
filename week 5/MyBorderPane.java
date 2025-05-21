//import java.util.concurrent.Flow;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MyBorderPane extends Application{

    @Override
    public void start(Stage stage){
    BorderPane pane = new BorderPane();
    Button b1 = new Button("Top");
    Button b2 = new Button("Bottom");
    b2.setBackground(Background.fill(Color.GREEN));
    Button b3 = new Button("Left");
    Button b4 = new Button("Right");
    Button b5 = new Button("Center");

    FlowPane p1 = new FlowPane();
    p1.setAlignment(Pos.CENTER);
    p1.setStyle("-fx-background-color: gold");
    p1.getChildren().add(b1);


    FlowPane p2 = new FlowPane();
    p2.setAlignment(Pos.CENTER);
    p2.getChildren().add(b2);

    FlowPane p3 = new FlowPane(Orientation.VERTICAL);
    p3.setAlignment(Pos.CENTER);
    p3.getChildren().add(b3);

    FlowPane p4 = new FlowPane(Orientation.VERTICAL);
    p4.setAlignment(Pos.CENTER);
    p4.getChildren().add(b4);

    FlowPane p5 = new FlowPane();
    p5.setAlignment(Pos.CENTER);
    p5.getChildren().add(b5);

pane.setTop(p1);
pane.setBottom(p2);
pane.setLeft(p3);
pane.setRight(p4);
pane.setCenter(p5);

Scene scene = new Scene(pane, 400, 400);
stage.setTitle("My Border Pane");
stage.setScene(scene);
stage.show();

}
public static void main(String[] args) {
    launch(args);
}

}