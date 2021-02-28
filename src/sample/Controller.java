package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextArea mainTextArea;

    @FXML
    TextField msgField;

    public void clikSendButton(ActionEvent actionEvent) {
        if (!msgField.getText().isEmpty()) {
            mainTextArea.appendText(msgField.getText() + "\n");
            msgField.clear();
        }
    }
}
