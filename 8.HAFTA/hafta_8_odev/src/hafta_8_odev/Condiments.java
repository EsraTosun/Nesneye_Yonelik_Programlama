package hafta_8_odev;

import java.util.ArrayList;


public class Condiments extends Urun 
{
	
	public static String kategoriAdi;
	public static String detay;
	
	public Condiments(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
	 
	public static void CesniBirimAgirlikGuncelle(ArrayList<Condiments> CondimentsList,String yeniAgirlik)
	{
		ListeyiYazdir(CondimentsList);
		CondimentsList.get(CondimentsList.size()-1).BirimAgirligi=yeniAgirlik;
		ListeyiYazdir(CondimentsList);
	}
	
	public static void CesniBirimAgirlikGuncelle(ArrayList<Condiments> CondimentsList,String yeniAgirlik,int index)
	{
		ListeyiYazdir(CondimentsList);
		if(index<0 || index>CondimentsList.size()-1)
		System.out.println("girilen index listede bulunmadigi icin guncellenmedi");
		
		else
		CondimentsList.get(index).BirimAgirligi=yeniAgirlik;
		ListeyiYazdir(CondimentsList);
	}

	
	public static void ListeyiYazdir(ArrayList<Condiments> urun)
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
