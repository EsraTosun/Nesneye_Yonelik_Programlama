package ders1;

public class Daire extends Sekil
{
	int r;
	String adi;
	
	public Daire(int r,String adi) //kurucu method
	{
		System.out.println(this.getClass()+"  DAIRE KURUCU METHOD\n");
		this.r=r; //dönderdiğimiz nesneyi r değerini iki de bşr göndermemek için tanımlarız
		this.adi=adi;
	}
	
	public double AlanHesapla()
	{
		alan=Math.PI*r*r;
		return alan;
	}
	
	public void CevreHesapla()
	{
		cevre=2*Math.PI*r;
	}

}
