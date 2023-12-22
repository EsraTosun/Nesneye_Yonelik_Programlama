package hafta_6_calisma_sorulari;

import java.util.ArrayList;
import java.util.Scanner;

public class Urun 
{
	public String Adi;
    public int KategoriIndex;
    public String BirimAgirligi;
    public double BirimFiyati;
    public int StokMiktari;
     
    public static void UrunStokGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		String adi, boolean SatisMi, int adet)
    {
    	int sonuc=0;
   	 if(sonuc==0)
    	{
    		for(int i=0;i<Beverageslist.size();i++)
    		{
                if(Beverageslist.get(i).Adi.compareTo(adi)==0)
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
    			if(Condimentslist.get(i).Adi.compareTo(adi)==0)
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
    			if(Confectionslist.get(i).Adi.compareTo(adi)==0)
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
    			if(DairyProductslist.get(i).Adi.compareTo(adi)==0)
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
    			if(GrainsCerealslist.get(i).Adi.compareTo(adi)==0)
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
    	
    	int sonuc=0;
      	 if(sonuc==0)
       	{
       		for(int i=0;i<Beverageslist.size();i++)
       		{
                   if(Beverageslist.get(i).Adi.compareTo(adi)==0)
                   {
                  	 Beverages.ListeyiYazdir(Beverageslist);
                  	 Beverageslist.get(i).Adi=yeniAdi;
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
       	       		Condiments.ListeyiYazdir(Condimentslist);
       				Condimentslist.get(i).Adi=yeniAdi;	
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
       	       		Confections.ListeyiYazdir(Confectionslist);
       				Confectionslist.get(i).Adi=yeniAdi;   				
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
       	       		DairyProducts.ListeyiYazdir(DairyProductslist);
       				DairyProductslist.get(i).Adi=yeniAdi;   				
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
       	       		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
       				GrainsCerealslist.get(i).Adi=yeniAdi;
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
    
	
}
