import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class AnonymousInnerClass extends Application {
 
    Text t;
    Button b1, b2, b3;
    @Override
    public void start(Stage stage) {
        FlowPane pane = new FlowPane(Orientation.VERTICAL);
        FlowPane p = new FlowPane();
        p.setHgap(20);
        p.setAlignment(Pos.CENTER);
        p.setStyle("-fx-background-color:pink");
        b1 = new Button("Red");
        b2 = new Button ("Green");
        b3 = new Button ("Blue");
        p.getChildren().addAll(b1,b2,b3);
        Pane p2 = new Pane();
        t = new Text(150,40,"Color");
        p2.getChildren().addAll(t);
        b1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                t.setFill(Color.RED);
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                t.setFill(Color.GREEN);
            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                t.setFill(Color.BLUE);
            }
        });
        InnerHandlerTest handler = new InnerHandlerTest();
        b1.setOnAction(handler);
        b2.setOnAction(handler);
        b3.setOnAction(handler);
        //lambda expression:
        /*b1.setOnAction(e-> {
                t.setFill(Color.RED);
        });
        b2.setOnAction(e-> {
                t.setFill(Color.GREEN);
        });
        b3.setOnAction(e-> {
                t.setFill(Color.BLUE);
        });*/
        pane.getChildren().addAll(p,p2);
        Scene scene = new Scene(pane, 400, 400);
        stage.setTitle("Anonymous Inner Class");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    class InnerHandlerTest implements EventHandler<ActionEvent>{
 
        @Override
        public void handle(ActionEvent e) {
            System.out.println(e.getSource());
            if(e.getSource() == b1){
                t.setFill(Color.RED);
            }else if(e.getSource() == b2){
                t.setFill(Color.GREEN);
            } else {
                 t.setFill(Color.BLUE);
            }
        }
    }
}