package Paket1;

import java.util.ArrayList;
import java.util.Scanner;

import Paket1.Beverages;


public class Urun 
{
	
	private String Adi;
	private int KategoriIndex;
	private String BirimAgirligi;
	private double BirimFiyati;
	private int StokMiktari;
	
	public String getAdi() {
		return Adi;
	}

	public void setAdi(String adi) {
		this.Adi = adi;
	}
  
    public int getKategoriIndex() {
		return KategoriIndex;
	}

	public void setKategoriIndex(int kategoriIndex) {
		this.KategoriIndex = kategoriIndex;
	}

	public String getBirimAgirligi() {
		return BirimAgirligi;
	}

	public void setBirimAgirligi(String birimAgirligi) {
		this.BirimAgirligi = birimAgirligi;
	}

	public double getBirimFiyati() {
		return BirimFiyati;
	}

	public void setBirimFiyati(double birimFiyati) {
		this.BirimFiyati = birimFiyati;
	}

	public int getStokMiktari() {
		return StokMiktari;
	}

	public void setStokMiktari(int stokMiktari) {
		this.StokMiktari = stokMiktari;
	}
	
	public Urun()
	{
	}

	public Urun(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super();
		setAdi(adi);
		this.KategoriIndex = kategoriIndex;
		this.BirimAgirligi = birimAgirligi;
		this.BirimFiyati = birimFiyati;
		this.StokMiktari = stokMiktari;
	}
    
