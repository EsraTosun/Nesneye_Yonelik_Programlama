package Paket1;

import java.util.ArrayList;



public class Beverages extends Urun
{
	private String kategoriAdi;
	private String detay;
	
	
	public Beverages(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
	
	public String getKategoriAdi() {
		return kategoriAdi;
	}

	public String getDetay() {
		return detay;
	}


	
	
	
	public static void IcecekUrunuEkle(ArrayList<Beverages> BeveragesList,
			String Adi,String BirimAgirligi,double BirimFiyatı,int StokMiktari)
	{
		Beverages yeniBevreagesUrun=new Beverages(Adi, 1,BirimAgirligi, BirimFiyatı, StokMiktari,
				BeveragesList.get(0).kategoriAdi,BeveragesList.get(0).detay);
		/*yeniBevreagesUrun.setAdi(Adi);
		yeniBevreagesUrun.BirimAgirligi=BirimAgirligi;
		yeniBevreagesUrun.BirimFiyati=BirimFiyatı;
		yeniBevreagesUrun.StokMiktari=StokMiktari;
		yeniBevreagesUrun.KategoriIndex=BeveragesList.get(0).KategoriIndex;
		yeniBevreagesUrun.kategoriAdi=BeveragesList.get(0).kategoriAdi;
		yeniBevreagesUrun.detay=BeveragesList.get(0).det*/
		
		BeveragesList.add(yeniBevreagesUrun);  
	}
	
	
	public static void ListeyiYazdir(ArrayList<Beverages> urun)
	{
		listeyiYazdir(urun);
	}
	
	protected static void listeyiYazdir(ArrayList<Beverages> urun)
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
