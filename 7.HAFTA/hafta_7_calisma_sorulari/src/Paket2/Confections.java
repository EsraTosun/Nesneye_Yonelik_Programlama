package Paket2;

import java.util.ArrayList;


public class Confections extends Urun
{

	protected String kategoriAdi;
	protected static String detay;
    
   
    
    public Confections(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
    
    public static void SekerlemeDetaySil(ArrayList<Confections> ConfectionsList)
    {
    	sekerlemeDetaySil(ConfectionsList);
    }

    protected static void sekerlemeDetaySil(ArrayList<Confections> ConfectionsList)
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
		 listeyiYazdir(urun);
	 }
	
    protected static void listeyiYazdir(ArrayList<Confections> urun)
	{
		for(int i=0;i<urun.size();i++)
		{
			System.out.println("\t "+urun.get(i).getAdi()+
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
