package Paket2;

import java.util.ArrayList;



public class Beverages extends Urun
{
	protected String kategoriAdi;
	protected String detay;
	
	
	public Beverages(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
	
	public static void IcecekUrunuEkle(ArrayList<Beverages> BeveragesList,
			String Adi,String BirimAgirligi,double BirimFiyatı,int StokMiktari)
	{
		icecekUrunuEkle(BeveragesList, Adi, BirimAgirligi, BirimFiyatı, StokMiktari);
	}

	protected static void icecekUrunuEkle(ArrayList<Beverages> BeveragesList,
			String Adi,String BirimAgirligi,double BirimFiyatı,int StokMiktari)
	{
		Beverages yeniBevreagesUrun=new Beverages(BirimAgirligi, StokMiktari, BirimAgirligi, BirimFiyatı, StokMiktari, BirimAgirligi, BirimAgirligi);
		
		yeniBevreagesUrun.setAdi(Adi);
		yeniBevreagesUrun.BirimAgirligi=BirimAgirligi;
		yeniBevreagesUrun.BirimFiyati=BirimFiyatı;
		yeniBevreagesUrun.StokMiktari=StokMiktari;
		yeniBevreagesUrun.KategoriIndex=BeveragesList.get(0).KategoriIndex;
		yeniBevreagesUrun.kategoriAdi=BeveragesList.get(0).kategoriAdi;
		yeniBevreagesUrun.detay=BeveragesList.get(0).detay;
		
		BeveragesList.add(yeniBevreagesUrun);
	}
	
	public static void ListeyiYazdir(ArrayList<Beverages> urun)
	{
		listeyiYazdir(urun);
	}
	
	protected static void listeyiYazdir(ArrayList<Beverages> urun)
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
