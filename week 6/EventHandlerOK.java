import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventHandlerOK extends Application{

@Override
public void start(Stage stage){

    FlowPane pane = new FlowPane();
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(20);
    Button b1 = new Button("OK");
    Button b2 = new Button("Cancel");

    OuterEventHandler handler = new OuterEventHandler(b1,b2);
    b1.setOnAction(handler);
    b2.setOnAction(handler);

    
    pane.getChildren().addAll(b1, b2);

    Scene scene = new Scene(pane, 200, 200);
    stage.setTitle("Event Handler");
    stage.setScene(scene);
    stage.show();

}

public static void main(String[] args){
    launch(args);
}
}