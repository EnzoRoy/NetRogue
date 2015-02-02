package edu.esicad.netrogue;

public abstract class Objet
{
	
	private String nomObjet;
	
	public String getNomObjet() {
		return nomObjet;
	}

	public void setNomObjet(String nomObjet) {
		this.nomObjet = nomObjet;
	}

	public Objet(String nomObjet)
	{
		this.nomObjet = nomObjet;
	}
	

	
}