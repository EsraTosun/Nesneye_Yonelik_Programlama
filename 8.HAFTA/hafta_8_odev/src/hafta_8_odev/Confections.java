package hafta_8_odev;

import java.util.ArrayList;


public class Confections extends Urun
{

	public static String kategoriAdi;
    public static String detay;
    
    public Confections()
    {
    	
    }
    
    public Confections(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
    
    @Override
    public void  UrunStokGuncelle(ArrayList<Beverages> Beverageslist,
    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
    		int adet, boolean GirisMi)
    {
    	ListeyiYazdir(Confectionslist);       	   
    	 
    	for(int i=0;i<Confectionslist.size();i++)
 		{
        	if(GirisMi==false)
 			{
        		if(adet>10)
        		{
        		    if(Confectionslist.get(i).StokMiktari-adet>=0)           		
               		 Confectionslist.get(i).StokMiktari-=adet;    			
        		}		          			
 			}
 			else
 			{
 				if(adet<20)
     			 Confectionslist.get(i).StokMiktari+=adet;    				
 			}   
 		}
    	ListeyiYazdir(Confectionslist);       	   
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
