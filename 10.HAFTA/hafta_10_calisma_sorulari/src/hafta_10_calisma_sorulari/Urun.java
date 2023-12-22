package hafta_10_calisma_sorulari;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;



public class Urun implements Serializable
{
	public String Adi;
    public int KategoriIndex;
    public String BirimAgirligi;
    public double BirimFiyati;
    public int StokMiktari;
    
    public Urun() 
    {
    	
    }
    public Urun(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
		this.Adi = adi;
		this.KategoriIndex = kategoriIndex;
		this.BirimAgirligi = birimAgirligi;
		this.BirimFiyati = birimFiyati;
		this.StokMiktari = stokMiktari;
	}
    
 
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

    	
    	static void IcecekUrunuEkle(ArrayList<Beverages> BeveragesList,
    			String Adi,String BirimAgirligi,double BirimFiyatı,int StokMiktari)
    	{
    		Beverages yeniBevreagesUrun=new Beverages();
    		
    		yeniBevreagesUrun.Adi=Adi;
    		yeniBevreagesUrun.BirimAgirligi=BirimAgirligi;
    		yeniBevreagesUrun.BirimFiyati=BirimFiyatı;
    		yeniBevreagesUrun.StokMiktari=StokMiktari;
    		yeniBevreagesUrun.KategoriIndex=BeveragesList.get(0).KategoriIndex;
    		yeniBevreagesUrun.kategoriAdi=BeveragesList.get(0).kategoriAdi;
    		yeniBevreagesUrun.detay=BeveragesList.get(0).detay;
    		
    		BeveragesList.add(yeniBevreagesUrun);
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
    	
    	 static void DosyaYazma(ArrayList<Beverages> BeveragesList) throws IOException
    	{
    		FileOutputStream fos=new FileOutputStream("file.txt");
    		ObjectOutputStream out=new ObjectOutputStream(fos);
    		
    		/*for (Beverages beverages : BeveragesList) {
    			out.writeObject(beverages);  
    		}  */
    		out.writeObject(BeveragesList);
    		
    		out.close();
    		//fos.close();
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
    	
    	public static void CesniBirimFiyatGuncelle (Condiments CondimentsUrun,double yeniFiyat)
    	{
    		CondimentsUrun.BirimFiyati=yeniFiyat;
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
        String detay;
        
        public Confections(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
    			String kategoriAdi, String detay) {
    		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
    		this.kategoriAdi = kategoriAdi;
    		this.detay = detay;
    	}
    	
    	public static void SekerlemeDetaySil(ArrayList<Confections> ConfectionsList)
    	{
    		int index1=ConfectionsList.get(0).detay.length();
    		
    		for(int i=ConfectionsList.get(0).detay.length()-1;i>=0;i--)
    		{
    			if(ConfectionsList.get(0).detay.charAt(i)==',')
    			{
    				break;
    			}
    			index1--;
    		}
    		
    		for(int i=0;i<ConfectionsList.size();i++)
    		{
    			ConfectionsList.get(i).detay=ConfectionsList.get(i).detay.substring(0,index1-1);
    		}
       
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
    	
    	public static void SutUrunuSil(ArrayList<DairyProducts> dairyProductsList)
    	{
    		int toplam=0;
    		for(int i=0;i<dairyProductsList.size();i++)
    		{
    			toplam+=dairyProductsList.get(i).BirimFiyati;
    		}
    		double ort=toplam/dairyProductsList.size();
    		
    		for(int i=0;i<dairyProductsList.size();i++)
    		{
    			if(dairyProductsList.get(i).BirimFiyati>ort)
    			{
    				dairyProductsList.remove(i);
    				break;
    			}
    		}		
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
    	 String kategoriAdi;
    	 String detay;
    	 
    	 public  GrainsCereals(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
 				String kategoriAdi, String detay) {
 			super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
 			this.kategoriAdi = kategoriAdi;
 			this.detay = detay;
 		}
    	
    	public static void TahılMinStokEkle (ArrayList<GrainsCereals> GrainsCerealsList,int miktar)
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
    	
    	static void CokluDosyaOku() throws IOException, ClassNotFoundException {
    		FileInputStream fis = new FileInputStream("file.txt");
    		ObjectInputStream in = new ObjectInputStream(fis);

    		ArrayList<GrainsCereals> BeveragesList=(ArrayList<GrainsCereals>) in.readObject();
    		for (GrainsCereals urun : BeveragesList) {
    			System.out.println("\t "+urun.Adi+
    					"     \t \t "+urun.KategoriIndex+
    					"\t \t      "+urun.BirimAgirligi+
    					"\t \t "+urun.BirimFiyati+
    					"\t \t "+urun.StokMiktari+
    					"\t \t "+urun.kategoriAdi+
    					"\t \t "+urun.detay);
    				}
    		
    	}
    	
    	}
    	
	

}
