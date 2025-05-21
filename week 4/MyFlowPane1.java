import java.util.concurrent.Flow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class MyFlowPane1 extends Application {
    
    @Override
    public void start(Stage stage) {

    /*  FlowPane pane = new FlowPane();//Orientation.VERTICAL
        pane.setHgap(20);
        pane.setVgap(20);
        //pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20,0,0,20));
        Label fn = new Label("First Name");
        TextField tf1 = new TextField();
        tf1.setMaxWidth(100);
        pane.getChildren().addAll(fn, tf1);

        Scene scene = new Scene(pane, 500, 500);
        stage.setTitle("My FlowPane");
        stage.setScene(scene);
        stage.show();
    }
    */

    FlowPane pane = new FlowPane(Orientation.VERTICAL);
        pane.setHgap(10);
        pane.setVgap(10);
        //pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20,0,0,20));

        FlowPane p1 = new FlowPane();
        p1.setHgap(10);
        p1.setPadding(new Insets(20,0,0,20));
        Label fn = new Label("First Name");
        TextField tf1 = new TextField();
        tf1.setMaxWidth(100);
        p1.getChildren().addAll(fn, tf1);

        FlowPane p2 = new FlowPane();
        p2.setHgap(10);
        p2.setPadding(new Insets(20,0,0,20));
        Label ln = new Label("Last Name");
        TextField tf2 = new TextField();
        tf2.setMaxWidth(100);
        p2.getChildren().addAll(ln, tf2);

        FlowPane p3 = new FlowPane();
        p3.setHgap(44);
        p3.setPadding(new Insets(20,0,0,20));
        Label age = new Label("Age");
        TextField tf3 = new TextField();
        tf3.setMaxWidth(40);
        p3.getChildren().addAll(age, tf3);

        FlowPane p4 = new FlowPane();
        p4.setHgap(35);
        p4.setPadding(new Insets(20,0,0,20));
        Label Email = new Label("Email");
        TextField tf4 = new TextField();
        tf4.setMaxWidth(100);
        p4.getChildren().addAll(Email, tf4);

        FlowPane p5 = new FlowPane();
        p5.setHgap(30);
        p5.setPadding(new Insets(20,0,0,20));
        Button b1 = new Button("Submit");
        Button b2 = new Button("Cancel");
        p5.getChildren().addAll(b1, b2);


        pane.getChildren().addAll(p1, p2, p3,p4, p5);
        Scene scene = new Scene(pane, 300, 300);
        stage.setTitle("My FlowPane");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
