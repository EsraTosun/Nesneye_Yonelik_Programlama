package ders1;

public class Kare  extends Dortgen
{

	public int kenar;
	
	public Kare(int kenar) 
	{
		 this.kenar=kenar; 
	}
	
	public void AlanHesapla()
	{
		alan=kenar*kenar;
	}
	
	public void CevreHesapla()
	{
		cevre=4*kenar;
	}
}
