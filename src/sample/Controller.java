package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.concurrent.ThreadLocalRandom;

public class Controller {
    @FXML
    public Button yesbtn;
    @FXML
    public Button nobtn;
    @FXML
    public Label msg;

    @FXML
    protected void yes(){
        msg.setOpacity(1);
    }
    @FXML
    protected void no(){
        int x = ThreadLocalRandom.current().nextInt(600);
        int y = ThreadLocalRandom.current().nextInt(600);
        nobtn.setLayoutX(x);
        nobtn.setLayoutY(y);
    }
}
