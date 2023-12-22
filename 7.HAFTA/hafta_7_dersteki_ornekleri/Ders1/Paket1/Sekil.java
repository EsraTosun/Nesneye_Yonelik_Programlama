package Paket1;

public class Sekil 
{
	int defaultVeri=10;
	protected double alan;
	public double cevre;
	
	int GetDefaultVeri()
	{
		return defaultVeri;
		
	}
	
	public Sekil(double alan,double cevre)
	{
		System.out.println("Sekil constructor");
		this.alan=alan; //o anki ulşılmasını istenilen veriyi tutmamızı sağlar (this)
		this.cevre=cevre;
		
		
	}
	
	public void SekilYazdir()
	{
		System.out.println(this.getClass()+" sekil.sekilYazdir()");
		
	}

	public double getAlan() {
		return alan;
	}

	public void setAlan(double alan) {
		this.alan = alan;
	}

	public double getCevre() {
		return cevre;
	}

	public void setCevre(double cevre) {
		this.cevre = cevre;
	}
	
	

	
}
