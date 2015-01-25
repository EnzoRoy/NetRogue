package edu.esicad.netrogue;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Zone
{
	private int posI,posJ;
	private Image background;
	private boolean estBloquant;
	private Entite entite;
	private ArrayList<Objet> objets;
	
	public Zone(int posI,int posJ,Image background)
	{
		this.posI = posI;
		this.posJ = posJ;
		objets = new ArrayList<Objet>();
		this.background = background;
	}
	public Entite getEntite()
	{
		return entite;
	}
	public boolean contientEntite()
	{
		return getEntite() != null;
	}
	public boolean estBloquant()
	{
		return estBloquant;
	}
	public void dessinerZone(Graphics g)
	{
		g.drawImage(background, posI*50, posJ*50,50,50,null);
	}
}
