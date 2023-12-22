package hafta_8_odev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

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
				+ "3. UrunFiyatGuncelle (Beverages )\r\n"
				+ "4. CesniBirimAgirlikGuncelle\r\n"
				+ "5. UrunStokGuncelle (Confections)\r\n"
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
		    	System.out.println("direk zam mi yapmak istersiniz yoksa kullaniciya sorulsun mu \n"
		    			+ "direk yapilsin ise 1, kullaniciye sorulmasini istiyorsaniz 1 disinde bir sayi giriniz");
		    	int islem=veri.nextInt();
		    	
		    	if(islem==1)
		    	{
		    		System.out.println("Yapmak istediginiz zam oranini giriniz");
			    	int oran=veri.nextInt();
			    	
			    	Urun urunNesne=new Urun();
			    	
			    	urunNesne.UrunFiyatGuncelle(Beverageslist,Condimentslist,Confectionslist,
			    			DairyProductslist,GrainsCerealslist,oran);	    	
		    	}
		    	else
		    	{
		    		System.out.println("indirim yapmak istiyorsaniz true,degilse false giriniz");
		    		boolean indirimMi=veri.nextBoolean();
		    		System.out.println("Yapmak istediginiz orani giriniz");
			    	int oran=veri.nextInt();
			    	
			    	Urun.UrunFiyatGuncelle(Beverageslist, Condimentslist, Confectionslist, 
			    			DairyProductslist, GrainsCerealslist, oran, indirimMi);
		    	}
		    	Beverages.ListeyiYazdir(Beverageslist);
		    	Condiments.ListeyiYazdir(Condimentslist);
		    	Confections.ListeyiYazdir(Confectionslist);
		    	DairyProducts.ListeyiYazdir(DairyProductslist);
		    	GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		    	
			break;
			
            case 2:
            	System.out.println("stok kontrol edilmeyecekse 1 edilecekse 1 disinde bir sayi giriniz");
            	int kontrol=veri.nextInt();	
            	System.out.println("Beverages\nCondiments\nConfections\nDairyProducts\nGrainsCereals");
		    	veri.nextLine();
		    	System.out.println("Yukaridaki kataloglardan Zam yapmak istediginiz katalog adini giriniz");
		    	String katalogAdi=veri.nextLine();
		    	System.out.println("yüzde kac zam yapmak istersiniz");
		    	int zam=veri.nextInt();
		    	
		    	if(kontrol==1)
		    	{
		    		Urun.UrunKategorikZamYap(Beverageslist, Condimentslist, Confectionslist,
			    			DairyProductslist, GrainsCerealslist, katalogAdi, zam);
		    	}
		    	else
		    	{
		    		System.out.println("urun kontrol sayisini giriniz");
		    		int urunKontrol=veri.nextInt();
		    		Urun.UrunKategorikZamYap(Beverageslist, Condimentslist, Confectionslist,
		    				DairyProductslist, GrainsCerealslist, katalogAdi, zam, urunKontrol);
		    	}
		    	
			break;
			
			case 3:
				System.out.println("Yapmak istediginiz zam oranini giriniz");
		    	int oran=veri.nextInt();
		    	
		    	Beverages beveragesNesne=new Beverages();
		    	
		    	beveragesNesne.UrunFiyatGuncelle(Beverageslist,Condimentslist,Confectionslist,
		    			DairyProductslist,GrainsCerealslist,oran);
				
				
			break;
					
			case 4:	
				Condiments.ListeyiYazdir(Condimentslist);
				veri.nextLine();
				System.out.println("yeni agirlik giriniz");
				String yeniAgirlik=veri.nextLine();
				System.out.println("liste sonuna ekleme yapilacak ise 1, indexe ise 1 disinda sayi giriniz");
				kontrol=veri.nextInt();
				
				if(kontrol==1)
				Condiments.CesniBirimAgirlikGuncelle(Condimentslist, yeniAgirlik);
				
				else
				{
					System.out.println("index giriniz");
					int index=veri.nextInt();
				Condiments.CesniBirimAgirlikGuncelle(Condimentslist, yeniAgirlik, index);	
				}
			break;
						
			case 5:
				veri.nextLine();
				System.out.println("urun girisi ise true degilse false giriniz");
				boolean girisMi=veri.nextBoolean();
				System.out.println("urun adedi giriniz");
				int adet=veri.nextInt();
				
				Confections confecsionsNesne=new Confections();
				
				confecsionsNesne.UrunStokGuncelle(Beverageslist, Condimentslist, Confectionslist, 
						DairyProductslist, GrainsCerealslist, adet, girisMi);
				
				
			break;	
			
			case 6:
				DairyProducts.ListeyiYazdir(DairyProductslist);
				veri.nextLine();
				System.out.println("1- Adi Ile Silme\n2- Min-Max Stok Ile Silme\n3- Min Stoktan Kucukleri Sil");
				int index=veri.nextInt();
				if(index==1)
				{
					veri.nextLine();
					System.out.println("Silmek istediginiz urunun adini giriniz");
					String SuturunAdi=veri.nextLine();
					DairyProducts.SutUrunuSil(DairyProductslist,SuturunAdi);	
				}
				else if(index==2)
				{
					System.out.println("Min Stok gir");
					int min=veri.nextInt();
					System.out.println("Max Stok gir");
					int max=veri.nextInt();
					DairyProducts.SutUrunuSil(DairyProductslist, min, max);
				}
				else if(index==3)
				{
					System.out.println("Min Stok gir");
					int min=veri.nextInt();
					DairyProducts.SutUrunuSil(DairyProductslist, min);
				}
				else
				{
					System.out.println("hatali secim");
				}
				
			break;
			
			case 7:
				System.out.println("1-TahilUrunEkle(Adi,BirimAgirligi, BirimFiyatı, StokMiktari)\r\n"
						+ "2- TahilUrunEkle(Adi, BirimAgirligi, BirimFiyatı, StokMiktari, Detay)");
				int deger=veri.nextInt();
				veri.nextLine();
				System.out.println("urun adi giriniz");
				String Adi=veri.nextLine();
				System.out.println("birim agirlik giriniz");
				String BirimAgirligi=veri.nextLine();
				System.out.println("birim fiyat giriniz(kusurlu fiyatlar icin virgulle giriniz)");
				double BirimFiyati=veri.nextDouble();
				System.out.println("Stok Miktari giriniz");
				int StokMiktari=veri.nextInt();
				if(deger==1)
				GrainsCereals.TahilUrunEkle(GrainsCerealslist,Adi, BirimAgirligi, BirimFiyati, StokMiktari);
				else if(deger==2)
				{
					veri.nextLine();
					System.out.println("detay giriniz");
					String detay=veri.nextLine();
				GrainsCereals.TahilUrunEkle(GrainsCerealslist, Adi, BirimAgirligi, BirimFiyati, StokMiktari,detay);
				}
				else
				System.out.println("hatali secim");
			break;
			
			case 8:
			return;	

			default:
				System.out.println("SECTIGINIZ SECENEK BULUNMAMAKTADIR");
			break;
			}
			
			
			
			System.out.println("1: UrunFiyatGuncelle\r\n"
					+ "2: UrunKategorikZamYap\r\n"
					+ "3. UrunFiyatGuncelle (Beverages )\r\n"
					+ "4. CesniBirimAgirlikGuncelle\r\n"
					+ "5. UrunStokGuncelle (Confections)\r\n"
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
