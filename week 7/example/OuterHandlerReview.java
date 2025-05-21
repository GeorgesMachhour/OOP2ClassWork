import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class OuterHandlerReview extends Application {
 
    public Label l;
    public Button b;
    @Override
    public void start(Stage stage) {
        FlowPane p = new FlowPane();
        p.setHgap(20);
        l = new Label("0");
        b = new Button("Add");
        p.getChildren().addAll(b, l);
        OuterHandlerReviewA handler = new OuterHandlerReviewA(this);
        b.setOnAction(handler);
        Scene scene = new Scene(p, 200, 200);
        stage.setTitle("Review");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}