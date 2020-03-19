package it.polito.tdp.parole;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco;
	long time;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private TextArea txtTime;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnDelete;

    @FXML
    void doDelete(ActionEvent event) {
    	
    	time = elenco.removeParola(txtResult.getSelectedText());
    	
    	txtResult.setText(elenco.getElenco().toString());
    	txtTime.appendText(""+time+"\n");
    }

    @FXML
    void doInsert(ActionEvent event) {
    	
    	time = elenco.addParola(txtParola.getText());
    	
    	txtResult.setText(elenco.getElenco().toString());
    	txtTime.appendText(""+time+"\n");
    	
    	txtParola.clear();
    }

    @FXML
    void doReset(ActionEvent event) {

    	elenco.reset();
    	
    	txtResult.clear();
    	
    	txtTime.clear();
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnDelete != null : "fx:id=\"btnDelete\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole();
    }
}

