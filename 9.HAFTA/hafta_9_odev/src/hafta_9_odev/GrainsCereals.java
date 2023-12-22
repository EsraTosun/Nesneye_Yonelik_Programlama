
package hafta_9_odev;

import java.util.ArrayList;


public class GrainsCereals extends Urun implements IUrun
{
	public String kategoriAdi;
	public String detay;
	public int katSayi;
	
	 public GrainsCereals()
	 {
		
	 }
	 
	 public  GrainsCereals(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
				String kategoriAdi, String detay,int katSayi) {
			super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
			this.kategoriAdi = kategoriAdi;
			this.detay = detay;
			this.katSayi=katSayi;
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


	@Override
	public void UrunStokGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int adet, boolean GirisMi,String islemYapilacakUrun) 
	{
		int kontrol=0;
		GrainsCereals.ListeyiYazdir(GrainsCerealslist);	
	     for(int i=0;i<GrainsCerealslist.size();i++)
		 {
	    	 if(GrainsCerealslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
		     {
	    	if(GirisMi==false)
			{
	    		if(GrainsCerealslist.get(i).StokMiktari-adet-GrainsCerealslist.get(i).katSayi>=0)
	    			GrainsCerealslist.get(i).StokMiktari-=(adet+GrainsCerealslist.get(i).katSayi);
	    		        		
			}
			else
			{
    			 GrainsCerealslist.get(i).StokMiktari+=adet+GrainsCerealslist.get(i).katSayi;
			} 
	    	kontrol=1;
			break;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
		GrainsCereals.ListeyiYazdir(GrainsCerealslist);	
		
	}


	@Override
	public void UrunFiyatGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int oran, boolean indirimMi,String islemYapilacakUrun) 
	{
		int kontrol=0;
		GrainsCereals.ListeyiYazdir(GrainsCerealslist);	
		for(int i=0;i<GrainsCerealslist.size();i++)
 		{
			if(GrainsCerealslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
	      	{
 	    	if(indirimMi==true)
 			{
 	    		if(GrainsCerealslist.get(i).BirimFiyati-GrainsCerealslist.get(i).BirimFiyati*(oran+GrainsCerealslist.get(i).katSayi)/100>=0)
 	    			GrainsCerealslist.get(i).BirimFiyati-=GrainsCerealslist.get(i).BirimFiyati*(oran+GrainsCerealslist.get(i).katSayi)/100;
 	    		       		
 			}
 			else
 			{
     			 GrainsCerealslist.get(i).BirimFiyati+=GrainsCerealslist.get(i).BirimFiyati*(oran-GrainsCerealslist.get(i).katSayi)/100;
 			}   
 	    	kontrol=1;
			break;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
 		GrainsCereals.ListeyiYazdir(GrainsCerealslist);	
		
	}


	@Override
	public void UrunKategorikZamYap(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int oran)
	{
		GrainsCereals.ListeyiYazdir(GrainsCerealslist);	
		for(int i=0;i<GrainsCerealslist.size();i++)
 		{
 	    	GrainsCerealslist.get(i).BirimFiyati+=GrainsCerealslist.get(i).BirimFiyati*(oran-GrainsCerealslist.get(i).katSayi)/100;
 		}
 		GrainsCereals.ListeyiYazdir(GrainsCerealslist);	
		
	}


	@Override
	public void YeniUrunEkle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, String Adi, String BirimAgirligi,
			double BirimFiyatı, int StokMiktari, String Detay) 
	{
		Detay=GrainsCerealslist.get(0).detay;
		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		GrainsCereals grainsCereals=new GrainsCereals(Adi, kategori, BirimAgirligi, BirimFiyatı, StokMiktari,
				"GrainsCereals", Detay,kategori);
		GrainsCerealslist.add(grainsCereals);
		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		
	}

}
