package Paket2;

import java.util.ArrayList;



public class Condiments extends Urun 
{
	
	protected String kategoriAdi;
	protected String detay;
	
	public Condiments(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
	
	public static void CesniBirimFiyatGuncelle(Condiments CondimentsUrun,double yeniFiyat)
	{
		cesniBirimFiyatGuncelle(CondimentsUrun, yeniFiyat);
	}

	protected static void cesniBirimFiyatGuncelle (Condiments CondimentsUrun,double yeniFiyat)
	{
		CondimentsUrun.BirimFiyati=yeniFiyat;
	}
	
	public static void ListeyiYazdir(ArrayList<Condiments> urun)
	{
		listeyiYazdir(urun);
	}

	
	protected static void listeyiYazdir(ArrayList<Condiments> urun)
	{
		for(int i=0;i<urun.size();i++)
		{
			System.out.println("\t "+urun.get(i).getAdi()+
					"     \t \t "+urun.get(i).KategoriIndex+
					"\t \t      "+urun.get(i).BirimAgirligi+
					"\t \t "+urun.get(i).BirimFiyati+
					"\t \t "+urun.get(i).StokMiktari+
					"\t \t "+urun.get(i).kategoriAdi+
					"\t \t "+urun.get(i).detay);
				}
			System.out.println("listede eleman sayisi:"+urun.size());
			System.out.println();
	}
}
