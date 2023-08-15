package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> ageStudent;

    @FXML
    private TableColumn<?, ?> classStudent;

    @FXML
    private TableColumn<?, ?> idStudent;

    @FXML
    private TableColumn<?, ?> nameStudent;

    @FXML
    private TableColumn<?, ?> surnameStudent;

    @FXML
    void initialize() {
        

    }

}
