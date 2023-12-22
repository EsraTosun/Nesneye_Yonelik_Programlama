package Paket2;

import java.util.ArrayList;


public class Confections extends Urun
{

	protected String kategoriAdi;
	protected static String detay;
    
   
    
    public Confections(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
    
    public static void SekerlemeDetayEkle(ArrayList<Confections> confectionsList,String yeniDetay)
    {
    	sekerlemeDetayEkle(confectionsList, yeniDetay);
    }

	protected static void sekerlemeDetayEkle(ArrayList<Confections> confectionsList,String yeniDetay)
    {
    	ListeyiYazdir(confectionsList);
    	detay=detay.concat(","+yeniDetay);
    	ListeyiYazdir(confectionsList);
    }
	
	 public static void ListeyiYazdir(ArrayList<Confections> urun)
	 {
		 listeyiYazdir(urun);
	 }
	
    protected static void listeyiYazdir(ArrayList<Confections> urun)
	{
		for(int i=0;i<urun.size();i++)
		{
			System.out.println("\t "+urun.get(i).Adi+
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
