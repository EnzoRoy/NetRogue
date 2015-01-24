package edu.esicad.netrogue;

public class Aptitudes
{
	private int vieMax, manaMax, enduranceMax, force, discretion, perception, resistance;

	public Aptitudes(int vieMax, int manaMax, int enduranceMax, int force, int discretion, int perception, int resistance)
	{
		this.vieMax = vieMax;
		this.manaMax = manaMax;
		this.enduranceMax = enduranceMax;
		this.force = force;
		this.discretion = discretion;
		this.perception = perception;
		this.resistance = resistance;
	}
	
	public int getVieMax()
	{
		return vieMax;
	}
	
	public void setVieMax(int vieMax)
	{
		this.vieMax = vieMax;
	}
	
	public int getManaMax()
	{
		return manaMax;
	}
	
	public void setManaMax(int manaMax)
	{
		this.manaMax = manaMax;
	}
	
	public int getEnduranceMax()
	{
		return enduranceMax;
	}
	
	public void setEnduranceMax(int enduranceMax)
	{
		this.enduranceMax = enduranceMax;
	}
	
	public int getForce()
	{
		return force;
	}
	
	public void setForce(int force)
	{
		this.force = force;
	}
	
	public int getDiscretion()
	{
		return discretion;
	}
	
	public void setDiscretion(int discretion)
	{
		this.discretion = discretion;
	}
	public int getPerception()
	{
		return perception;
	}
	
	public void setPerception(int perception)
	{
		this.perception = perception;
	}
	public int getResistance()
	{
		return resistance;
	}
	
	public void setResistance(int resistance)
	{
		this.resistance = resistance;
	}
	
}
