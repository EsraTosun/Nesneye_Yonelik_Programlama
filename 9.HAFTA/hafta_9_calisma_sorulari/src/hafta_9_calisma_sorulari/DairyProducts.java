package hafta_9_calisma_sorulari;

import java.util.ArrayList;


public class DairyProducts extends Urun implements IUrun
{
	public String kategoriAdi;
	public String detay;
	public int katSayi;
	
	 public DairyProducts()
	 {
		
	 }
	 
	 public DairyProducts(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
				String kategoriAdi, String detay,int katSayi) {
			super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
			this.kategoriAdi = kategoriAdi;
			this.detay = detay;
			this.katSayi=katSayi;
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


	@Override
	public void UrunStokGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int adet, boolean GirisMi,String islemYapilacakUrun) 
	{
		int kontrol=0;
		DairyProducts.ListeyiYazdir(DairyProductslist);
	     for(int i=0;i<DairyProductslist.size();i++)
		 {
	    	 if(DairyProductslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
	      	{
	    	if(GirisMi==false)
			{
				if(DairyProductslist.get(i).StokMiktari>10) {
	    		if( DairyProductslist.get(i).StokMiktari-adet-DairyProductslist.get(i).katSayi>=0)
	    			 DairyProductslist.get(i).StokMiktari-=(adet+DairyProductslist.get(i).katSayi);    	    	
			}
			}
			else
			{
				if(DairyProductslist.get(i).StokMiktari>10)
    	    	 DairyProductslist.get(i).StokMiktari+=adet+DairyProductslist.get(i).katSayi;
			}   
	    	kontrol=1;
			break;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
		DairyProducts.ListeyiYazdir(DairyProductslist);
		 		
	}


	@Override
	public void UrunFiyatGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int oran, boolean indirimMi,String islemYapilacakUrun) 
	{
		int kontrol=0;
		DairyProducts.ListeyiYazdir(DairyProductslist);
		 for(int i=0;i<DairyProductslist.size();i++)
 		{
			 if(DairyProductslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
		   {
 	    	if(indirimMi==true)
 			{
 	    		if( DairyProductslist.get(i).BirimFiyati-DairyProductslist.get(i).BirimFiyati*(oran+DairyProductslist.get(i).katSayi)/100>=0)
 	    			 DairyProductslist.get(i).BirimFiyati-=DairyProductslist.get(i).BirimFiyati*(oran+DairyProductslist.get(i).katSayi)/100;
 	    		
     	    	
 			}
 			else
 			{
     	    	 DairyProductslist.get(i).BirimFiyati+=DairyProductslist.get(i).BirimFiyati*(oran-DairyProductslist.get(i).katSayi)/100;
 			} 
 	    	kontrol=1;
			break;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
		DairyProducts.ListeyiYazdir(DairyProductslist);
		
	}


	@Override
	public void UrunBirimAgirlikGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int oran,String islemYapilacakUrun) 
	{
		int kontrol=0;
		DairyProducts.ListeyiYazdir(DairyProductslist);
		for(int i=0;i<DairyProductslist.size();i++)
 		{  
			if(DairyProductslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
		{
				DairyProductslist.get(i).BirimAgirligi+="+"+oran+"+"+1;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
	     DairyProducts.ListeyiYazdir(DairyProductslist);		
	}


	@Override
	public void YeniUrunEkle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, String Adi, String BirimAgirligi,
			double BirimFiyatı,String Detay) 
	{
		int toplamStok=0;
		for(int i=0;i<DairyProductslist.size();i++)
		{
			toplamStok+=DairyProductslist.get(i).StokMiktari;
		}
		int ortalamaStok=toplamStok/DairyProductslist.size();
		
		DairyProducts.ListeyiYazdir(DairyProductslist);
		DairyProducts dairyProducts=new DairyProducts(Adi, kategori, BirimAgirligi, BirimFiyatı, ortalamaStok,
				"DairyProducts", Detay,kategori);
		DairyProductslist.add(0,dairyProducts);
		DairyProducts.ListeyiYazdir(DairyProductslist);
		
	}

}

