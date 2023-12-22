package hafta_6_odev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class hafta_6_odev {

	public static void main(String[] args) {
		
        Scanner veri=new Scanner(System.in);
		
		ArrayList<Beverages> Beverageslist=new ArrayList<Beverages>();
		ArrayList<Condiments> Condimentslist=new ArrayList<Condiments>();
		ArrayList<Confections> Confectionslist=new ArrayList<Confections>();
		ArrayList<DairyProducts> DairyProductslist=new ArrayList<DairyProducts>();
		ArrayList<GrainsCereals> GrainsCerealslist=new ArrayList<GrainsCereals>();
		
		ListeOlustur(Beverageslist,Condimentslist,Confectionslist,DairyProductslist,GrainsCerealslist ); 
		
		Beverages.ListeyiYazdir(Beverageslist);
		Condiments.ListeyiYazdir(Condimentslist);
		Confections.ListeyiYazdir(Confectionslist);
		DairyProducts.ListeyiYazdir(DairyProductslist);
		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		
		System.out.println("1: UrunFiyatGuncelle\r\n"
				+ "2: UrunKategorikZamYap\r\n"
				+ "3. IcecekStokGuncelle\r\n"
				+ "4. CesniBirimAgirlikGuncelle\r\n"
				+ "5. SekerlemeDetayEkle\r\n"
				+ "6. SutUrunuSil\r\n"
				+ "7. TahilUrunEkle\r\n"
				+ "8. Cikis");
		      int secenek=veri.nextInt();
		do
		{
			switch (secenek) 
			{
		    case 1:		
		    	veri.nextLine();
		    	System.out.println("Fiyatini guncellemek istediginiz urunun adini giriniz");
		    	String adi=veri.nextLine();
		    	System.out.println("Yapmak istediginiz fiyati giriniz giriniz");
		    	int fiyat=veri.nextInt();
		    	
		    	Urun.UrunFiyatGuncelle(Beverageslist,Condimentslist,Confectionslist,
		    			DairyProductslist,GrainsCerealslist, adi, fiyat);	    	
			break;
			
            case 2:
            	System.out.println("Beverages\nCondiments\nConfections\nDairyProducts\nGrainsCereals");
		    	veri.nextLine();
		    	System.out.println("Yukaridaki kataloglardan Zam yapmak istediginiz katalog adini giriniz");
		    	String katalogAdi=veri.nextLine();
		    	System.out.println("yüzde kac zam yapmak istersiniz");
		    	int zam=veri.nextInt();
		    	
		    	Urun.UrunKategorikZamYap(Beverageslist, Condimentslist, Confectionslist,
		    			DairyProductslist, GrainsCerealslist, katalogAdi, zam);
			break;
			
			case 3:
				Beverages.ListeyiYazdir(Beverageslist);
				veri.nextLine();
				System.out.println("Beverages katalogundan guncellemek istediginiz indexi giriniz");
				int urunIndexi=veri.nextInt();
				System.out.println("Satin alacaksaniz 1 satis yapacaksaniz 1 disinda sayi giriniz");
				int sayac=veri.nextInt();
				System.out.println("adet sayisi giriniz");
				int adet=veri.nextInt();
				
				if(sayac==1)
					Beverages.IcecekStokGuncelle(Beverageslist,urunIndexi,true,adet );
				else
					Beverages.IcecekStokGuncelle(Beverageslist,urunIndexi, false,adet );
			break;
					
			case 4:	
				Condiments.ListeyiYazdir(Condimentslist);
				veri.nextLine();
				System.out.println("yeni agirlik giriniz");
				String yeniAgirlik=veri.nextLine();
				Condiments.CesniBirimAgirlikGuncelle(Condimentslist, yeniAgirlik);
			break;
						
			case 5:
				veri.nextLine();
				System.out.println("yeni detay giriniz:");
				String detay=veri.nextLine();
				
				Confections.SekerlemeDetayEkle(Confectionslist, detay);
			break;	
			
			case 6:
				DairyProducts.ListeyiYazdir(DairyProductslist);
				veri.nextLine();
				System.out.println("Silmek istediginiz urunun adini giriniz");
				String SuturunAdi=veri.nextLine();
				
				DairyProducts.SutUrunuSil(DairyProductslist,SuturunAdi);
			break;
			
			case 7:
				veri.nextLine();
				System.out.println("urun adi giriniz");
				String Adi=veri.nextLine();
				System.out.println("birim agirlik giriniz");
				String BirimAgirligi=veri.nextLine();
				System.out.println("birim fiyat giriniz(kusurlu fiyatlar icin virgulle giriniz)");
				double BirimFiyati=veri.nextDouble();
				System.out.println("Stok Miktari giriniz");
				int StokMiktari=veri.nextInt();
				GrainsCereals.TahilUrunEkle(GrainsCerealslist,Adi, BirimAgirligi, BirimFiyati, StokMiktari);
			break;
			
			case 8:
			return;	

			default:
				System.out.println("SECTIGINIZ SECENEK BULUNMAMAKTADIR");
			break;
			}
			
			
			
			System.out.println("1: UrunFiyatGuncelle\r\n"
					+ "2: UrunKategorikZamYap\r\n"
					+ "3. IcecekStokGuncelle\r\n"
					+ "4. CesniBirimAgirlikGuncelle\r\n"
					+ "5. SekerlemeDetayEkle\r\n"
					+ "6. SutUrunuSil\r\n"
					+ "7. TahilUrunEkle\r\n"
					+ "8. Cikis");
			      secenek=veri.nextInt();
		}while(secenek!=8);

	}
	
	public static void ListeOlustur(ArrayList<Beverages> Beverages,ArrayList<Condiments> Condiments,
			ArrayList<Confections> Confections,ArrayList<DairyProducts> DairyProducts,ArrayList<GrainsCereals> GrainsCereals ) 
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
							Beverages yeniBeveragesUrun=new Beverages();
		                    yeniBeveragesUrun.Adi=dizi[0];
		                    yeniBeveragesUrun.KategoriIndex=Integer.valueOf(dizi[1]);
		                    yeniBeveragesUrun.BirimAgirligi=dizi[2];
		                    yeniBeveragesUrun.BirimFiyati=Double.valueOf(dizi[3]);
		                    yeniBeveragesUrun.StokMiktari=Integer.valueOf(dizi[4]);
		                    yeniBeveragesUrun.kategoriAdi=dizi2[1];
		                    yeniBeveragesUrun.detay=dizi2[2];
		                    
							Beverages.add(yeniBeveragesUrun);
							yeniBeveragesUrun=null;
						}
						
						else if(Integer.valueOf(dizi2[0])==2)
						{
							Condiments yeniCondimentsUrun=new Condiments();
							yeniCondimentsUrun.Adi=dizi[0];
							yeniCondimentsUrun.KategoriIndex=Integer.valueOf(dizi[1]);
							yeniCondimentsUrun.BirimAgirligi=dizi[2];
							yeniCondimentsUrun.BirimFiyati=Double.valueOf(dizi[3]);
							yeniCondimentsUrun.StokMiktari=Integer.valueOf(dizi[4]);
							yeniCondimentsUrun.kategoriAdi=dizi2[1];
							yeniCondimentsUrun.detay=dizi2[2];
		                    
							Condiments.add(yeniCondimentsUrun);
							yeniCondimentsUrun=null;
						}
						else if(Integer.valueOf(dizi2[0])==3)
						{
							Confections yeniConfectionsUrun=new Confections();
							yeniConfectionsUrun.Adi=dizi[0];
							yeniConfectionsUrun.KategoriIndex=Integer.valueOf(dizi[1]);
							yeniConfectionsUrun.BirimAgirligi=dizi[2];
							yeniConfectionsUrun.BirimFiyati=Double.valueOf(dizi[3]);
							yeniConfectionsUrun.StokMiktari=Integer.valueOf(dizi[4]);
							yeniConfectionsUrun.kategoriAdi=dizi2[1];
							yeniConfectionsUrun.detay=dizi2[2];
		                    
							Confections.add(yeniConfectionsUrun);
							yeniConfectionsUrun=null;
						}
						
						else if(Integer.valueOf(dizi2[0])==4)
						{
							DairyProducts yeniDairyProductsUrun=new DairyProducts();
							yeniDairyProductsUrun.Adi=dizi[0];
							yeniDairyProductsUrun.KategoriIndex=Integer.valueOf(dizi[1]);
							yeniDairyProductsUrun.BirimAgirligi=dizi[2];
							yeniDairyProductsUrun.BirimFiyati=Double.valueOf(dizi[3]);
							yeniDairyProductsUrun.StokMiktari=Integer.valueOf(dizi[4]);
							yeniDairyProductsUrun.kategoriAdi=dizi2[1];
							yeniDairyProductsUrun.detay=dizi2[2];
		                    
							DairyProducts.add(yeniDairyProductsUrun);
							yeniDairyProductsUrun=null;
						}
						
						else if(Integer.valueOf(dizi2[0])==5)
						{
							GrainsCereals yeniGrainsCerealsUrun=new GrainsCereals();
							yeniGrainsCerealsUrun.Adi=dizi[0];
							yeniGrainsCerealsUrun.KategoriIndex=Integer.valueOf(dizi[1]);
							yeniGrainsCerealsUrun.BirimAgirligi=dizi[2];
							yeniGrainsCerealsUrun.BirimFiyati=Double.valueOf(dizi[3]);
							yeniGrainsCerealsUrun.StokMiktari=Integer.valueOf(dizi[4]);
							yeniGrainsCerealsUrun.kategoriAdi=dizi2[1];
							yeniGrainsCerealsUrun.detay=dizi2[2];
		                    
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
