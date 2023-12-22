package Paket1;

import java.util.ArrayList;



public class DairyProducts extends Urun
{
	private String kategoriAdi;
	private String detay;
	
	public void setKategoriAdi(String kategoriAdi) {
		this.kategoriAdi = kategoriAdi;
	}

	public void setDetay(String detay) {
		this.detay = detay;
	}
	 

	 public DairyProducts(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
	 
	public static void SutUrunuSil(ArrayList<DairyProducts> dairyProductsList)
	{
		sutUrunuSil(dairyProductsList);
	}

	protected static void sutUrunuSil(ArrayList<DairyProducts> dairyProductsList)
	{
		int toplam=0;
		for(int i=0;i<dairyProductsList.size();i++)
		{
			toplam+=dairyProductsList.get(i).getBirimFiyati();
		}
		double ort=toplam/dairyProductsList.size();
		
		for(int i=0;i<dairyProductsList.size();i++)
		{
			if(dairyProductsList.get(i).getBirimFiyati()>ort)
			{
				dairyProductsList.remove(i);
				break;
			}
		}		
	}
	
	 public static void ListeyiYazdir(ArrayList<DairyProducts> urun)
	 {
		 listeyiYazdir(urun);
	 }
	
	 protected static void listeyiYazdir(ArrayList<DairyProducts> urun)
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

