package it.polito.tdp.spellchecker.controller;

import it.polito.tdp.SpellCheckerModel.SpellCheckerModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class SpellCheckerController {
		
		SpellCheckerModel elenco;
		private SpellCheckerModel model;
		
		public void setModel(SpellCheckerModel model) {
			this.model = model;
		}

	    @FXML
	    private ComboBox<?> btmSelezione;

	    @FXML
	    private TextArea txtDaInserire;

	    @FXML
	    private Button btnSpell;

	    @FXML
	    private TextArea txtRisultato;

	    @FXML
	    private TextField txtNumeroErrosi;

	    @FXML
	    private Button btnClear;

	    @FXML
	    private TextField txtTempo;

	    @FXML
	    void Cancella(ActionEvent event) {

	    }

	    @FXML
	    void Spelling(ActionEvent event) {

	    }

	
}
