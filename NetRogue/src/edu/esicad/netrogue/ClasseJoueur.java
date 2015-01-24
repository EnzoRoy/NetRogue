package edu.esicad.netrogue;

public class ClasseJoueur extends Classe
{
	public static enum CLASSE_JOUEUR {GUERRIER,MAGICIEN,CHASSEUR};
	private CLASSE_JOUEUR type;

	public ClasseJoueur(CLASSE_JOUEUR classeType, Aptitudes aptitudes)
	{
		super(aptitudes);
		this.type = classeType;			
	}

	
	public CLASSE_JOUEUR getClasseType()
	{
		return type;
	}
}