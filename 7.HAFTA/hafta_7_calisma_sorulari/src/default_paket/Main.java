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
		
		System.out.println("stok degistirmek istediginiz urunu giriniz");
		String yeniAdi=veri.nextLine();
		System.out.println("Satin alicaksaniz 1\nSatis yapacaksaniz 1 disinde herhangi bri sayi girinzi");
		int sayi=veri.nextInt();
		System.out.println("adet sayisi giriniz");
		int sayi1=veri.nextInt();
		
		if(sayi==1)	
			Urun.UrunStokGuncelle(Beverageslist,Condimentslist,Confectionslist,
	    			DairyProductslist,GrainsCerealslist,yeniAdi ,true , sayi1);
			
		else
			Urun.UrunStokGuncelle(Beverageslist,Condimentslist,Confectionslist,
	    			DairyProductslist,GrainsCerealslist,yeniAdi, false, sayi1);	
		
		
		
		veri.nextLine();
		
		System.out.println("adini degistirmek istediginiz urunun adini giriniz");
    	String urunAdi=veri.nextLine();
		
		System.out.println("yeni adi giriniz");
		yeniAdi=veri.nextLine();
		
		Urun.UrunAdiDegistir(Beverageslist, Condimentslist, Confectionslist,
				DairyProductslist, GrainsCerealslist, urunAdi, yeniAdi);
		
		
		
		System.out.println("ekleyeceginiz urunun adi giriniz");
		yeniAdi=veri.nextLine();
		
		System.out.println("Birim agirligini giriniz");
		String yeniBirimAgirligi=veri.nextLine();
		
		System.out.println("Birim fiyatini giriniz");
		double yeniBirimFiyati=veri.nextDouble();
		
		System.out.println("stok fiyatini giriniz");
		int yeniStokFiyati=veri.nextInt();
		
		Beverages.IcecekUrunuEkle(Beverageslist, yeniAdi, yeniBirimAgirligi,yeniBirimFiyati,yeniStokFiyati);
		Beverages.ListeyiYazdir(Beverageslist);
		
		veri.nextLine();
		System.out.println("fiyati degistirilecek urunun adi giriniz");
		yeniAdi=veri.nextLine();
		
		System.out.println("Birim fiyatini giriniz");
	    yeniBirimFiyati=veri.nextInt();
		
				for(int k=0;k<Condimentslist.size();k++)
				{
					if(Condimentslist.get(k).getAdi().compareTo(yeniAdi)==0)
					{
						Condiments.CesniBirimFiyatGuncelle(Condimentslist.get(k), yeniBirimFiyati);
						break;
					}
				}
		
		Condiments.ListeyiYazdir(Condimentslist);   
		
		DairyProducts.ListeyiYazdir(DairyProductslist);
		DairyProducts.SutUrunuSil(DairyProductslist);
		DairyProducts.ListeyiYazdir(DairyProductslist);
		
		System.out.println("tahila eklemek istediginiz miktari giriniz");
		int miktar=veri.nextInt();
		
		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		GrainsCereals.TahilMinStokEkle(GrainsCerealslist, miktar);
		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		
		Confections.ListeyiYazdir(Confectionslist);
		Confections.SekerlemeDetaySil(Confectionslist);
		Confections.ListeyiYazdir(Confectionslist);
	
	
   }
}
