package hafta_6_odev;

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

	public static void IcecekStokGuncelle(ArrayList<Beverages> BeveragesList,
			int urunIndexi,boolean Satismi, int miktar)
	{
		int sayac=0;
		for(int i=0;i<BeveragesList.size();i++)
		{
			if(urunIndexi==i)
			{
				if(Satismi)
				{
					int yedek=BeveragesList.get(i).StokMiktari-miktar;
					if(yedek<0)
						System.out.println("istediginiz miktarda urun bulunmamaktadir");
					else
						BeveragesList.get(i).StokMiktari-=miktar;
				}
				else
					BeveragesList.get(i).StokMiktari+=miktar;
				
			sayac=1;
			break;
			}
		}
		if(sayac==0)
			System.out.println("girdigin index bulunmamaktadir");
		Beverages.ListeyiYazdir(BeveragesList);
		
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
