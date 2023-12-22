package Paket2;

import java.util.ArrayList;

import Paket2.Beverages;


public class Urun 
{
	
	private String Adi;
	protected int KategoriIndex;
	protected String BirimAgirligi;
	protected double BirimFiyati;
	protected int StokMiktari;	
  
    public Urun(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super();
		setAdi(adi);
		KategoriIndex = kategoriIndex;
		BirimAgirligi = birimAgirligi;
		BirimFiyati = birimFiyati;
		StokMiktari = stokMiktari;
	}
    
    public static void UrunStokGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		String adi, boolean SatisMi, int adet)
    {
    	urunStokGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist, adi, SatisMi, adet);
    }

    protected static void urunStokGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		String adi, boolean SatisMi, int adet)
    {
    	int sonuc=0;
   	 if(sonuc==0)
    	{
    		for(int i=0;i<Beverageslist.size();i++)
    		{
                if(Beverageslist.get(i).getAdi().compareTo(adi)==0)
                {
               	 if(SatisMi)
               	 {
               		 int yedek=Beverageslist.get(i).StokMiktari-adet;
               		 if(yedek<0)
               			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
               		 else
               			Beverageslist.get(i).StokMiktari=yedek; 
               	 }
               	 else
               		 Beverageslist.get(i).StokMiktari+=adet;
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
    			if(Condimentslist.get(i).getAdi().compareTo(adi)==0)
    			{
    				if(SatisMi)
                  	 {
                  		 int yedek=Condimentslist.get(i).StokMiktari-adet;
                  		 if(yedek<0)
                  			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
                  		 else
                  			Condimentslist.get(i).StokMiktari=yedek; 
                  	 }
                  	 else
                  		Condimentslist.get(i).StokMiktari+=adet;    			
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
    			if(Confectionslist.get(i).getAdi().compareTo(adi)==0)
    			{
    				if(SatisMi)
                 	 {
                 		 int yedek=Confectionslist.get(i).StokMiktari-adet;
                 		 if(yedek<0)
                 			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
                 		 else
                 			Confectionslist.get(i).StokMiktari=yedek; 
                 	 }
                 	 else
                 		Confectionslist.get(i).StokMiktari+=adet;       				
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
    			if(DairyProductslist.get(i).getAdi().compareTo(adi)==0)
    			{
    				if(SatisMi)
                	 {
                		 int yedek=DairyProductslist.get(i).StokMiktari-adet;
                		 if(yedek<0)
                			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
                		 else
                			 DairyProductslist.get(i).StokMiktari=yedek; 
                	 }
                	 else
                		 DairyProductslist.get(i).StokMiktari+=adet;       				
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
    			if(GrainsCerealslist.get(i).getAdi().compareTo(adi)==0)
    			{
    				if(SatisMi)
               	 {
               		 int yedek=GrainsCerealslist.get(i).StokMiktari-adet;
               		 if(yedek<0)
               			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
               		 else
               			GrainsCerealslist.get(i).StokMiktari=yedek; 
               	 }
               	 else
               		GrainsCerealslist.get(i).StokMiktari+=adet;       				
  			
   				
    				sonuc=1;
    				break;
    			}
    		}
    		if(sonuc==1)
    		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
    	}
        
    	if(sonuc==0)
    	{
    		System.out.println("girdiginiz katalog bulunmamaktadir");
    	}
    	
    	
    }
	
	public static void UrunAdiDegistir(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		String adi,String yeniAdi)
	{
		urunAdiDegistir(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist, adi, yeniAdi);
    }
    
    protected static void urunAdiDegistir(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		String adi,String yeniAdi)
    {	
    	
    	int sonuc=0;
      	 if(sonuc==0)
       	{
       		for(int i=0;i<Beverageslist.size();i++)
       		{
                   if(Beverageslist.get(i).getAdi().compareTo(adi)==0)
                   {
                  	 Beverages.ListeyiYazdir(Beverageslist);
                  	 Beverageslist.get(i).setAdi(yeniAdi);
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
       			if(Condimentslist.get(i).getAdi().compareTo(adi)==0)
       			{
       	       		Condiments.ListeyiYazdir(Condimentslist);
       				Condimentslist.get(i).setAdi(yeniAdi);	
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
       			if(Confectionslist.get(i).getAdi().compareTo(adi)==0)
       			{
       	       		Confections.ListeyiYazdir(Confectionslist);
       				Confectionslist.get(i).setAdi(yeniAdi);   				
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
       			if(DairyProductslist.get(i).getAdi().compareTo(adi)==0)
       			{
       	       		DairyProducts.ListeyiYazdir(DairyProductslist);
       				DairyProductslist.get(i).setAdi(yeniAdi);   				
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
       			if(GrainsCerealslist.get(i).getAdi().compareTo(adi)==0)
       			{
       	       		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
       				GrainsCerealslist.get(i).setAdi(yeniAdi);
       				sonuc=1;
       				break;
       			}
       		}
       		if(sonuc==1)
       		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
       	}
           
       	if(sonuc==0)
       	{
       		System.out.println("girdiginiz katalog bulunmamaktadir");
       	}
    }

	public String getAdi() {
		return Adi;
	}

	public void setAdi(String adi) {
		Adi = adi;
	}
    
	
}