package it.polito.tdp.SpellCheckerModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dizionario {
	
	private List<Parola> parole;
	
	public void Dizionario() {
		this.parole=new ArrayList<>();
	}
	
	public void caricaDizionario(String lingua) throws IOException {
		
		String nomeFile = null;
		if(lingua.equals("English"))
			nomeFile="English.txt";
		else
			nomeFile = "Italian.txt";
		
		FileReader r = new FileReader(nomeFile);
		BufferedReader br = new BufferedReader(r);
		String riga;
		while((riga=br.readLine()) !=null) {
			try{
				
				Parola p = new Parola(riga);
				this.parole.add(p);
				
			} catch(Exception e){
				}		

			}

	}

	public List<Parola> getParole() {
		return parole;
	}

	public void setParole(List<Parola> parole) {
		this.parole = parole;
	}

	
	
	
	
}
