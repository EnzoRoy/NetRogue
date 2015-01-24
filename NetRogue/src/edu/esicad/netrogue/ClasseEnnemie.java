package edu.esicad.netrogue;

public class ClasseEnnemie extends Classe
{
	public static enum CLASSE_ENNEMIE {RAT,ZOMBIE,TROLL};
	private CLASSE_ENNEMIE type;

	public ClasseEnnemie(CLASSE_ENNEMIE classeType, Aptitudes aptitudes)
	{
		super(aptitudes);
		this.type = classeType;			
	}


	public CLASSE_ENNEMIE getClasseType()
	{
		return type;
	}
}
