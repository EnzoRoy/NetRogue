package edu.esicad.netrogue;

import java.awt.Graphics;

import javax.swing.JApplet;

public class NetRogueApplet extends JApplet
{
	private static final long serialVersionUID = 1L;
	private GestionnaireRessources ressources;
	private Plateau plateau;

	@Override
	public void init()
	{
		setSize(800, 600);
		ressources = new GestionnaireRessources();
		plateau = new Plateau(20, 20, ressources);
	}
	@Override
	public void start()
	{

	}

	@Override
	public void update(Graphics g)
	{
		paint(g);
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		plateau.dissiner(g);

	}

	@Override
	public void stop()
	{

	}

	@Override
	public void destroy()
	{

	}

}
