package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Controller {
    public Label helloWorld;
    public GridPane prozor;

    public void setText(ActionEvent actionEvent) {
        helloWorld.getStyleClass().removeAll("sakriveno");
        helloWorld.getStyleClass().add("prikazano");
        helloWorld.setText("Hello World!");
        prozor.setStyle("-fx-background-color: lightpink");
    }
}
