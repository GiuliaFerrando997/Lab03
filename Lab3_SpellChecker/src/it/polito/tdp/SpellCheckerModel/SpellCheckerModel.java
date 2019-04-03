package it.polito.tdp.SpellCheckerModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.ReadOnlyObjectProperty;

public class SpellCheckerModel {
	
	private List<Parola> paroleScritte;
	private Dizionario d = new Dizionario();
	
	public SpellCheckerModel() {
		this.paroleScritte = new ArrayList<>();
		
	}
	
	public void prendiParole(Parola parole) {
		this.paroleScritte.add(parole);
	}
	
	public List<Parola> paroleSbagliate(){
		List<Parola> errate = new ArrayList<>();
		for(Parola p : this.paroleScritte) {
			if(p.eContenuta(p.getParola(), d)==false)
				errate.add(p);
		}
		
		return errate;
	}
	
	public void Cancella() {
		this.paroleScritte.clear();
	}


	public void caricaDizionario(String lingua2) throws IOException {
		d.caricaDizionario(lingua2);
		
	}
}
