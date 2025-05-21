import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MyRadioButton extends Application {
    @Override
    public void start(Stage stage) {
        FlowPane pane = new FlowPane();
        pane.setVgap(20);
        pane.setAlignment(Pos.CENTER);

        RadioButton r = new RadioButton("Red");
        RadioButton y = new RadioButton("Yellow");
        RadioButton g = new RadioButton("Green");

        ToggleGroup group = new ToggleGroup();
        r.setToggleGroup(group);
        y.setToggleGroup(group);
        g.setToggleGroup(group);

        pane.getChildren().addAll(r, y, g);

        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("My Radio Button");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
