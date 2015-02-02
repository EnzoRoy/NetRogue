package edu.esicad.netrogue;

public class Benediction
{
	private String nomBenediction;
	private float resFeu, resFoudre, resGivre;
	
	public Benediction(String nomBenediction,float resFeu, float resFoudre, float resGivre)
	{
		this.nomBenediction = nomBenediction;
		this.resFeu = resFeu;
		this.resFoudre = resFoudre;
		this.resGivre = resGivre;
	}

	public String getNomBenediction()
	{
		return nomBenediction;
	}
	
	public float getResFeu() 
	{
		return resFeu;
	}

	public float getResFoudre() 
	{
		return resFoudre;
	}

	public float getResGivre() 
	{
		return resGivre;
	}
}