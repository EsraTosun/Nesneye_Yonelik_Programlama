package hafta_10_odev;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
        Scanner veri=new Scanner(System.in);
        String file="Urunler.txt";
        
        ArrayList<Urun.Beverages> Beverageslist=new ArrayList<Urun.Beverages>();
		ArrayList<Urun.Condiments> Condimentslist=new ArrayList<Urun.Condiments>();
		ArrayList<Urun.Confections> Confectionslist=new ArrayList<Urun.Confections>();
		ArrayList<Urun.DairyProducts> DairyProductslist=new ArrayList<Urun.DairyProducts>();
		ArrayList<Urun.GrainsCereals> GrainsCerealslist=new ArrayList<Urun.GrainsCereals>();
		
		DosyaIslemleri.DosyaOkuma.ListeOlustur(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist);
		
		Urun.Beverages.ListeyiYazdir(Beverageslist);
		Urun.Condiments.ListeyiYazdir(Condimentslist);
		Urun.Confections.ListeyiYazdir(Confectionslist);
		Urun.DairyProducts.ListeyiYazdir(DairyProductslist);
		Urun.GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		

		System.out.println("1: UrunFiyatGuncelle\r\n"
				+ "2: UrunKategorikZamYap\r\n"
				+ "3. IcecekStokGuncelle\r\n"
				+ "4. CesniBirimAgirlikGuncelle\r\n"
				+ "5. SekerlemeDetayEkle\r\n"
				+ "6. SutUrunuSil\r\n"
				+ "7. TahilUrunEkle\r\n"
				+ "8. DosyaYaz\r\n"
				+ "9. Cikis\r\n");
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
				Urun.Beverages.ListeyiYazdir(Beverageslist);
				veri.nextLine();
				System.out.println("Beverages katalogundan guncellemek istediginiz indexi giriniz");
				int urunIndexi=veri.nextInt();
				System.out.println("Satin alacaksaniz 1 satis yapacaksaniz 1 disinda sayi giriniz");
				int sayac=veri.nextInt();
				System.out.println("adet sayisi giriniz");
				int adet=veri.nextInt();
				
				if(sayac==1)
					Urun.Beverages.IcecekStokGuncelle(Beverageslist,urunIndexi,true,adet );
				else
					Urun.Beverages.IcecekStokGuncelle(Beverageslist,urunIndexi, false,adet );
			break;
					
			case 4:	
				Urun.Condiments.ListeyiYazdir(Condimentslist);
				veri.nextLine();
				System.out.println("yeni agirlik giriniz");
				String yeniAgirlik=veri.nextLine();
				Urun.Condiments.CesniBirimAgirlikGuncelle(Condimentslist, yeniAgirlik);
			break;
						
			case 5:
				veri.nextLine();
				System.out.println("yeni detay giriniz:");
				String detay=veri.nextLine();
				
				Urun.Confections.SekerlemeDetayEkle(Confectionslist, detay);
			break;	
			
			case 6:
				Urun.DairyProducts.ListeyiYazdir(DairyProductslist);
				veri.nextLine();
				System.out.println("Silmek istediginiz urunun adini giriniz");
				String SuturunAdi=veri.nextLine();
				
				Urun.DairyProducts.SutUrunuSil(DairyProductslist,SuturunAdi);
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
				Urun.GrainsCereals.TahilUrunEkle(GrainsCerealslist,Adi, BirimAgirligi, BirimFiyati, StokMiktari);
			break;
			
			case 8:
				DosyaIslemleri.DosyaYazma.ListeyiYaz(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist, file);
			break;
			
			case 9:
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
					+ "8. DosyaYaz\r\n"
					+ "9. Cikis\r\n");
			      secenek=veri.nextInt();
		}while(secenek!=9);

	}
}
	
