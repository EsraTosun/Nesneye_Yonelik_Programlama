package default_paket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Paket2.*;
import Paket1.*;

public class Main {

	public static void main(String[] args) {
		
        Scanner veri=new Scanner(System.in);
        
        ArrayList<Beverages> Beverageslist=new ArrayList<Beverages>();
		ArrayList<Condiments> Condimentslist=new ArrayList<Condiments>();
		ArrayList<Confections> Confectionslist=new ArrayList<Confections>();
		ArrayList<DairyProducts> DairyProductslist=new ArrayList<DairyProducts>();
		ArrayList<GrainsCereals> GrainsCerealslist=new ArrayList<GrainsCereals>();
		
		DosyaOkuma.ListeOlustur(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist);
		
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
	
	
}
