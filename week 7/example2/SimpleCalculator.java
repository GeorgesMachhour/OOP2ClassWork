import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 

public class SimpleCalculator extends Application {
 
    @Override
    public void start(Stage stage) {
        GridPane p = new GridPane();
        p.setHgap(20);
        p.setVgap(20);
        Label l1 = new Label("Number 1: ");
        Label l2 = new Label("Number 2: ");
        Label l3 = new Label("Operator: ");
        Label l4 = new Label("Result: ");
        TextField f1 = new TextField();
        TextField f2 = new TextField();
        TextField f3 = new TextField();
        ComboBox cb = new ComboBox();
        cb.getItems().addAll("Add", "Sub", "Mul", "Div", "Mod");
        Button b1 = new Button("submit");
        Button b2 = new Button("Clear");
        p.add(l1, 0, 0);
        p.add(f1, 1, 0);
        p.add(l2, 0, 1);
        p.add(f2, 1, 1);
        p.add(l3, 0, 2);
        p.add(cb, 1, 2);
        p.add(l4, 0, 3);
        p.add(f3, 1, 3);
        p.add(b1, 0, 4);
        p.add(b2, 1, 4);
        b1.setOnAction(e->{
            int v1 = Integer.parseInt(f1.getText());
            int v2 = Integer.parseInt(f2.getText());
            String op = (String)cb.getValue();
            if(op.equals("Add")){
                f3.setText(""+(v1+v2));
            }else if(op.equals("Sub")){
                f3.setText(""+(v1-v2));
            }else if(op.equals("Mul")){
                f3.setText(""+(v1*v2));
            }else if(op.equals("Div")){
                f3.setText(""+(v1/v2));
            } else {
                 f3.setText(""+(v1%v2));
            }
        });
        Scene scene = new Scene(p, 400, 400);
        stage.setTitle("calculator");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}