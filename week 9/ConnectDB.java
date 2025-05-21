import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class ConnectDB extends Application {

    @Override
    public void start(Stage stage) {
        

        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        Button b1 = new Button("Connect");
        b1.setOnAction(e -> {
            DBConnectMySQL db = new DBConnectMySQL();
            Statement st = db.getStatement();
            System.out.println("Connected");
            // if (st != null) {
            //     System.out.println("Connected to the database successfully!");
            // } else {
            //     System.out.println("Failed to connect to the database.");
            // }
        });
        pane.getChildren().add(b1);

        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("ConnectDB");
        stage.setScene(scene);
        stage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}