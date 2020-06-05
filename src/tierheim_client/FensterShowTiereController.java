/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tierheim_client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author tamar
 */
public class FensterShowTiereController implements Initializable {

    @FXML
    private TableView<Tier> myTableView;
    @FXML
    private TableColumn<Tier, String> clmnName;
    @FXML
    private TableColumn<Tier, String> clmnTyp;
    @FXML
    private TableColumn<Tier, Integer> clmnAge;
    @FXML
    private TableColumn<Tier, String> clmnGender;
    @FXML
    private TableColumn<Tier, String> clmnLebensraum;
    @FXML
    private TableColumn<Tier, ?> clmnImage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
