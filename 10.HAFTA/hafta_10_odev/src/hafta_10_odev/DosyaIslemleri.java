package hafta_10_odev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import hafta_10_odev.Urun.Beverages;
import hafta_10_odev.Urun.Condiments;
import hafta_10_odev.Urun.Confections;
import hafta_10_odev.Urun.DairyProducts;
import hafta_10_odev.Urun.GrainsCereals;



public class DosyaIslemleri 
{
	public static class DosyaOkuma
	{
		public static void ListeOlustur(ArrayList<Beverages> Beverages,ArrayList<Condiments> Condiments,
				ArrayList<Confections> Confections,ArrayList<DairyProducts> DairyProducts,ArrayList<GrainsCereals> GrainsCereals )
		{
				
			try (BufferedReader okuyucu=new BufferedReader(new FileReader("Urunler.txt"))) {			
				
				String satir=okuyucu.readLine();

				while(satir!=null)
				{
					String[] dizi= satir.split(" ");
					
					BufferedReader okuyucu2=new BufferedReader(new FileReader("UrunGrubu.txt"));
					String satir2=okuyucu2.readLine();
					while(satir2!=null)
					{
						String[] dizi2= satir2.split(" ");

						if(Integer.valueOf(dizi[1])==Integer.valueOf(dizi2[0]))
						{
							if(Integer.valueOf(dizi2[0])==1)
								{
								Beverages yeniBeveragesUrun=new Beverages(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
										Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
			                
			                    
								Beverages.add(yeniBeveragesUrun);
								yeniBeveragesUrun=null;
							}
							
							else if(Integer.valueOf(dizi2[0])==2)
							{
								Condiments yeniCondimentsUrun=new Condiments(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
										Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
								
			                    
								Condiments.add(yeniCondimentsUrun);
								yeniCondimentsUrun=null;
							}
							else if(Integer.valueOf(dizi2[0])==3)
							{
								Confections yeniConfectionsUrun=new Confections(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
										Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
							
			                    
								Confections.add(yeniConfectionsUrun);
								yeniConfectionsUrun=null;
							}
							
							else if(Integer.valueOf(dizi2[0])==4)
							{
								DairyProducts yeniDairyProductsUrun=new DairyProducts(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
										Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
								
			                    
								DairyProducts.add(yeniDairyProductsUrun);
								yeniDairyProductsUrun=null;
							}
							
							else if(Integer.valueOf(dizi2[0])==5)
							{
								GrainsCereals yeniGrainsCerealsUrun=new GrainsCereals(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
										Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
								
			                    
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
	
	public static class DosyaYazma
	{
		public static void ListeyiYaz(ArrayList<Beverages> Beverageslist,
	    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
	    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
	    		String file) throws IOException
		{
			FileWriter fileReader=new FileWriter(file);
			for (Beverages urun : Beverageslist) 
			{
				fileReader.write(urun.Adi);
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.KategoriIndex));
				fileReader.write(" ");
				fileReader.write(urun.BirimAgirligi);
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.BirimFiyati));
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.StokMiktari));
				fileReader.write("\n");
			}
			
			for (Condiments urun : Condimentslist) 
			{
				fileReader.write(urun.Adi);
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.KategoriIndex));
				fileReader.write(" ");
				fileReader.write(urun.BirimAgirligi);
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.BirimFiyati));
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.StokMiktari));
				fileReader.write("\n");
			}
			
			for (Confections urun : Confectionslist) 
			{
				fileReader.write(urun.Adi);
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.KategoriIndex));
				fileReader.write(" ");
				fileReader.write(urun.BirimAgirligi);
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.BirimFiyati));
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.StokMiktari));
				fileReader.write("\n");
			}
			
			for (DairyProducts urun : DairyProductslist) 
			{
				fileReader.write(urun.Adi);
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.KategoriIndex));
				fileReader.write(" ");
				fileReader.write(urun.BirimAgirligi);
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.BirimFiyati));
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.StokMiktari));
				fileReader.write("\n");
			}
			for (GrainsCereals urun : GrainsCerealslist) 
			{
				fileReader.write(urun.Adi);
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.KategoriIndex));
				fileReader.write(" ");
				fileReader.write(urun.BirimAgirligi);
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.BirimFiyati));
				fileReader.write(" ");
				fileReader.write(String.valueOf(urun.StokMiktari));
				fileReader.write("\n");
			}
		
			
			fileReader.close();

			
		}
		
	}

}
