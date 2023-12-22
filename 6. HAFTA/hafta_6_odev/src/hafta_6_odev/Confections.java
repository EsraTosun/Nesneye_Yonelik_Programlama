package hafta_6_odev;

import java.util.ArrayList;


public class Confections extends Urun
{

	public static String kategoriAdi;
    public static String detay;
    
    public Confections()
	 {
		 this.kategoriAdi=kategoriAdi;
		 this.detay=detay;
	 }
    
    public static void SekerlemeDetayEkle(ArrayList<Confections> confectionsList,String yeniDetay)
    {
    	ListeyiYazdir(confectionsList);
    	detay=detay.concat(","+yeniDetay);
    	ListeyiYazdir(confectionsList);
    }
	
	public static void ListeyiYazdir(ArrayList<Confections> urun)
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
