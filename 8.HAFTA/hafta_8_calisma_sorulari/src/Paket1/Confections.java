package Paket1;

import java.util.ArrayList;


public class Confections extends Urun
{

	private String kategoriAdi;
	private String detay;
	
	public Confections()
	{
		
	}
    
    public Confections(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
    
    @Override
    public void UrunStokGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		String adi, boolean SatisMi, int adet)
    {
    		for(int i=0;i<Confectionslist.size();i++)
    		{
    			if(Confectionslist.get(i).getAdi().compareTo(adi)==0)
    			{
    				if(SatisMi)
                 	 {
    					if(Confectionslist.get(i).getStokMiktari()>10)
    					{    						
                 		 int yedek=Confectionslist.get(i).getStokMiktari()-adet;
                 		 if(yedek<0)
                 			 System.out.println("istediginiz miktarda urun bulunmamamaktadir");
                 		 else
                 			Confectionslist.get(i).setStokMiktari(yedek); 
    					}
                 	 }
                 	 else
                 		Confectionslist.get(i).setStokMiktari(Confectionslist.get(i).getStokMiktari()+adet);       				
    				break;
    			}
    		}
    		Confections.ListeyiYazdir(Confectionslist);
    		
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
			System.out.println("\t "+urun.get(i).getAdi()+
					"     \t \t "+urun.get(i).getKategoriIndex()+
					"\t \t      "+urun.get(i).getBirimAgirligi()+
					"\t \t "+urun.get(i).getBirimFiyati()+
					"\t \t "+urun.get(i).getStokMiktari()+
					"\t \t "+urun.get(i).kategoriAdi+
					"\t \t "+urun.get(i).detay);
				}
			System.out.println("listede eleman sayisi:"+urun.size());
			System.out.println();
	}
}
