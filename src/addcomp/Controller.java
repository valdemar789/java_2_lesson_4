package addcomp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.Random;

public class Controller {
    Random random = new Random();

    @FXML
    public Button btnAdd;
    @FXML
    public VBox vbox;

    @FXML
    public void clickAddBtn(ActionEvent actionEvent) {
        int x = random.nextInt(100);
        Button button = new Button("Button_" + x);
        vbox.getChildren().add(button);

        button.setOnAction(event -> {
            System.out.println(x);
            button.setStyle("-fx-background-image: url(\"https://strana.ua/img/article/2625/70_main.jpeg\");");
        });
    }
}