    public void UrunStokGuncelle(ArrayList<Beverages> Beverageslist,
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
               		 int yedek=Beverageslist.get(i).getStokMiktari()-adet;
               		 if(yedek<0)
               			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
               		 else
               			Beverageslist.get(i).setStokMiktari(yedek); 
               	 }
               	 else
               		 Beverageslist.get(i).setStokMiktari(Beverageslist.get(i).getStokMiktari()+adet);
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
                  		 int yedek=Condimentslist.get(i).getStokMiktari()-adet;
                  		 if(yedek<0)
                  			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
                  		 else
                  			Condimentslist.get(i).setStokMiktari(yedek);
                  	 }
                  	 else
                  		Condimentslist.get(i).setStokMiktari(Condimentslist.get(i).getStokMiktari()+adet);    			
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
                 		 int yedek=Confectionslist.get(i).getStokMiktari()-adet;
                 		 if(yedek<0)
                 			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
                 		 else
                 			Confectionslist.get(i).setStokMiktari(yedek); 
                 	 }
                 	 else
                 		Confectionslist.get(i).setStokMiktari(Confectionslist.get(i).getStokMiktari()+adet);       				
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
                		 int yedek=DairyProductslist.get(i).getStokMiktari()-adet;
                		 if(yedek<0)
                			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
                		 else
                			 DairyProductslist.get(i).setStokMiktari(yedek); 
                	 }
                	 else
                		 DairyProductslist.get(i).setStokMiktari(DairyProductslist.get(i).getStokMiktari()+adet);       				
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
               		 int yedek=GrainsCerealslist.get(i).getStokMiktari()-adet;
               		 if(yedek<0)
               			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
               		 else
               			GrainsCerealslist.get(i).setStokMiktari(yedek); 
               	 }
               	 else
               		GrainsCerealslist.get(i).setStokMiktari(GrainsCerealslist.get(i).getStokMiktari()+adet);       				
  			
   				
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
    
    public void UrunStokGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		String adi,int adet)
    {
    	int sonuc=0;
   	 if(sonuc==0)
    	{
    		for(int i=0;i<Beverageslist.size();i++)
    		{
                if(Beverageslist.get(i).getAdi().compareTo(adi)==0)
                {
               	  int yedek=Beverageslist.get(i).getStokMiktari()-adet;
               		 if(yedek<0)
               			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
               		 else
               			Beverageslist.get(i).setStokMiktari(yedek); 
               
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
    				int yedek=Condimentslist.get(i).getStokMiktari()-adet;
                  		 if(yedek<0)
                  			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
                  		 else
                  			Condimentslist.get(i).setStokMiktari(yedek);
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
    				 int yedek=Confectionslist.get(i).getStokMiktari()-adet;
                 		 if(yedek<0)
                 			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
                 		 else
                 			Confectionslist.get(i).setStokMiktari(yedek); 
                 	 
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
    				     int yedek=DairyProductslist.get(i).getStokMiktari()-adet;
                		 if(yedek<0)
                			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
                		 else
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
    				int yedek=GrainsCerealslist.get(i).getStokMiktari()-adet;
               		 if(yedek<0)
               			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
               		 else
               			GrainsCerealslist.get(i).setStokMiktari(yedek); 
               	 
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
	
	 public void UrunAdiDegistir(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		String adi)
    {	
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("yeni adi giriniz");
		 String yeniAdi=scanner.nextLine();
    	
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
	 
	 public void UrunAdiDegistir(ArrayList<Beverages> Beverageslist,
	    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
	    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
	    		String adi,boolean sesliMi)
	    {	
			 Scanner scanner=new Scanner(System.in);
			 System.out.println("yeni adi giriniz");
			 String yeniAdi=scanner.nextLine();
			 
			/* ArrayList<Character> list=new ArrayList<>();
			 for(int i=0;i<yeniAdi.length();i++)
			 {
				 list.add(yeniAdi.charAt(i));
			 }  */
			 
			 for(int k=0;k<yeniAdi.length();k++)
			 {
				 
					 if(sesliMi)
					 {
    	       			if(yeniAdi.charAt(k)=='a' ||yeniAdi.charAt(k)=='e' ||yeniAdi.charAt(k)=='i' ||yeniAdi.charAt(k)=='u' ||
    	       					yeniAdi.charAt(k)=='o' || yeniAdi.charAt(k)=='A' ||yeniAdi.charAt(k)=='e' ||yeniAdi.charAt(k)=='I' ||
    	       							yeniAdi.charAt(k)=='U' ||yeniAdi.charAt(k)=='O')
    	       			{
    	       				
    	       			}
    	       			else
    	       			{
    	       				yeniAdi=yeniAdi.replaceFirst(String.valueOf(yeniAdi.charAt(k)), "");
    	       				k--;
    	       			}
					 }
					 else
					 {
						 if(yeniAdi.charAt(k)=='a' ||yeniAdi.charAt(k)=='e' ||yeniAdi.charAt(k)=='i' ||yeniAdi.charAt(k)=='u' ||
	    	       					yeniAdi.charAt(k)=='o' || yeniAdi.charAt(k)=='A' ||yeniAdi.charAt(k)=='e' ||yeniAdi.charAt(k)=='I' ||
	    	       							yeniAdi.charAt(k)=='U' ||yeniAdi.charAt(k)=='O')
	    	       			{
							 /*yeniAdi=yeniAdi.replace("a","");
							 yeniAdi=yeniAdi.replace("e","");
							 yeniAdi=yeniAdi.replace("i","");
							 yeniAdi=yeniAdi.replace("u","");
							 yeniAdi=yeniAdi.replace("o","");
							 yeniAdi=yeniAdi.replace("A","");
							 yeniAdi=yeniAdi.replace("E","");
							 yeniAdi=yeniAdi.replace("I","");
							 yeniAdi=yeniAdi.replace("U","");
							 yeniAdi=yeniAdi.replace("O",""); */
	    	       			yeniAdi=yeniAdi.replaceFirst(String.valueOf(yeniAdi.charAt(k)), "");
	    	       				System.out.println(adi);
	    	       				k--;
	    	       			} 
					 }
    	       			
    	     }
			// yeniAdi=list.toString();
				 
	    	
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
    
	


        public void UruneZamYap(ArrayList<Beverages> Beverageslist,
        		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
        		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,double zamOrani)
        {
	
        }
}




