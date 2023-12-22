package hafta_9_odev;

import java.util.ArrayList;


public class Confections extends Urun implements IUrun
{

	public String kategoriAdi;
	public String detay;
	public int katSayi;
    
    public Confections()
    {
    	
    }
    
    public Confections(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay,int katSayi) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
		this.katSayi=katSayi;
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

	@Override
	public void UrunStokGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int adet, boolean GirisMi,String islemYapilacakUrun) 
	{
		int kontrol=0;
		Confections.ListeyiYazdir(Confectionslist);
        for(int i=0;i<Confectionslist.size();i++)
		 {
        	if(Confectionslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
     	{
       	    if(GirisMi==false)
			{
       		if(Confectionslist.get(i).StokMiktari-adet-Confectionslist.get(i).katSayi>=0)           		
           		 Confectionslist.get(i).StokMiktari-=(adet+Confectionslist.get(i).katSayi);    				          			
			}
			else
			{
    			 Confectionslist.get(i).StokMiktari+=adet+Confectionslist.get(i).katSayi;    				
			}  
       	 kontrol=1;
			break;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
		Confections.ListeyiYazdir(Confectionslist);
		
	}

	@Override
	public void UrunFiyatGuncelle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int oran, boolean indirimMi,String islemYapilacakUrun) 
	{
		int kontrol=0;
		Confections.ListeyiYazdir(Confectionslist);
		 for(int i=0;i<Confectionslist.size();i++)
 		{
			 if(Confectionslist.get(i).Adi.compareTo(islemYapilacakUrun)==0)
		   {	 
        	if(indirimMi==true)
 			{
        		if(Confectionslist.get(i).BirimFiyati-Confectionslist.get(i).BirimFiyati*(oran+Confectionslist.get(i).katSayi)/100>=0)           		
            		 Confectionslist.get(i).BirimFiyati-=Confectionslist.get(i).BirimFiyati*(oran+Confectionslist.get(i).katSayi)/100;    				          			
        		
 			}
 			else
 			{
     			 Confectionslist.get(i).BirimFiyati+=Confectionslist.get(i).BirimFiyati*(oran-Confectionslist.get(i).katSayi)/100;    				
 			}  
        	kontrol=1;
			break;
		}
	}
	     if(kontrol==0)
		System.out.println("urun bulunamadi");
		Confections.ListeyiYazdir(Confectionslist);
		
	}

	@Override
	public void UrunKategorikZamYap(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, int oran) 
	{
		Confections.ListeyiYazdir(Confectionslist);
		 for(int i=0;i<Confectionslist.size();i++)
 		{
        	Confectionslist.get(i).BirimFiyati+=Confectionslist.get(i).BirimFiyati*(oran-Confectionslist.get(i).katSayi)/100;    				
 		}
		Confections.ListeyiYazdir(Confectionslist);
		
	}

	@Override
	public void YeniUrunEkle(ArrayList<Beverages> Beverageslist, ArrayList<Condiments> Condimentslist,
			ArrayList<Confections> Confectionslist, ArrayList<DairyProducts> DairyProductslist,
			ArrayList<GrainsCereals> GrainsCerealslist, int kategori, String Adi, String BirimAgirligi,
			double BirimFiyatı, int StokMiktari, String Detay) 
	{
		Detay=Confectionslist.get(0).detay;
		Confections.ListeyiYazdir(Confectionslist);
		Confections confections=new Confections(Adi, kategori, BirimAgirligi, BirimFiyatı, StokMiktari,
				"Confections", Detay,kategori);
		Confectionslist.add(confections);
		Confections.ListeyiYazdir(Confectionslist);
		
	}

}
