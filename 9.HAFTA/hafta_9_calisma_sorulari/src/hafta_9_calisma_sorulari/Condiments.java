package hafta_9_calisma_sorulari;

import java.util.ArrayList;


public class Condiments extends Urun implements IUrun 
{
	
	public String kategoriAdi;
	public String detay;
	public int katSayi;
	
	 public Condiments()
	 {
		
	 }
	
	public Condiments(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay,int katSayi) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
		this.katSayi=katSayi;
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


	@Override
	public void UrunStokGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int adet, boolean GirisMi,String islemYapilacakUrun) 
	{
		int kontrol=0;
		 Condiments.ListeyiYazdir(Condimentslist);	
 		 for(int i=0;i<Condimentslist.size();i++)
 		 {
 			if(Condimentslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
 		{
 			if(GirisMi==false)
 			{
				if(Condimentslist.get(i).StokMiktari>10) {
 				if(Condimentslist.get(i).StokMiktari-adet-Condimentslist.get(i).katSayi>=0)
 	               	 Condimentslist.get(i).StokMiktari-=(adet+Condimentslist.get(i).katSayi);	
 			}
 			}
 			else
 			{
				if(Condimentslist.get(i).StokMiktari>10)
            	 Condimentslist.get(i).StokMiktari+=adet+Condimentslist.get(i).katSayi;
 			} 
 			kontrol=1;
			break;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
	     Condiments.ListeyiYazdir(Condimentslist);
		
	}


	@Override
	public void UrunFiyatGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int oran, boolean indirimMi,String islemYapilacakUrun) 
	{
		int kontrol=0;
		 Condiments.ListeyiYazdir(Condimentslist);	
		 for(int i=0;i<Condimentslist.size();i++)
  		{
			 if(Condimentslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
		 {
  			if(indirimMi==true)
  			{
  				if(Condimentslist.get(i).BirimFiyati-Condimentslist.get(i).BirimFiyati*(oran+Condimentslist.get(i).katSayi)/100>=0)
  	               	 Condimentslist.get(i).BirimFiyati-=Condimentslist.get(i).BirimFiyati*(oran+Condimentslist.get(i).katSayi)/100;	
  				
  			}
  			else
  			{
             	 Condimentslist.get(i).BirimFiyati+=Condimentslist.get(i).BirimFiyati*(oran-Condimentslist.get(i).katSayi)/100;
  			}
  			kontrol=1;
			break;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
	     Condiments.ListeyiYazdir(Condimentslist);
		
	}


	@Override
	public void UrunBirimAgirlikGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int oran,String islemYapilacakUrun) 
	{
		int kontrol=0;
		Condiments.ListeyiYazdir(Condimentslist);
		for(int i=0;i<Condimentslist.size();i++)
 		{  
			if(Condimentslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
		{
				Condimentslist.get(i).BirimAgirligi+="+"+oran+"+"+2;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
	     Condiments.ListeyiYazdir(Condimentslist);		
	}

	@Override
	public void YeniUrunEkle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, String Adi, String BirimAgirligi,
			double BirimFiyatı,String Detay) 
	{
		int toplamStok=0;
		for(int i=0;i<Condimentslist.size();i++)
		{
			toplamStok+=Condimentslist.get(i).StokMiktari;
		}
		int ortalamaStok=toplamStok/Condimentslist.size();
		
		Condiments.ListeyiYazdir(Condimentslist);
		Condiments condiments=new Condiments(Adi, kategori, BirimAgirligi, BirimFiyatı, ortalamaStok,
				"Condiments", Detay,kategori);
		Condimentslist.add(0,condiments);
		Condiments.ListeyiYazdir(Condimentslist);
		
	}

}
