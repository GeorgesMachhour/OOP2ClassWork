import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OuterHandlerUpdateTitle implements EventHandler<ActionEvent> {
   
    UpdateTitle t;
    public OuterHandlerUpdateTitle(UpdateTitle aThis){
        t = aThis;
    }
    @Override
    public void handle(ActionEvent e){
        String title = t.f1.getText();
        t.myStage.setTitle(title);
    }
}