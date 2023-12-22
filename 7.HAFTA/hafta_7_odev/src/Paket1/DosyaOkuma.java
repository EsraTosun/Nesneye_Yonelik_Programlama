package Paket1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import Paket2.*;

public class DosyaOkuma {

	/*private static final ArrayList<DairyProducts> DairyProductslist = null;
	private static final ArrayList<Confections> Confectionslist = null;
	private static final ArrayList<GrainsCereals> GrainsCerealslist = null;
	private static final ArrayList<Beverages> Beverageslist = null;
	private static final ArrayList<Condiments> Condimentslist = null;  */

	public static void main(String[] args) {
		
		ArrayList<Paket2.GrainsCereals> GrainsCerealslist=new ArrayList<Paket2.GrainsCereals>();
		ArrayList<Paket2.DairyProducts> DairyProductslist=new ArrayList<Paket2.DairyProducts>();
		ArrayList<Paket2.Condiments> Condimentslist=new ArrayList<Paket2.Condiments>();;
		ArrayList<Paket2.Confections> Confectionslist=new ArrayList<Paket2.Confections>();
		ArrayList<Paket2.Beverages> Beverageslist=new ArrayList<Paket2.Beverages>();
		

		
		ListeOlustur(Beverageslist,Condimentslist,Confectionslist,DairyProductslist,GrainsCerealslist ); 


	}
	
	public static void ListeOlustur(ArrayList<Paket2.Beverages> Beverages,ArrayList<Paket2.Condiments> Condiments,
			ArrayList<Paket2.Confections> Confections,ArrayList<Paket2.DairyProducts> DairyProducts,ArrayList<Paket2.GrainsCereals> GrainsCereals )
	{
		listeOlustur(Beverages,Condiments,Confections,DairyProducts,GrainsCereals ); 

	}
	
	protected static void listeOlustur(ArrayList<Paket2.Beverages> Beverages,ArrayList<Paket2.Condiments> Condiments,
			ArrayList<Paket2.Confections> Confections,ArrayList<Paket2.DairyProducts> DairyProducts,ArrayList<Paket2.GrainsCereals> GrainsCereals )
	{
			
		try (BufferedReader okuyucu=new BufferedReader(new FileReader("Urunler.txt"))) {			
			
			String satir=okuyucu.readLine();
			satir=okuyucu.readLine();

			while(satir!=null)
			{
				String[] dizi= satir.split(" ");
				
				BufferedReader okuyucu2=new BufferedReader(new FileReader("UrunGrubu.txt"));
				String satir2=okuyucu2.readLine();
				satir2=okuyucu2.readLine(); //ilk satrı atlaması için iki kere tekrarlanır
				while(satir2!=null)
				{
					String[] dizi2= satir2.split(" ");

					if(Integer.valueOf(dizi[1])==Integer.valueOf(dizi2[0]))
					{
						if(Integer.valueOf(dizi2[0])==1)
							{
							Beverages yeniBeveragesUrun=new Beverages(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
									Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
		                  /*  yeniBeveragesUrun.Adi=dizi[0];
		                    yeniBeveragesUrun.KategoriIndex=Integer.valueOf(dizi[1]);
		                    yeniBeveragesUrun.BirimAgirligi=dizi[2];
		                    yeniBeveragesUrun.BirimFiyati=Double.valueOf(dizi[3]);
		                    yeniBeveragesUrun.StokMiktari=Integer.valueOf(dizi[4]);
		                    yeniBeveragesUrun.kategoriAdi=dizi2[1];
		                    yeniBeveragesUrun.detay=dizi2[2];  */
		                    
							Beverages.add(yeniBeveragesUrun);
							yeniBeveragesUrun=null;
						}
						
						else if(Integer.valueOf(dizi2[0])==2)
						{
							Condiments yeniCondimentsUrun=new Condiments(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
									Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
							/*yeniCondimentsUrun.Adi=dizi[0];
							yeniCondimentsUrun.KategoriIndex=Integer.valueOf(dizi[1]);
							yeniCondimentsUrun.BirimAgirligi=dizi[2];
							yeniCondimentsUrun.BirimFiyati=Double.valueOf(dizi[3]);
							yeniCondimentsUrun.StokMiktari=Integer.valueOf(dizi[4]);
							yeniCondimentsUrun.kategoriAdi=dizi2[1];
							yeniCondimentsUrun.detay=dizi2[2];  */
		                    
							Condiments.add(yeniCondimentsUrun);
							yeniCondimentsUrun=null;
						}
						else if(Integer.valueOf(dizi2[0])==3)
						{
							Confections yeniConfectionsUrun=new Confections(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
									Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
						/*	yeniConfectionsUrun.Adi=dizi[0];
							yeniConfectionsUrun.KategoriIndex=Integer.valueOf(dizi[1]);
							yeniConfectionsUrun.BirimAgirligi=dizi[2];
							yeniConfectionsUrun.BirimFiyati=Double.valueOf(dizi[3]);
							yeniConfectionsUrun.StokMiktari=Integer.valueOf(dizi[4]);
							yeniConfectionsUrun.kategoriAdi=dizi2[1];
							yeniConfectionsUrun.detay=dizi2[2];   */
		                    
							Confections.add(yeniConfectionsUrun);
							yeniConfectionsUrun=null;
						}
						
						else if(Integer.valueOf(dizi2[0])==4)
						{
							DairyProducts yeniDairyProductsUrun=new DairyProducts(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
									Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
							/*yeniDairyProductsUrun.Adi=dizi[0];
							yeniDairyProductsUrun.KategoriIndex=Integer.valueOf(dizi[1]);
							yeniDairyProductsUrun.BirimAgirligi=dizi[2];
							yeniDairyProductsUrun.BirimFiyati=Double.valueOf(dizi[3]);
							yeniDairyProductsUrun.StokMiktari=Integer.valueOf(dizi[4]);
							yeniDairyProductsUrun.kategoriAdi=dizi2[1];
							yeniDairyProductsUrun.detay=dizi2[2];   */
		                    
							DairyProducts.add(yeniDairyProductsUrun);
							yeniDairyProductsUrun=null;
						}
						
						else if(Integer.valueOf(dizi2[0])==5)
						{
							GrainsCereals yeniGrainsCerealsUrun=new GrainsCereals(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
									Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
							/*yeniGrainsCerealsUrun.Adi=dizi[0];
							yeniGrainsCerealsUrun.KategoriIndex=Integer.valueOf(dizi[1]);
							yeniGrainsCerealsUrun.BirimAgirligi=dizi[2];
							yeniGrainsCerealsUrun.BirimFiyati=Double.valueOf(dizi[3]);
							yeniGrainsCerealsUrun.StokMiktari=Integer.valueOf(dizi[4]);
							yeniGrainsCerealsUrun.kategoriAdi=dizi2[1];
							yeniGrainsCerealsUrun.detay=dizi2[2];  */
		                    
							GrainsCereals.add(yeniGrainsCerealsUrun);
							yeniGrainsCerealsUrun=null;
						}
						break;
					}	
					satir2=okuyucu2.readLine();
				}
				
				satir=okuyucu.readLine();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
