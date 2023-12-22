package hafta_9_calisma_sorulari;

import java.util.ArrayList;


public class Beverages extends Urun implements IUrun
{
	public String kategoriAdi;
	public String detay;
	public int katSayi;
	
	 public Beverages()
	 {
		
	 }
	
	 public Beverages(String Adi,int KategoriIndex,String BirimAgirligi,double BirimFiyati,int StokMiktari,
			 String kategoriAdi,String detay,int katSayi)
	 {
		 super(Adi,KategoriIndex,BirimAgirligi,BirimFiyati,StokMiktari);
		 this.kategoriAdi=kategoriAdi;
		 this.detay=detay;
		 this.katSayi=katSayi;
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

	@Override
	public void UrunStokGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int adet, boolean GirisMi,String islemYapilacakUrun) 
	{
		int kontrol=0;
		Beverages.ListeyiYazdir(Beverageslist);
		 for(int i=0;i<Beverageslist.size();i++)
		 {  
			if(Beverageslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
		{
			if(GirisMi==false)
			{
				if(Beverageslist.get(i).StokMiktari>10) {
				if(Beverageslist.get(i).StokMiktari-adet-Beverageslist.get(i).katSayi>=0)    					
	     				 Beverageslist.get(i).StokMiktari-=(adet+Beverageslist.get(i).katSayi);     
				}
			}
			else
			{
				if(Beverageslist.get(i).StokMiktari<10)
				 Beverageslist.get(i).StokMiktari+=adet+Beverageslist.get(i).katSayi;
			}
			kontrol=1;
			break;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
		Beverages.ListeyiYazdir(Beverageslist);
		
	}

	@Override
	public void UrunFiyatGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int oran, boolean indirimMi,String islemYapilacakUrun) 
	{
		int kontrol=0;
		Beverages.ListeyiYazdir(Beverageslist);
		for(int i=0;i<Beverageslist.size();i++)
 		{  
			if(Beverageslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
		{
 			if(indirimMi==true)
 			{
 				if(Beverageslist.get(i).BirimFiyati-Beverageslist.get(i).BirimFiyati*(oran+Beverageslist.get(i).katSayi)/100>=0)    					
 	     				 Beverageslist.get(i).BirimFiyati-=Beverageslist.get(i).BirimFiyati*(oran+Beverageslist.get(i).katSayi)/100;     					
 				
 			}
 			else
 			{
 				 Beverageslist.get(i).BirimFiyati+=Beverageslist.get(i).BirimFiyati*(oran-Beverageslist.get(i).katSayi)/100;
 			}  
 			kontrol=1;
			break;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
		Beverages.ListeyiYazdir(Beverageslist);		
	}

	@Override
	public void UrunBirimAgirlikGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int oran,String islemYapilacakUrun) 
	{
		int kontrol=0;
		Beverages.ListeyiYazdir(Beverageslist);
		for(int i=0;i<Beverageslist.size();i++)
 		{  
			if(Beverageslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
		{
 			Beverageslist.get(i).BirimAgirligi+="+"+oran+"+"+1;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
		Beverages.ListeyiYazdir(Beverageslist);		
	}

	@Override
	public void YeniUrunEkle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, String Adi, String BirimAgirligi,
			double BirimFiyatı,String Detay) 
	{
		int toplamStok=0;
		for(int i=0;i<Beverageslist.size();i++)
		{
			toplamStok+=Beverageslist.get(i).StokMiktari;
		}
		int ortalamaStok=toplamStok/Beverageslist.size();
		
		Beverages.ListeyiYazdir(Beverageslist);
		Beverages beverages=new Beverages(Adi, kategori, BirimAgirligi, BirimFiyatı, ortalamaStok,
				"Beverages", Detay,kategori);
		Beverageslist.add(0,beverages);
		Beverages.ListeyiYazdir(Beverageslist);
		
	}


	
}
