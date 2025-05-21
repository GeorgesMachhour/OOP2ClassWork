import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class MyThread_4 extends Application {
 
    Text textNode;
 
    @Override
    public void start(Stage primaryStage) {
        textNode = new Text("Hello World!!!!");
        textNode.setFont(Font.font(40));
 
        StackPane root = new StackPane();
        root.getChildren().add(textNode);
 
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();
 
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                    textNode.setFill(Color.RED);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        th1.start();
 
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(6000);
                    textNode.setFill(Color.YELLOW);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        th2.start();
 
        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(8000);
                    textNode.setFill(Color.BLUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        th3.start();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}