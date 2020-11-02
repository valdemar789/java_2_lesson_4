package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;

    @FXML
    public void clickBtn1(ActionEvent actionEvent) {
        System.out.println("Btn1 clicked");
    }

    @FXML
    public void clickBtn2(ActionEvent actionEvent) {
        textArea.appendText("hello! \n");
    }

    @FXML
    public void clickBtnAddMsg(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.requestFocus();
    }
}
