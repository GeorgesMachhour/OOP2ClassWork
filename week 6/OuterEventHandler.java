import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class OuterEventHandler implements EventHandler<ActionEvent> {
    Button b1,b2;
    public OuterEventHandler(Button b1, Button b2){
        this.b1 = b1;
        this.b2 = b2;
    }

    @Override
    public void handle(ActionEvent t){
        //System.out.println(t.getSource());
        if (t.getSource()==b1){
            System.out.println("OK Button Clicked");
        }else  
        System.out.println("Cancel Button Clicked");
    }
}
