package javasaxparser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author NicoleDillon
 */
public class XMLDocumentParserUIController implements Initializable {

    Stage stage;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.stage = stage;
    }    
    
     @FXML
    private void handleButtonAction(ActionEvent event) throws Exception {
        FileChooser chooseFile = new FileChooser();
        chooseFile.setTitle("Open XML File");
        chooseFile.getExtensionFilters().add(new FileChooser.ExtensionFilter("XML files (*.xml)", "*.xml"));
        File file = chooseFile.showOpenDialog(stage);
        
        XMLNode root = ParserXML.parse(file);
    }

}
