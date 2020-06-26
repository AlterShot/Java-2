package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    TextArea mainTextArea;

    @FXML
    TextField textField;

    @FXML
    void ButtonPressed() {
        mainTextArea.appendText(textField.getText() + "\n");
        System.out.println();
        textField.setText("");
    }

    @FXML
    void textFieldEnterPressed() {
        ButtonPressed();
    }

    Button button  = new Button("Enter");

    public void btnOneClickAction(ActionEvent actionEvent) {
        Button thisButton = (Button)actionEvent.getSource();
        mainTextArea.appendText(textField.getText() + "\n");
        System.out.println();
        textField.setText("");

    }
}

