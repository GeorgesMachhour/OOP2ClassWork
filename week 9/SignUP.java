import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 

public class SignUP extends Application {
 
    @Override
    public void start(Stage stage)  {
        DBConnectMySQL db = new DBConnectMySQL();
        Statement st = db.getStatement();
        GridPane pane = new GridPane();
        pane.setHgap(20);
        pane.setVgap(20);
        Label l1 = new Label("Username: ");
        Label l2 = new Label("Password: ");
        TextField f1 = new TextField();
        PasswordField f2 = new PasswordField();
        Button b1 = new Button("Save");
        Button b2 = new Button("Display");
        pane.add(l1, 0, 0);
        pane.add(f1, 1, 0);
        pane.add(l2, 0, 1);
        pane.add(f2, 1, 1);
        pane.add(b1, 0, 2);
        pane.add(b2, 1, 2);
        b1.setOnAction(e->{
            String v1 = f1.getText();
            String v2 = f2.getText();
            String query = "insert into login(username, password) values('"+v1+"','"+v2+"')";
            try {
                st.executeUpdate(query);
            } catch (SQLException ex) {
                Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        b2.setOnAction(e->{
            String query = "select * from login";
            try {
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    System.out.print("ID: "+ rs.getInt("id")+"   ");
                    System.out.print("  Username: "+rs.getString("username")+"   ");
                    System.out.println("  Password: "+rs.getString("password")+"   ");
                }
            } catch (SQLException ex) {
                Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Scene scene = new Scene(pane, 400,400);
        stage.setTitle("Connect");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}