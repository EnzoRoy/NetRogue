package edu.esicad.netrogue;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class GestionnaireRessources
{
	private Image imageSolPierre;

	public GestionnaireRessources()
	{
		try
		{
			URL ressource = getClass().getClassLoader().getResource("edu/esicad/netrogue/ressources/ground.jpg");
			imageSolPierre = ImageIO.read(ressource);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public Image getImageSolPierre()
	{
		return imageSolPierre;
	}
}
