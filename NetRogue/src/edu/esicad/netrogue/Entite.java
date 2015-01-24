package edu.esicad.netrogue;

public abstract class Entite
{
	private Benediction benediction;
	private int vie, mana, endurance;
	
	public Entite(Classe classe,Benediction benediction)
	{
		this.benediction = benediction;
		vie = classe.getAptitudes().getVieMax();
		mana = classe.getAptitudes().getManaMax();
		endurance = classe.getAptitudes().getEnduranceMax();
	}
	
	public int getVie()
	{
		return vie;
	}
	
	public int getMana()
	{
		return mana;
	}
	
	public int getEndurance()
	{
		return endurance;
	}
	
	public abstract Classe getClasse();
}
