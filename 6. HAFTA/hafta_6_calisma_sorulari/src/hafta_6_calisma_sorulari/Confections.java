package hafta_6_calisma_sorulari;

import java.util.ArrayList;

public class Confections extends Urun
{
	static String kategoriAdi;
    static String detay;
    
    public Confections()
	 {
		 this.kategoriAdi=kategoriAdi;
		 this.detay=detay;
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
	

