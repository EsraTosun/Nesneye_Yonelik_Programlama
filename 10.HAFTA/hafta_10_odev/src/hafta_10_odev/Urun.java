package hafta_10_odev;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
    public Urun(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) 
    {
		this.Adi = adi;
		this.KategoriIndex = kategoriIndex;
		this.BirimAgirligi = birimAgirligi;
		this.BirimFiyati = birimFiyati;
		this.StokMiktari = stokMiktari;
	}
    
 
    public static void UrunFiyatGuncelle(ArrayList<Beverages> Beverageslist,
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
    	
        if(Beverageslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
        	Beverages.ListeyiYazdir(Beverageslist);
    		for(int i=0;i<Beverageslist.size();i++)
    		{
    			Beverageslist.get(i).BirimFiyati+=Beverageslist.get(i).BirimFiyati *x/100;
    		}
    		Beverages.ListeyiYazdir(Beverageslist);
    	}
    	else if(Condimentslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		Condiments.ListeyiYazdir(Condimentslist);
    		for(int i=0;i<Condimentslist.size();i++)
    		{
    			Condimentslist.get(i).BirimFiyati+=Condimentslist.get(i).BirimFiyati *x/100;
    		}
    		Condiments.ListeyiYazdir(Condimentslist);
    	}
    	else if(Confectionslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		Confections.ListeyiYazdir(Confectionslist);
    		for(int i=0;i<Confectionslist.size();i++)
    		{
    			Confectionslist.get(i).BirimFiyati+=Confectionslist.get(i).BirimFiyati *x/100;
    		}
    		Confections.ListeyiYazdir(Confectionslist);
    	}
    	else if(DairyProductslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		DairyProducts.ListeyiYazdir(DairyProductslist);
    		for(int i=0;i<DairyProductslist.size();i++)
    		{
    			DairyProductslist.get(i).BirimFiyati+=DairyProductslist.get(i).BirimFiyati *x/100;
    		}
    		DairyProducts.ListeyiYazdir(DairyProductslist);
    	}
    	else if(GrainsCerealslist.get(0).kategoriAdi.compareTo(KategoriAdi)==0)
    	{
    		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
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
    
    public static class Beverages extends Urun
    {
    	public String kategoriAdi;
    	public String detay;
    	
    	public Beverages()
    	{
    		
    	}
    	
    	 public Beverages(String Adi,int KategoriIndex,String BirimAgirligi,double BirimFiyati,int StokMiktari,
    			 String kategoriAdi,String detay)
    	 {
    		 super(Adi,KategoriIndex,BirimAgirligi,BirimFiyati,StokMiktari);
    		 this.kategoriAdi=kategoriAdi;
    		 this.detay=detay;
    	 }  

    	
    	 public static void IcecekStokGuncelle(ArrayList<Beverages> BeveragesList,
    				int urunIndexi,boolean Satismi, int miktar)
    		{
    			int sayac=0;
    			ListeyiYazdir(BeveragesList);
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
    			ListeyiYazdir(BeveragesList);
    			
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
    	
    
    
    public static class Condiments extends Urun 
    {
    	
    	String kategoriAdi;
    	String detay;
    	
    	public Condiments(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
    			String kategoriAdi, String detay) {
    		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
    		this.kategoriAdi = kategoriAdi;
    		this.detay = detay;
    	}
    	
    	public Condiments()
    	{
    		
    	}
    	
    	public static void CesniBirimAgirlikGuncelle(ArrayList<Condiments> CondimentsList,String yeniAgirlik)
    	{
    		ListeyiYazdir(CondimentsList);
    		CondimentsList.get(CondimentsList.size()-1).BirimAgirligi=yeniAgirlik;
    		ListeyiYazdir(CondimentsList);
    	}
    	
    	public static void ListeyiYazdir(ArrayList<Condiments> urun)
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
    	
    
    public static class Confections extends Urun
    {
    	String kategoriAdi;
        public static String detay;
        
        public Confections(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
    			String kategoriAdi, String detay) {
    		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
    		this.kategoriAdi = kategoriAdi;
    		this.detay = detay;
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
    	
    
    public static class DairyProducts extends Urun
    {
    	  String kategoriAdi;
    	  String detay;
    	 
    	 public DairyProducts(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
 				String kategoriAdi, String detay) {
    		 super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
 			this.kategoriAdi = kategoriAdi;
 			this.detay = detay;
 		}
    	
    	 public static void SutUrunuSil(ArrayList<DairyProducts> dairyProductsList,String urunAdi)
    		{
 			ListeyiYazdir(dairyProductsList);
    			int i;
    			for(i=0;i<dairyProductsList.size();i++)
    			{
    				if(dairyProductsList.get(i).Adi.compareTo(urunAdi)==0)
    				{
    					dairyProductsList.remove(i);
    					break;
    				}
    			}
    			
    			if(dairyProductsList.size()==i)
    				System.out.println("girdigin adda urun bulunmamaktadir");
    			ListeyiYazdir(dairyProductsList);
    		}	
    	
    	
    	public static void ListeyiYazdir(ArrayList<DairyProducts> urun)
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
    	
    
    public static class GrainsCereals extends Urun
    {
    	 static String kategoriAdi;
    	 static String detay;
    	 
    	 public  GrainsCereals(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
 				String kategoriAdi, String detay) {
 			super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
 			this.kategoriAdi = kategoriAdi;
 			this.detay = detay;
 		}
    	
    	public static void TahılMinStokEkle (ArrayList<GrainsCereals> GrainsCerealsList,int miktar)
    	{
    		int min=GrainsCerealsList.get(0).StokMiktari,index=0;
    		ListeyiYazdir(GrainsCerealsList);
    		for(int i=0;i<GrainsCerealsList.size();i++)
    		{
    			if(min>GrainsCerealsList.get(i).StokMiktari)
    			{
    				min=GrainsCerealsList.get(i).StokMiktari;
    				index=i;
    			}
    		}
    		
    		GrainsCerealsList.get(index).StokMiktari+=miktar; 
    		ListeyiYazdir(GrainsCerealsList);
    	}
    	
    	public static void TahilUrunEkle(ArrayList<GrainsCereals> GrainsCerealslist,String Adi, 
    			String BirimAgirligi,double BirimFiyati,int StokMiktari)
    	{
    		GrainsCereals urun=new GrainsCereals(Adi, 5, BirimAgirligi, BirimFiyati, StokMiktari,kategoriAdi, detay);
    	
    		ListeyiYazdir(GrainsCerealslist);
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
}