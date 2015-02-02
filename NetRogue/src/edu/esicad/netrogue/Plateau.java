package edu.esicad.netrogue;

import java.awt.Graphics;

public class Plateau
{
	private int nbLig;
	private int nbCol;
	private Zone[][] zones;
	
	
	public Plateau(int n, int p,GestionnaireRessources gestionnaire){
		nbLig = n;
		nbCol = p;
		zones = new Zone[nbLig][nbCol];
	
		for(int i = 0; i < nbLig; i++){
			for(int j = 0; j < nbCol; j++){
				zones[i][j] = new Zone(i,j,gestionnaire.getImageSolPierre());
			}
		}
	}
	public int getLargeur()
	{
		return nbLig;
	}
	
	public int getHauteur()
	{
		return nbCol;
	}
	
	public Zone getZone(int i, int j)
	{
		return zones[i][j];
	}
	
	public void dessiner(Graphics g)
	{
		for (int i=0;i<getLargeur();++i)
			for (int j=0;j<getHauteur();++j)
				zones[i][j].dessinerZone(g);
	}
	
	
}
