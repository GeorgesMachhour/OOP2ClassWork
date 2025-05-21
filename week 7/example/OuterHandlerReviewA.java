import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class OuterHandlerReviewA implements EventHandler<ActionEvent> {
 
    OuterHandlerReview a;
    public OuterHandlerReviewA(OuterHandlerReview a) {
        this.a = a;
    }
 
    @Override
    public void handle(ActionEvent t) {
        int v = Integer.parseInt(this.a.l.getText());
        this.a.l.setText(""+(v+1));
    }
}