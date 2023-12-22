package hafta_9_calisma_sorulari;

import java.util.ArrayList;

interface IUrun
{
	 public void UrunStokGuncelle(ArrayList<Beverages> Beverageslist,
	    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
	    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
	    		int kategori,int adet, boolean GirisMi,String islemYapilacakUrun);
	 
	 public void UrunFiyatGuncelle(ArrayList<Beverages> Beverageslist,
	    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
	    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
	    		int kategori,int oran, boolean indirimMi,String islemYapilacakUrun);
	 
	 public void  UrunBirimAgirlikGuncelle (ArrayList<Beverages> Beverageslist,
	    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
	    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
	    		int kategori,int x,String islemYapilacakUrun);
	 
	 public void YeniUrunEkle(ArrayList<Beverages> Beverageslist,
	    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
	    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
	    		int kategori,String Adi,String BirimAgirligi,double BirimFiyatı,String Detay);
}


abstract class Urun
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
	
    public static void UrunIsımGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori,String isim, String yeniIsim, String yeniDetay) 
	{
    	int index=0,boyut=Beverageslist.get(0).Adi.length();
		if(kategori==1)
		{
			for(int i=0;i<Beverageslist.size();i++)
			{
				if(boyut>Beverageslist.get(i).Adi.length())
				{
					boyut=Beverageslist.get(i).Adi.length();
					index=i;
				}
			}
			Beverages.ListeyiYazdir(Beverageslist);
			Beverageslist.get(index).Adi=yeniIsim;
			Beverageslist.get(index).detay=yeniDetay;
			Beverages.ListeyiYazdir(Beverageslist);
		}
		
		else if(kategori==2)
		{
			index=0;
			boyut=Condimentslist.get(0).Adi.length();
			for(int i=0;i<Condimentslist.size();i++)
			{
				if(boyut>Condimentslist.get(i).Adi.length())
				{
					boyut=Condimentslist.get(i).Adi.length();
					index=i;
				}
			}
			Condiments.ListeyiYazdir(Condimentslist);
			Condimentslist.get(index).Adi=yeniIsim;
			Condimentslist.get(index).detay=yeniDetay;
			Condiments.ListeyiYazdir(Condimentslist);
		}
		else if(kategori==3)
		{
			index=0;
			boyut=Confectionslist.get(0).Adi.length();
			for(int i=0;i<Confectionslist.size();i++)
			{
				if(boyut>Confectionslist.get(i).Adi.length())
				{
					boyut=Confectionslist.get(i).Adi.length();
					index=i;
				}
			}
			Confections.ListeyiYazdir(Confectionslist);
			Confectionslist.get(index).Adi=yeniIsim;
			Confectionslist.get(index).detay=yeniDetay;
			Confections.ListeyiYazdir(Confectionslist);
		}
		else if(kategori==4)
		{
			index=0;
			boyut=DairyProductslist.get(0).Adi.length();
			for(int i=0;i<DairyProductslist.size();i++)
			{
				if(boyut>DairyProductslist.get(i).Adi.length())
				{
					boyut=DairyProductslist.get(i).Adi.length();
					index=i;
				}
			}
			DairyProducts.ListeyiYazdir(DairyProductslist);
			DairyProductslist.get(index).Adi=yeniIsim;
			DairyProductslist.get(index).detay=yeniDetay;
			DairyProducts.ListeyiYazdir(DairyProductslist);
		}
		else if(kategori==5)
		{
			index=0;
			boyut=GrainsCerealslist.get(0).Adi.length();
			for(int i=0;i<GrainsCerealslist.size();i++)
			{
				if(boyut>GrainsCerealslist.get(i).Adi.length())
				{
					boyut=GrainsCerealslist.get(i).Adi.length();
					index=i;
				}
			}
			GrainsCereals.ListeyiYazdir(GrainsCerealslist);
			GrainsCerealslist.get(index).Adi=yeniIsim;
			GrainsCerealslist.get(index).detay=yeniDetay;
			GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		}
		
	}
     public static void UrunSil(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori,String isim) 
	{
    	 int index=0,boyut=Beverageslist.get(0).StokMiktari;
 		if(kategori==1)
 		{
 			for(int i=0;i<Beverageslist.size();i++)
 			{
 				if(boyut<Beverageslist.get(i).StokMiktari)
 				{
 					boyut=Beverageslist.get(i).StokMiktari;
 					index=i;
 				}
 			}
 			Beverages.ListeyiYazdir(Beverageslist);
 			Beverageslist.remove(index);
 			Beverages.ListeyiYazdir(Beverageslist);
 		}
 		
 		else if(kategori==2)
 		{
 			index=0;
 			boyut=Condimentslist.get(0).StokMiktari;
 			for(int i=0;i<Condimentslist.size();i++)
 			{
 				if(boyut<Condimentslist.get(i).StokMiktari)
 				{
 					boyut=Condimentslist.get(i).StokMiktari;
 					index=i;
 				}
 			}
 			Condiments.ListeyiYazdir(Condimentslist);
 			Condimentslist.remove(index);
 			Condiments.ListeyiYazdir(Condimentslist);
 		}
 		else if(kategori==3)
 		{
 			index=0;
 			boyut=Confectionslist.get(0).StokMiktari;
 			for(int i=0;i<Confectionslist.size();i++)
 			{
 				if(boyut<Confectionslist.get(i).StokMiktari)
 				{
 					boyut=Confectionslist.get(i).StokMiktari;
 					index=i;
 				}
 			}
 			Confections.ListeyiYazdir(Confectionslist);
 			Confectionslist.remove(index);
 			Confections.ListeyiYazdir(Confectionslist);
 		}
 		else if(kategori==4)
 		{
 			index=0;
 			boyut=DairyProductslist.get(0).StokMiktari;
 			for(int i=0;i<DairyProductslist.size();i++)
 			{
 				if(boyut<DairyProductslist.get(i).StokMiktari)
 				{
 					boyut=DairyProductslist.get(i).StokMiktari;
 					index=i;
 				}
 			}
 			DairyProducts.ListeyiYazdir(DairyProductslist);
 			DairyProductslist.remove(index);
 			DairyProducts.ListeyiYazdir(DairyProductslist);
 		}
 		else if(kategori==5)
 		{
 			index=0;
 			boyut=GrainsCerealslist.get(0).StokMiktari;
 			for(int i=0;i<GrainsCerealslist.size();i++)
 			{
 				if(boyut<GrainsCerealslist.get(i).StokMiktari)
 				{
 					boyut=GrainsCerealslist.get(i).StokMiktari;
 					index=i;
 				}
 			}
 			GrainsCereals.ListeyiYazdir(GrainsCerealslist);
 			GrainsCerealslist.remove(index);
 			GrainsCereals.ListeyiYazdir(GrainsCerealslist);
 		}
	}
     
     public static void EnPahaliUrunFiyatGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
 			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
 			ArrayList<GrainsCereals> GrainsCerealslist, int kategori)
     {
    	 int index=0;
    	 double boyut=Beverageslist.get(0).BirimFiyati;
  		if(kategori==1)
  		{
  			for(int i=0;i<Beverageslist.size();i++)
  			{
  				if(boyut<Beverageslist.get(i).BirimFiyati)
  				{
  					boyut=Beverageslist.get(i).BirimFiyati;
  					index=i;
  				}
  			}
  			Beverages.ListeyiYazdir(Beverageslist);
  			Beverageslist.get(index).BirimFiyati-=Beverageslist.get(index).BirimFiyati*50/100;
  			Beverages.ListeyiYazdir(Beverageslist);
  		}
  		
  		else if(kategori==2)
  		{
  			index=0;
  			boyut=Condimentslist.get(0).BirimFiyati;
  			for(int i=0;i<Condimentslist.size();i++)
  			{
  				if(boyut<Condimentslist.get(i).BirimFiyati)
  				{
  					boyut=Condimentslist.get(i).BirimFiyati;
  					index=i;
  				}
  			}
  			Condiments.ListeyiYazdir(Condimentslist);
  			Condimentslist.get(index).BirimFiyati-=Condimentslist.get(index).BirimFiyati*50/100;
  			Condiments.ListeyiYazdir(Condimentslist);
  		}
  		else if(kategori==3)
  		{
  			index=0;
  			boyut=Confectionslist.get(0).BirimFiyati;
  			for(int i=0;i<Confectionslist.size();i++)
  			{
  				if(boyut<Confectionslist.get(i).BirimFiyati)
  				{
  					boyut=Confectionslist.get(i).BirimFiyati;
  					index=i;
  				}
  			}
  			Confections.ListeyiYazdir(Confectionslist);
  			Confectionslist.get(index).BirimFiyati-=Confectionslist.get(index).BirimFiyati*50/100;
  			Confections.ListeyiYazdir(Confectionslist);
  		}
  		else if(kategori==4)
  		{
  			index=0;
  			boyut=DairyProductslist.get(0).BirimFiyati;
  			for(int i=0;i<DairyProductslist.size();i++)
  			{
  				if(boyut<DairyProductslist.get(i).BirimFiyati)
  				{
  					boyut=DairyProductslist.get(i).BirimFiyati;
  					index=i;
  				}
  			}
  			DairyProducts.ListeyiYazdir(DairyProductslist);
  			DairyProductslist.get(index).BirimFiyati-=DairyProductslist.get(index).BirimFiyati*50/100;
  			DairyProducts.ListeyiYazdir(DairyProductslist);
  		}
  		else if(kategori==5)
  		{
  			index=0;
  			boyut=GrainsCerealslist.get(0).BirimFiyati;
  			for(int i=0;i<GrainsCerealslist.size();i++)
  			{
  				if(boyut<GrainsCerealslist.get(i).BirimFiyati)
  				{
  					boyut=GrainsCerealslist.get(i).BirimFiyati;
  					index=i;
  				}
  			}
  			GrainsCereals.ListeyiYazdir(GrainsCerealslist);
  			GrainsCerealslist.get(index).BirimFiyati-=GrainsCerealslist.get(index).BirimFiyati*50/100;
  			GrainsCereals.ListeyiYazdir(GrainsCerealslist);
  		} 
    	 
     }
     
     public static void DetayGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
  			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
  			ArrayList<GrainsCereals> GrainsCerealslist, int kategori,String detay)
     {
    	 if(kategori==1)
 		{
 		Beverages.ListeyiYazdir(Beverageslist);
 		for(int i=0;i<Beverageslist.size();i++)
  		{  
 			Beverageslist.get(i).detay=detay;
 		}
 		Beverages.ListeyiYazdir(Beverageslist);
 		}
 		
 		else if(kategori==2)
 		{ 
 		 Condiments.ListeyiYazdir(Condimentslist);	
 		 for(int i=0;i<Condimentslist.size();i++)
   		{
 			Condimentslist.get(i).detay=detay;
 		}
 		 Condiments.ListeyiYazdir(Condimentslist);	
 		}
  		
 		else if(kategori==3)
 		{ 
 		Confections.ListeyiYazdir(Confectionslist);
 		 for(int i=0;i<Confectionslist.size();i++)
   		{
 			Confectionslist.get(i).detay=detay;
 		}
  		Confections.ListeyiYazdir(Confectionslist);
 		}
         
 		else if(kategori==4)
 		{ 
 		DairyProducts.ListeyiYazdir(DairyProductslist);
 		 for(int i=0;i<DairyProductslist.size();i++)
   		{
 			DairyProductslist.get(i).detay=detay;
 		}
  		DairyProducts.ListeyiYazdir(DairyProductslist);
 		}
  		
 		else if(kategori==5)
 		{ 
 		GrainsCereals.ListeyiYazdir(GrainsCerealslist);	
 		for(int i=0;i<GrainsCerealslist.size();i++)
  		{
 			GrainsCerealslist.get(i).detay=detay;
  		}
  		GrainsCereals.ListeyiYazdir(GrainsCerealslist);	
 		}
     }
	
}

