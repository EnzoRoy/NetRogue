package edu.esicad.netrogue;

import java.util.HashMap;

public class Data
{
	public static enum BENEDICTION {MARA, KYRANETH, TALOS, ZENITHAR, DIBELLA, AZURA};
	private static Data instance;
	
	private HashMap<BENEDICTION, Benediction> benedictions;
	
	private Data()
	{
		initBenedictions();
	}
	public static Data getInstance()
	{
		if (instance == null)
			instance = new Data();
		
		return instance;
	}
	
	
	private void initBenedictions()
	{
		benedictions = new HashMap<BENEDICTION, Benediction>();

		benedictions.put(BENEDICTION.MARA, new Benediction("Mara",0.5f, 2.0f, 0.0f));
	}
	
	public Benediction getBenediction(BENEDICTION benediction)
	{
		return benedictions.get(benediction);
	}
	
	
}
