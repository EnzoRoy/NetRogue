package edu.esicad.netrogue;

public class Joueur extends Entite
{
	private ClasseJoueur classeJoueur;
	private String pseudo;
	
	public Joueur(Benediction benediction, String pseudo, ClasseJoueur classeJoueur)
	{
		super(classeJoueur,benediction);
		this.classeJoueur = classeJoueur;
		this.pseudo = pseudo;
		
	}

	public String getPseudo()
	{
		return pseudo;
	}

	@Override
	public ClasseJoueur getClasse()
	{
		return classeJoueur;
	}
}
