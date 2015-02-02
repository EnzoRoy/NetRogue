package edu.esicad.netrogue;

public class Benediction
{
	//public static enum BENEDICTION {MARA, KYRANETH, TALOS, ZENITHAR, DIBELLA, AZURA};
	private float resFeu, resFoudre, resGivre;
	
	public Benediction(float resFeu, float resFoudre, float resGivre)
	{
		this.resFeu = resFeu;
		this.resFoudre = resFoudre;
		this.resGivre = resGivre;
	}

	public float getResFeu() {
		return resFeu;
	}

	public void setResFeu(float resFeu) {
		this.resFeu = resFeu;
	}

	public float getResFoudre() {
		return resFoudre;
	}

	public void setResFoudre(float resFoudre) {
		this.resFoudre = resFoudre;
	}

	public float getResGivre() {
		return resGivre;
	}

	public void setResGivre(float resGivre) {
		this.resGivre = resGivre;
	}
	
	//public static final Benediction mara = new Benediction(0.5f, 2.0f, 0.0f);
}