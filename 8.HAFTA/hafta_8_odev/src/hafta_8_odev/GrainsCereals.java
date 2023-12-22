package hafta_8_odev;

import java.util.ArrayList;


public class GrainsCereals extends Urun
{
	 public String kategoriAdi;
	 public String detay;
	 
	 public  GrainsCereals(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
				String kategoriAdi, String detay) {
			super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
			this.kategoriAdi = kategoriAdi;
			this.detay = detay;
		}
	 
	 public  GrainsCereals(String adi, String birimAgirligi,double birimFiyati,int stokMiktari,String detay) {
			super(adi,birimAgirligi, birimFiyati, stokMiktari);
			this.detay = detay;
		}
	 
	 public  GrainsCereals(String adi, String birimAgirligi,double birimFiyati,int stokMiktari) 
	    {
			super(adi, birimAgirligi, birimFiyati, stokMiktari);
		}

	

	public static void TahilUrunEkle(ArrayList<GrainsCereals> GrainsCerealslist,String Adi, 
			String BirimAgirligi,double BirimFiyati,int StokMiktari)
	{
		ListeyiYazdir(GrainsCerealslist);
		GrainsCereals urun=new GrainsCereals(Adi,BirimAgirligi, BirimFiyati, StokMiktari);
		GrainsCerealslist.add(urun);
		ListeyiYazdir(GrainsCerealslist);
	}
	
	public static void TahilUrunEkle(ArrayList<GrainsCereals> GrainsCerealslist,String Adi, 
			String BirimAgirligi,double BirimFiyati,int StokMiktari,String detay)
	{
		ListeyiYazdir(GrainsCerealslist);
		GrainsCereals urun=new GrainsCereals(Adi, BirimAgirligi, BirimFiyati, StokMiktari,detay);
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
