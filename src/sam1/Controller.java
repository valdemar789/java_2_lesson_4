package sam1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public Button btn1;
    public Slider slider;
    public Label label;

    @FXML
    public void clickBtn1(ActionEvent actionEvent) {
    }

    public void clickMenuClose(ActionEvent actionEvent) {
        Platform.runLater(()->{
            Stage stage = (Stage)btn1.getScene().getWindow();
            stage.close();
        });
    }

    public void onMouseReleasedSlider(MouseEvent mouseEvent) {
        label.setText(String.format("slider value: %.01f",slider.getValue()));
    }
}
