package hafta_8_odev;

import java.util.ArrayList;


public class Beverages extends Urun
{
	public static String kategoriAdi;
	public static String detay;
	
	 public Beverages()
	 {
		
	 }
	
	 public Beverages(String Adi,int KategoriIndex,String BirimAgirligi,double BirimFiyati,int StokMiktari,
			 String kategoriAdi,String detay)
	 {
		 super(Adi,KategoriIndex,BirimAgirligi,BirimFiyati,StokMiktari);
		 this.kategoriAdi=kategoriAdi;
		 this.detay=detay;
	 }  
	 
	@Override
	public void UrunFiyatGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
			int oran)
    {
 		ListeyiYazdir(Beverageslist);
     		for(int i=0;i<Beverageslist.size();i++)
     		{  
                if(oran>50)
                {
                    Beverageslist.get(i).BirimFiyati+=oran/2;
                }
                else if(25<oran & oran<50)
                {
                    Beverageslist.get(i).BirimFiyati+=oran;
                }
                else 
                {
                    Beverageslist.get(i).BirimFiyati+=(Math.pow(oran,2));
                }
            }
     		ListeyiYazdir(Beverageslist);
     		
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
}
