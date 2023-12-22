package hafta_6_calisma_sorulari;

import java.util.ArrayList;

public class Beverages extends Urun
{
	public static String kategoriAdi;
	public static String detay;
	
	public Beverages()
	 {
		 this.kategoriAdi=kategoriAdi;
		 this.detay=detay;
	 }

	
	static void IcecekUrunuEkle(ArrayList<Beverages> BeveragesList,
			String Adi,String BirimAgirligi,double BirimFiyatı,int StokMiktari)
	{
		Beverages yeniBevreagesUrun=new Beverages();
		
		yeniBevreagesUrun.Adi=Adi;
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
	
	

