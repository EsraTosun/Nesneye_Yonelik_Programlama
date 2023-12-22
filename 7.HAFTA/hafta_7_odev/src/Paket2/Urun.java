package Paket2;

import java.util.ArrayList;

import Paket2.Beverages;


public class Urun 
{
	
	protected String Adi;
	protected int KategoriIndex;
	protected String BirimAgirligi;
	protected double BirimFiyati;
	protected int StokMiktari;	
  
    public Urun(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super();
		Adi = adi;
		KategoriIndex = kategoriIndex;
		BirimAgirligi = birimAgirligi;
		BirimFiyati = birimFiyati;
		StokMiktari = stokMiktari;
	}
    
    public static void UrunFiyatGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
			String adi, int fiyat)
    {
    	urunFiyatGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist, adi, fiyat);
    }

	protected static void urunFiyatGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
			String adi, int fiyat)
    {
    	int sonuc=0;
    	 if(sonuc==0)
     	{
     		for(int i=0;i<Beverageslist.size();i++)
     		{
                 if(Beverageslist.get(i).Adi.compareTo(adi)==0)
                 {
                	 Beverageslist.get(i).BirimFiyati=fiyat;
                	 sonuc=1;
                	 break;
                 }
     		}
     		if(sonuc==1)
     		Beverages.ListeyiYazdir(Beverageslist);
     	}
     	if(sonuc==0)
     	{
     		for(int i=0;i<Condimentslist.size();i++)
     		{
     			if(Condimentslist.get(i).Adi.compareTo(adi)==0)
     			{
     				Condimentslist.get(i).BirimFiyati=fiyat;
     				sonuc=1;
     				break;
     			}
     		}
     		if(sonuc==1)
     		Condiments.ListeyiYazdir(Condimentslist);
     	}
     	if(sonuc==0)
     	{
     		for(int i=0;i<Confectionslist.size();i++)
     		{
     			if(Confectionslist.get(i).Adi.compareTo(adi)==0)
     			{
     				Confectionslist.get(i).BirimFiyati=fiyat;
     				sonuc=1;
     				break;
     			}
     		}
     		if(sonuc==1)
     		Confections.ListeyiYazdir(Confectionslist);
     	}
     	if(sonuc==0)
     	{
     		for(int i=0;i<DairyProductslist.size();i++)
     		{
     			if(DairyProductslist.get(i).Adi.compareTo(adi)==0)
     			{
     				DairyProductslist.get(i).BirimFiyati=fiyat;
     				sonuc=1;
     				break;
     			}
     		}
     		if(sonuc==1)
     		DairyProducts.ListeyiYazdir(DairyProductslist);
     	}
     	if(sonuc==0)
     	{
     		for(int i=0;i<GrainsCerealslist.size();i++)
     		{
     			if(GrainsCerealslist.get(i).Adi.compareTo(adi)==0)
     			{
     				GrainsCerealslist.get(i).BirimFiyati=fiyat;
     				sonuc=1;
     				break;
     			}
     		}
     		if(sonuc==1)
     		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
     	}
         
     	if(sonuc==0)
     	{
     		System.out.println("girdiginiz adda urun bulunmamaktadir");
     	}
    }
	
	public static void UrunKategorikZamYap (ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		String KategoriAdi, int x)
	{
		urunKategorikZamYap(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist, KategoriAdi, x);
	}
    
    protected static void urunKategorikZamYap (ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		String KategoriAdi, int x)
    {
    	
        if(Beverageslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		for(int i=0;i<Beverageslist.size();i++)
    		{
    			Beverageslist.get(i).BirimFiyati+=Beverageslist.get(i).BirimFiyati *x/100;
    		}
    		Beverages.ListeyiYazdir(Beverageslist);
    	}
    	else if(Condimentslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		for(int i=0;i<Condimentslist.size();i++)
    		{
    			Condimentslist.get(i).BirimFiyati+=Condimentslist.get(i).BirimFiyati *x/100;
    		}
    		Condiments.ListeyiYazdir(Condimentslist);
    	}
    	else if(Confectionslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		for(int i=0;i<Confectionslist.size();i++)
    		{
    			Confectionslist.get(i).BirimFiyati+=Confectionslist.get(i).BirimFiyati *x/100;
    		}
    		Confections.ListeyiYazdir(Confectionslist);
    	}
    	else if(DairyProductslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		for(int i=0;i<DairyProductslist.size();i++)
    		{
    			DairyProductslist.get(i).BirimFiyati+=DairyProductslist.get(i).BirimFiyati *x/100;
    		}
    		DairyProducts.ListeyiYazdir(DairyProductslist);
    	}
    	else if(GrainsCerealslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		for(int i=0;i<GrainsCerealslist.size();i++)
    		{
    			GrainsCerealslist.get(i).BirimFiyati+=GrainsCerealslist.get(i).BirimFiyati *x/100;
    		}
    		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
    	}
        
    	else
    	{
    		System.out.println("girdiginiz katalog bulunmamaktadir");
    	}
    }
    
    public static void TumListeyiYazdir(ArrayList<Urun> urun)
    {
    	tumListeyiYazdir(urun);
    }
    
    protected static void tumListeyiYazdir(ArrayList<Urun> urun)
	{
		for(int i=0;i<urun.size();i++)
		{
			System.out.println("\t "+urun.get(i).Adi+
					"     \t \t "+urun.get(i).KategoriIndex+
					"\t \t      "+urun.get(i).BirimAgirligi+
					"\t \t "+urun.get(i).BirimFiyati+
					"\t \t "+urun.get(i).StokMiktari);
				}
			System.out.println("listede eleman sayisi:"+urun.size());
			System.out.println();
	}
}
