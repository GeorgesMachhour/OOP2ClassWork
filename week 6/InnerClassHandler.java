import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.application.Application;

public class InnerClassHandler extends Application {
    Button b1, b2;
    @Override
    public void start(Stage stage){
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        b1 = new Button("Ok");
        b2 = new Button("Cancel");

        InnerHandler handler = new InnerHandler();
        b1.setOnAction(handler);
        b2.setOnAction(handler);
        
        pane.getChildren().addAll(b1, b2); 

        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("Inner Class Handler");
        stage.setScene(scene);
        stage.show();
    }

    class InnerHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent t){
            if(t.getSource() == b1){
            System.out.println("Ok Button Clicked");
        }else {
            System.out.println("Cancel Button Clicked");
        }
    }
}
public static void main(String[] args){
    launch(args);
}
}