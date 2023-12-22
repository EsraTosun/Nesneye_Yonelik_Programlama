package hafta_8_odev;

import java.util.ArrayList;



public class Urun 
{
	
	public String Adi;
    public int KategoriIndex;
    public String BirimAgirligi;
    public double BirimFiyati;
    public int StokMiktari;
    
    public Urun()
    {
    	
    }
    
    public Urun(String adi, String birimAgirligi, double birimFiyati, int stokMiktari) {
		super();
		Adi = adi;
		BirimAgirligi = birimAgirligi;
		BirimFiyati = birimFiyati;
		StokMiktari = stokMiktari;
	}

	public Urun(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
		this.Adi = adi;
		this.KategoriIndex = kategoriIndex;
		this.BirimAgirligi = birimAgirligi;
		this.BirimFiyati = birimFiyati;
		this.StokMiktari = stokMiktari;
	}

    
    public void UrunFiyatGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
			int oran)
    {
    	
     		for(int i=0;i<Beverageslist.size();i++)
     		{  
                Beverageslist.get(i).BirimFiyati+=Beverageslist.get(i).BirimFiyati*oran/100;
            }
     		     		    	
     		for(int i=0;i<Condimentslist.size();i++)
     		{
            	Condimentslist.get(i).BirimFiyati+=Condimentslist.get(i).BirimFiyati*oran/100;
     		}
     			
            for(int i=0;i<Confectionslist.size();i++)
     		{
     			Confectionslist.get(i).BirimFiyati+=Confectionslist.get(i).BirimFiyati*oran/100;    				
     		}
            
     	    for(int i=0;i<DairyProductslist.size();i++)
     		{
     	    	DairyProductslist.get(i).BirimFiyati+=DairyProductslist.get(i).BirimFiyati*oran/100;
     		}
     			
     	    for(int i=0;i<GrainsCerealslist.size();i++)
     		{
     			GrainsCerealslist.get(i).BirimFiyati+=GrainsCerealslist.get(i).BirimFiyati*oran/100;
     		}
     			
    }
    
    

	public static void UrunFiyatGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
			int oran,boolean indirimMi)
    {
    	
     		for(int i=0;i<Beverageslist.size();i++)
     		{  
     			if(indirimMi==true)
     			{
     				System.out.println(i);
     				if(Beverageslist.get(i).StokMiktari>10)
     				{
     					if(Beverageslist.get(i).BirimFiyati-Beverageslist.get(i).BirimFiyati*oran/100>=0)    					
     	     				 Beverageslist.get(i).BirimFiyati-=Beverageslist.get(i).BirimFiyati*oran/100;     					
     				}
     			}
     			else
     			{
     				if(Beverageslist.get(i).StokMiktari<10)
     				 Beverageslist.get(i).BirimFiyati+=Beverageslist.get(i).BirimFiyati*oran/100;
     			}   
            }
     		     		    	
     		for(int i=0;i<Condimentslist.size();i++)
     		{
     			if(indirimMi==true)
     			{
     				if(Condimentslist.get(i).StokMiktari>10)
     				{
     					if(Condimentslist.get(i).BirimFiyati-Condimentslist.get(i).BirimFiyati*oran/100>=0)
     	               	 Condimentslist.get(i).BirimFiyati-=Condimentslist.get(i).BirimFiyati*oran/100;	
     				}
     			}
     			else
     			{
     				if(Condimentslist.get(i).StokMiktari<10)
                	 Condimentslist.get(i).BirimFiyati+=Condimentslist.get(i).BirimFiyati*oran/100;
     			}   
     		}
     			
            for(int i=0;i<Confectionslist.size();i++)
     		{
            	if(indirimMi==true)
     			{
            		if(Confectionslist.get(i).StokMiktari>10)
            		{
            			if(Confectionslist.get(i).BirimFiyati-Confectionslist.get(i).BirimFiyati*oran/100>=0)           		
                		 Confectionslist.get(i).BirimFiyati-=Confectionslist.get(i).BirimFiyati*oran/100;    				          			
            		}
     			}
     			else
     			{
     				if(Confectionslist.get(i).StokMiktari<10)
         			 Confectionslist.get(i).BirimFiyati+=Confectionslist.get(i).BirimFiyati*oran/100;    				
     			}   
     		}
            
     	    for(int i=0;i<DairyProductslist.size();i++)
     		{
     	    	if(indirimMi==true)
     			{
     	    		if(DairyProductslist.get(i).StokMiktari>10)
     	    		{
     	    			if( DairyProductslist.get(i).BirimFiyati-DairyProductslist.get(i).BirimFiyati*oran/100>=0)
     	    			 DairyProductslist.get(i).BirimFiyati-=DairyProductslist.get(i).BirimFiyati*oran/100;
     	    		}
         	    	
     			}
     			else
     			{
     				if(DairyProductslist.get(i).StokMiktari<10)
         	    	 DairyProductslist.get(i).BirimFiyati+=DairyProductslist.get(i).BirimFiyati*oran/100;
     			}   
     		}
     			
     	    for(int i=0;i<GrainsCerealslist.size();i++)
     		{
     	    	if(indirimMi==true)
     			{
     	    		if(GrainsCerealslist.get(i).StokMiktari>10)
     	    		{
     	    			if(GrainsCerealslist.get(i).BirimFiyati-GrainsCerealslist.get(i).BirimFiyati*oran/100>=0)
     	    			GrainsCerealslist.get(i).BirimFiyati-=GrainsCerealslist.get(i).BirimFiyati*oran/100;
     	    		}        		
     			}
     			else
     			{
     				if(GrainsCerealslist.get(i).StokMiktari<10)
         			 GrainsCerealslist.get(i).BirimFiyati+=GrainsCerealslist.get(i).BirimFiyati*oran/100;
     			}   
     		}
     			
    }
    
    public void  UrunStokGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		int adet, boolean GirisMi)
    {
    	for(int i=0;i<Beverageslist.size();i++)
 		{  
 			if(GirisMi==false)
 			{
 				if(Beverageslist.get(i).StokMiktari-adet>=0)    					
 	     				 Beverageslist.get(i).StokMiktari-=adet;     					
 			}
 			else
 			{
 				 Beverageslist.get(i).StokMiktari+=adet;
 			}   
        }
 		     		    	
 		for(int i=0;i<Condimentslist.size();i++)
 		{
 			if(GirisMi==false)
 			{
 				if(Condimentslist.get(i).StokMiktari-adet>=0)
 	               	 Condimentslist.get(i).StokMiktari-=adet;	
 			}
 			else
 			{
            	 Condimentslist.get(i).StokMiktari+=adet;
 			}   
 		}
 			
        for(int i=0;i<Confectionslist.size();i++)
 		{
        	if(GirisMi==false)
 			{
        		if(Confectionslist.get(i).StokMiktari-adet>=0)           		
            		 Confectionslist.get(i).StokMiktari-=adet;    				          			
 			}
 			else
 			{
     			 Confectionslist.get(i).StokMiktari+=adet;    				
 			}   
 		}
        
 	    for(int i=0;i<DairyProductslist.size();i++)
 		{
 	    	if(GirisMi==false)
 			{
 	    		if( DairyProductslist.get(i).StokMiktari-adet>=0)
 	    			 DairyProductslist.get(i).StokMiktari-=adet;    	    	
 			}
 			else
 			{
     	    	 DairyProductslist.get(i).StokMiktari+=adet;
 			}   
 		}
 			
 	    for(int i=0;i<GrainsCerealslist.size();i++)
 		{
 	    	if(GirisMi==false)
 			{
 	    		if(GrainsCerealslist.get(i).StokMiktari-adet>=0)
 	    			GrainsCerealslist.get(i).StokMiktari-=adet;
 	    		        		
 			}
 			else
 			{
     			 GrainsCerealslist.get(i).StokMiktari+=adet;
 			}   
 		}
    }
    
    public static void UrunKategorikZamYap (ArrayList<Beverages> Beverageslist,
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
    
    public static void UrunKategorikZamYap (ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		String KategoriAdi, int x,int stokKontrol)
    {
    	
        if(Beverageslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		for(int i=0;i<Beverageslist.size();i++)
    		{
    			if(stokKontrol>10)
    			Beverageslist.get(i).BirimFiyati+=Beverageslist.get(i).BirimFiyati *x/100;
    			
    			else
        		Beverageslist.get(i).BirimFiyati+=Beverageslist.get(i).BirimFiyati *2*x/100;   				
    		}
    		Beverages.ListeyiYazdir(Beverageslist);
    	}
    	else if(Condimentslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		for(int i=0;i<Condimentslist.size();i++)
    		{
    			if(stokKontrol>10)
    			Condimentslist.get(i).BirimFiyati+=Condimentslist.get(i).BirimFiyati *x/100;
    			
    			else
        		Condimentslist.get(i).BirimFiyati+=Condimentslist.get(i).BirimFiyati *2*x/100;
    		}
    		Condiments.ListeyiYazdir(Condimentslist);
    	}
    	else if(Confectionslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		for(int i=0;i<Confectionslist.size();i++)
    		{
    			if(stokKontrol>10)
    			Confectionslist.get(i).BirimFiyati+=Confectionslist.get(i).BirimFiyati *x/100;
    			
    			else
        		Confectionslist.get(i).BirimFiyati+=Confectionslist.get(i).BirimFiyati *2*x/100;
	
    		}
    		Confections.ListeyiYazdir(Confectionslist);
    	}
    	else if(DairyProductslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		for(int i=0;i<DairyProductslist.size();i++)
    		{
    			if(stokKontrol>10)
    			DairyProductslist.get(i).BirimFiyati+=DairyProductslist.get(i).BirimFiyati *x/100;
    			
    			else
        		DairyProductslist.get(i).BirimFiyati+=DairyProductslist.get(i).BirimFiyati *2*x/100;
	
    		}
    		DairyProducts.ListeyiYazdir(DairyProductslist);
    	}
    	else if(GrainsCerealslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		for(int i=0;i<GrainsCerealslist.size();i++)
    		{
    			if(stokKontrol>10)
    			GrainsCerealslist.get(i).BirimFiyati+=GrainsCerealslist.get(i).BirimFiyati *x/100;
    			
    			else
    			GrainsCerealslist.get(i).BirimFiyati+=GrainsCerealslist.get(i).BirimFiyati *2*x/100;	
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
