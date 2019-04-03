package it.polito.tdp.SpellCheckerModel;

public class Parola {
	
	private String parola;
	private Dizionario d =new Dizionario();

	public Parola(String parola) {
		super();
		this.parola = parola;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public boolean eContenuta(String p, Dizionario dd) {
		Dizionario d = dd;
		for(Parola pp : d.getParole()) {
			if(pp.getParola().equals(this.parola))
				return true;
		}
		return false;
	}
	
	

}
