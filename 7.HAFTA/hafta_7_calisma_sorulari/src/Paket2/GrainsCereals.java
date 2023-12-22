package Paket2;

import java.util.ArrayList;



public class GrainsCereals extends Urun
{
	protected static String kategoriAdi;
	protected static String detay;
	 
	 

	 public  GrainsCereals(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
	 
	public static void TahilMinStokEkle (ArrayList<GrainsCereals> GrainsCerealsList,int miktar)
	 {
		tahilMinStokEkle(GrainsCerealsList, miktar);
	 }

	public static void tahilMinStokEkle (ArrayList<GrainsCereals> GrainsCerealsList,int miktar)
	{
		int min=GrainsCerealsList.get(0).StokMiktari,index=0;
		for(int i=0;i<GrainsCerealsList.size();i++)
		{
			if(min>GrainsCerealsList.get(i).StokMiktari)
			{
				min=GrainsCerealsList.get(i).StokMiktari;
				index=i;
			}
		}
		
		GrainsCerealsList.get(index).StokMiktari+=miktar; 
	}
	 public static void ListeyiYazdir(ArrayList<GrainsCereals> urun)
	 {
		 listeyiYazdir(urun);
	 }

	
	 protected static void listeyiYazdir(ArrayList<GrainsCereals> urun)
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
