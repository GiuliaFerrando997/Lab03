package it.polito.tdp.spellchecker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.SpellCheckerModel.Dizionario;
import it.polito.tdp.SpellCheckerModel.Parola;
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
	    private ComboBox<String> btmSelezione;
	    

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
	    	txtRisultato.clear();
	    	txtDaInserire.clear();
	    	model.Cancella();
	    }

	    @FXML
	    void Spelling(ActionEvent event) throws IOException {
	    	String lingua = btmSelezione.getValue();
	    	model.caricaDizionario(lingua);
	    	List<Parola> paroleScritte = new ArrayList<>();
	    	String testo = txtDaInserire.getText().replaceAll("[.,\\/!#$%//"
	    			+ "^&*;:]", "");
	    	String[] parole = testo.split(" ");
	    	for(String s : parole) {
	    		Parola p = new Parola(s);
	    		model.prendiParole(p);
	    	List<Parola> errate = new ArrayList<>();
	    	double inizio = System.currentTimeMillis();
	    	errate.addAll(model.paroleSbagliate());
	    	double fine = System.currentTimeMillis();
	    	double tempo = fine - inizio;
	    		for (Parola pp : errate) {
	    		txtRisultato.setText(pp.getParola());
	    		}
	    	txtTempo.setText("Spell check completed in" +tempo+ "seconds");
	    	}
	    	
	    }

			@FXML
			public void initialize() throws IOException{
				btmSelezione.getItems().addAll("English", "Italian");
			}
				
				

	
}
