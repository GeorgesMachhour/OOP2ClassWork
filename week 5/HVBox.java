import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class HVBox extends Application{
    @Override
    public void start(Stage stage){
        HBox hbox = new HBox(5);
        hbox.getChildren().addAll(new Button("Left"), new Button("Right"), new Button("test"));
        
        Pane p = new Pane();
        Text t = new Text(50, 50, "JavaFX Programming");
        p.getChildren().add(t);        

        Scene scene = new Scene(hbox, 400, 400);
        stage.setTitle("HBox Pane");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}

