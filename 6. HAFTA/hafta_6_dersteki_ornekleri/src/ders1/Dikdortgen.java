package ders1;

public class Dikdortgen extends Dortgen
{
	public int kenar1,kenar2;
	
	public Dikdortgen(int kenar1,int kenar2)
	{
		this.kenar1=kenar1;
		this.kenar2=kenar2;
	}
	
	public void AlanHesapla()
	{
		alan=kenar1*kenar2;
	}
	
	public void CevreHesapla()
	{
		cevre=2*(kenar1+kenar2);
	}

}
