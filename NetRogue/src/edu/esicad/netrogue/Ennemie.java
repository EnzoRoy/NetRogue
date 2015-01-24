package edu.esicad.netrogue;

public class Ennemie extends Entite
{
	private ClasseEnnemie ennemie;
	
	public Ennemie(Benediction benediction, ClasseEnnemie ennemie)
	{
		super(ennemie,benediction);
	}

	@Override
	public ClasseEnnemie getClasse()
	{
		return ennemie;
	}
	
}
