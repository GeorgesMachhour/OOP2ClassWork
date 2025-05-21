import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
//import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UpdateTitle extends Application{
    Stage myStage;
    public TextField f1;

@Override

public void start(Stage stage){
     myStage = new Stage();
    FlowPane pane = new FlowPane();
    Label l1 = new Label("Enter Title");
    f1 = new TextField(); 

    Button b = new Button("Update Title");
    OuterHandlerUpdateTitle handler = new OuterHandlerUpdateTitle(this);
    b.setOnAction(handler);
    
    pane.getChildren().addAll(l1, f1, b);

    Scene scene = new Scene(pane, 200, 200);
    myStage.setTitle("Title");
    myStage.setScene(scene);
    myStage.show();
}

public static void main(String[] args){
    launch(args);
}
}