package ders2;

public class Musteri 
{
	public String Adi;
	public String Soyadi;
	public int puan;
	public double FaturaTutari;
	public boolean AktifMi;
	public String sehir;
	
	public void PuanGuncelle(int ekstra)
	{
		this.puan=this.puan+ekstra;
		
	}

}
