package hafta_9_odev;

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
	 
	 public void UrunKategorikZamYap (ArrayList<Beverages> Beverageslist,
	    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
	    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
	    		int kategori,int x);
	 
	 public void YeniUrunEkle(ArrayList<Beverages> Beverageslist,
	    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
	    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
	    		int kategori,String Adi,String BirimAgirligi,double BirimFiyatı,int StokMiktari,String Detay);
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
    	int kontrol=0;
		if(kategori==1)
		{
			for(int i=0;i<Beverageslist.size();i++)
			{
				if(Beverageslist.get(i).Adi.compareTo(isim)==0)
				{
					Beverages.ListeyiYazdir(Beverageslist);
					Beverageslist.get(i).Adi=yeniIsim;
					Beverageslist.get(i).detay=yeniDetay;
					Beverages.ListeyiYazdir(Beverageslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
				System.out.println("urun bulunamadi");
		}
		else if(kategori==2)
		{
			for(int i=0;i<Condimentslist.size();i++)
			{
				if(Condimentslist.get(i).Adi.compareTo(isim)==0)
				{
					Condiments.ListeyiYazdir(Condimentslist);
					Condimentslist.get(i).Adi=yeniIsim;
					Condimentslist.get(i).detay=yeniDetay;
					Condiments.ListeyiYazdir(Condimentslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
				System.out.println("urun bulunamadi");
		}
		else if(kategori==3)
		{
			for(int i=0;i<Confectionslist.size();i++)
			{
				if(Confectionslist.get(i).Adi.compareTo(isim)==0)
				{
					Confections.ListeyiYazdir(Confectionslist);
					Confectionslist.get(i).Adi=yeniIsim;
					Confectionslist.get(i).detay=yeniDetay;
					Confections.ListeyiYazdir(Confectionslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
				System.out.println("urun bulunamadi");
		}
		else if(kategori==4)
		{
			for(int i=0;i<DairyProductslist.size();i++)
			{
				if(DairyProductslist.get(i).Adi.compareTo(isim)==0)
				{
					DairyProducts.ListeyiYazdir(DairyProductslist);
					DairyProductslist.get(i).Adi=yeniIsim;
					DairyProductslist.get(i).detay=yeniDetay;
					DairyProducts.ListeyiYazdir(DairyProductslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
				System.out.println("urun bulunamadi");
		}
		else if(kategori==5)
		{
			for(int i=0;i<GrainsCerealslist.size();i++)
			{
				if(GrainsCerealslist.get(i).Adi.compareTo(isim)==0)
				{
					GrainsCereals.ListeyiYazdir(GrainsCerealslist);
					GrainsCerealslist.get(i).Adi=yeniIsim;
					GrainsCerealslist.get(i).detay=yeniDetay;
					GrainsCereals.ListeyiYazdir(GrainsCerealslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
				System.out.println("urun bulunamadi");
		}
		else
			System.out.println("girdiginiz isim bulunmamaktadir");
		
	}
     public static void UrunSil(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori,String isim) 
	{
    	 int kontrol=0;
		if(kategori==1)
		{
			for(int i=0;i<Beverageslist.size();i++)
			{
				if(Beverageslist.get(i).Adi.compareTo(isim)==0)
				{
					Beverages.ListeyiYazdir(Beverageslist);
					Beverageslist.remove(i);
					Beverages.ListeyiYazdir(Beverageslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
				System.out.println("urun bulunamadi");
		}
		else if(kategori==2)
		{
			for(int i=0;i<Condimentslist.size();i++)
			{
				if(Condimentslist.get(i).Adi.compareTo(isim)==0)
				{
					Condiments.ListeyiYazdir(Condimentslist);
					Condimentslist.remove(i);
					Condiments.ListeyiYazdir(Condimentslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
				System.out.println("urun bulunamadi");
		}
		else if(kategori==3)
		{
			for(int i=0;i<Confectionslist.size();i++)
			{
				if(Confectionslist.get(i).Adi.compareTo(isim)==0)
				{
					Confections.ListeyiYazdir(Confectionslist);
					Confectionslist.remove(i);
					Confections.ListeyiYazdir(Confectionslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
				System.out.println("urun bulunamadi");
		}
		else if(kategori==4)
		{
			for(int i=0;i<DairyProductslist.size();i++)
			{
				if(DairyProductslist.get(i).Adi.compareTo(isim)==0)
				{
					DairyProducts.ListeyiYazdir(DairyProductslist);
					DairyProductslist.remove(i);
					DairyProducts.ListeyiYazdir(DairyProductslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
				System.out.println("urun bulunamadi");
		}
		else if(kategori==5)
		{
			for(int i=0;i<GrainsCerealslist.size();i++)
			{
				if(GrainsCerealslist.get(i).Adi.compareTo(isim)==0)
				{
					GrainsCereals.ListeyiYazdir(GrainsCerealslist);
					GrainsCerealslist.remove(i);
					GrainsCereals.ListeyiYazdir(GrainsCerealslist);
					kontrol=1;
					break;
				}
			}
			if(kontrol==0)
				System.out.println("urun bulunamadi");
		}
		else
			System.out.println("girdiginiz isim bulunmamaktadir");
		
		
	}
	
}

