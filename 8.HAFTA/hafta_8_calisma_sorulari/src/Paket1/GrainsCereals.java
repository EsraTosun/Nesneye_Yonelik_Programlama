package Paket1;

import java.util.ArrayList;



public class GrainsCereals extends Urun
{
	private String kategoriAdi;
	private String detay;
	 
	public GrainsCereals()
	{
		
	}

	public  GrainsCereals(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
	 
	
	public String getKategoriAdi() {
		return kategoriAdi;
	}


	public void setKategoriAdi(String kategoriAdi) {
		this.kategoriAdi = kategoriAdi;
	}


	public String getDetay() {
		return detay;
	}


	public void setDetay(String detay) {
		this.detay = detay;
	}
	
	@Override
	public void UruneZamYap(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,double zamOrani)
	{
		ListeyiYazdir(GrainsCerealslist);
		for(int i=0;i<GrainsCerealslist.size();i++)
		{
			if(GrainsCerealslist.get(i).getStokMiktari()<10 & GrainsCerealslist.get(i).getBirimFiyati()<50 )
			{
				GrainsCerealslist.get(i).setBirimFiyati(GrainsCerealslist.get(i).getBirimFiyati()+
						GrainsCerealslist.get(i).getBirimFiyati()*zamOrani/100);
			}
			else if(GrainsCerealslist.get(i).getStokMiktari()>10 & GrainsCerealslist.get(i).getBirimFiyati()>50 )
			{
				GrainsCerealslist.get(i).setBirimFiyati(GrainsCerealslist.get(i).getBirimFiyati()+
						GrainsCerealslist.get(i).getBirimFiyati()*zamOrani/100/4);
			}
			else if(GrainsCerealslist.get(i).getStokMiktari()<10 & GrainsCerealslist.get(i).getBirimFiyati()>50 )
			{
				GrainsCerealslist.get(i).setBirimFiyati(GrainsCerealslist.get(i).getBirimFiyati()+
						GrainsCerealslist.get(i).getBirimFiyati()*zamOrani/100/2);	
			}
			else
			{
				GrainsCerealslist.get(i).setBirimFiyati(GrainsCerealslist.get(i).getBirimFiyati()+
						GrainsCerealslist.get(i).getBirimFiyati()*zamOrani/100/3);
			}
		}
		ListeyiYazdir(GrainsCerealslist);
	} 



	public static void ListeyiYazdir(ArrayList<GrainsCereals> urun)
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
