import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class MyGridPane extends Application{
//pane for gridpane
//pane2 for flowpane

    @Override
    public void start(Stage stage) {

        GridPane pane = new GridPane();
        pane.setPadding( new Insets(20, 0, 0, 20));
        pane.setHgap(20);
        pane.setVgap(20);

        Label width = new Label("Width");
        TextField t1 = new TextField();

        Label height = new Label("Height");
        TextField t2 = new TextField();

        Label area = new Label("Area");
        TextField t3 = new TextField();

        Label per = new Label("Perimeter");
        TextField t4 = new TextField();

        Button b1 = new Button("Calculate");
        Button b2 = new Button("Clear");

        pane.add(width, 0, 0);
        pane.add(t1, 1, 0);

        pane.add(height, 0, 1);
        pane.add(t2, 1, 1);

        pane.add(area, 0, 2);
        pane.add(t3, 1, 2);

        pane.add(per, 0, 3);
        pane.add(t4, 1, 3);

        
       FlowPane pane2 = new FlowPane();
        pane2.setHgap(40);
        pane2.setVgap(10);
        pane2.getChildren().addAll(b1, b2);
        pane.add(pane2, 1, 4); 

        // pane.add(b1, 1, 4);
        // pane.add(b2, 2, 4);
        pane.addRow(4, new Button("Test1"), new Button("Test2"));
        //pane.addColumn(2, new Button("Test3"), new Button("Test4"));


        Scene scene = new Scene(pane, 400, 400);
        stage.setTitle("My Grid Pane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
