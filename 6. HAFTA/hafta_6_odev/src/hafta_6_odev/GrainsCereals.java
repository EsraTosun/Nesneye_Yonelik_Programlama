package hafta_6_odev;

import java.util.ArrayList;


public class GrainsCereals extends Urun
{
	 public static String kategoriAdi;
	 public static String detay;
	 
	 public GrainsCereals()
	 {
		 this.kategoriAdi=kategoriAdi;
		 this.detay=detay;
	 }

	public static void TahilUrunEkle(ArrayList<GrainsCereals> GrainsCerealslist,String Adi, 
			String BirimAgirligi,double BirimFiyati,int StokMiktari)
	{
		GrainsCereals urun=new GrainsCereals();
		urun.Adi=Adi;
		urun.KategoriIndex=1;
		urun.BirimAgirligi=BirimAgirligi;
		urun.BirimFiyati=BirimFiyati;
		urun.StokMiktari=StokMiktari;
		urun.detay=detay;
		urun.kategoriAdi=kategoriAdi;
		
		GrainsCerealslist.add(urun);
		ListeyiYazdir(GrainsCerealslist);
	}
	
	public static void ListeyiYazdir(ArrayList<GrainsCereals> urun)
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
