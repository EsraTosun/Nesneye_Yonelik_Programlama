package default_paket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Paket1.*;


public class Main {

	public static void main(String[] args) {
		
        Scanner veri=new Scanner(System.in);
        
        ArrayList<Beverages> Beverageslist=new ArrayList<Beverages>();
		ArrayList<Condiments> Condimentslist=new ArrayList<Condiments>();
		ArrayList<Confections> Confectionslist=new ArrayList<Confections>();
		ArrayList<DairyProducts> DairyProductslist=new ArrayList<DairyProducts>();
		ArrayList<GrainsCereals> GrainsCerealslist=new ArrayList<GrainsCereals>();
		
		ListeOlustur(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist);
		
		Beverages.ListeyiYazdir(Beverageslist);
		Condiments.ListeyiYazdir(Condimentslist);
		Confections.ListeyiYazdir(Confectionslist);
		DairyProducts.ListeyiYazdir(DairyProductslist);
		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		
		Urun yeniUrun=new Urun();
		Confections confectionsUrun=new Confections();
    	Condiments condimentsUrun=new Condiments();

		
		 System.out.println("stok degistirmek istediginiz urunu giriniz");
		String yeniAdi=veri.nextLine();
		System.out.println("Satin alicaksaniz 1\nSatis yapacaksaniz 1 disinde herhangi bri sayi girinzi");
		int sayi=veri.nextInt();
		System.out.println("adet sayisi giriniz");
		int sayi1=veri.nextInt();
		
		if(sayi==1)	
			yeniUrun.UrunStokGuncelle(Beverageslist,Condimentslist,Confectionslist,
	    			DairyProductslist,GrainsCerealslist,yeniAdi ,true , sayi1);
			
		else
			yeniUrun.UrunStokGuncelle(Beverageslist,Condimentslist,Confectionslist,
	    			DairyProductslist,GrainsCerealslist,yeniAdi, false, sayi1);	
		
		veri.nextLine();
		System.out.println("stok degistirmek istediginiz urunu giriniz");
		yeniAdi=veri.nextLine();
		System.out.println("Satin alicaksaniz 1\nSatis yapacaksaniz 1 disinde herhangi bri sayi girinzi");
		sayi=veri.nextInt();
		System.out.println("adet sayisi giriniz");
		sayi1=veri.nextInt();
		

		if(sayi==1)	
			confectionsUrun.UrunStokGuncelle(Beverageslist,Condimentslist,Confectionslist,
	    			DairyProductslist,GrainsCerealslist,yeniAdi ,true , sayi1);
			
		else
			confectionsUrun.UrunStokGuncelle(Beverageslist,Condimentslist,Confectionslist,
	    			DairyProductslist,GrainsCerealslist,yeniAdi, false, sayi1);	
		
		//veri.nextLine();
		
		System.out.println("adini degistirmek istediginiz urunun adini giriniz");
    	String urunAdi=veri.nextLine();
		
		yeniUrun.UrunAdiDegistir(Beverageslist, Condimentslist, Confectionslist,
				DairyProductslist, GrainsCerealslist, urunAdi);  
		
		System.out.println("adini degistirmek istediginiz urunun adini giriniz");
    	urunAdi=veri.nextLine();
    	
		
		condimentsUrun.UrunAdiDegistir(Beverageslist, Condimentslist, Confectionslist,
				DairyProductslist, GrainsCerealslist, urunAdi);  
		
		
		System.out.println("zam oranini giriniz");
		int zamOrani=veri.nextInt();
		
		GrainsCereals grainsCerealsUrun=new GrainsCereals();
		grainsCerealsUrun.UruneZamYap(Beverageslist, Condimentslist, Confectionslist,
		 DairyProductslist, GrainsCerealslist, zamOrani);  
		
		System.out.println("zam oranini giriniz");
		int zamorani=veri.nextInt();
		
		Condiments yenicondimentsUrun=new Condiments();
		yenicondimentsUrun.UruneZamYap(Condimentslist, zamorani);
		
		System.out.println("zam oranini giriniz");
		zamorani=veri.nextInt();
		
		System.out.println("stok kontrolunu giriniz");
		int stokKontrol=veri.nextInt();
	
		yenicondimentsUrun.UruneZamYap(Condimentslist, zamorani,stokKontrol);;  
		
		System.out.println("zam oranini giriniz");
		zamorani=veri.nextInt();
		
		System.out.println("stok kontrolunu giriniz");
		int birimFiyatKontrol=veri.nextInt();
		
		yenicondimentsUrun.UruneZamYap(Condimentslist, zamorani, 0, birimFiyatKontrol);  
    	
    	 System.out.println("adini degistirmek istediginiz urunun adini giriniz");
    	String yeniUrunAdi=veri.nextLine();
    	
    	veri.nextLine();
    	
    	System.out.println("sesli olmasini istiyorsaniz true,sessiz ise false giriniz");
    	boolean sesliMi=veri.nextBoolean();
		
		yeniUrun.UrunAdiDegistir(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist,
				yeniUrunAdi, sesliMi);  
    	
    	
    	System.out.println("Urun adi");
    	urunAdi=veri.nextLine();
    	
    	System.out.println("adet sayisini giriniz");
    	int adet=veri.nextInt();
    	
    	System.out.println("satis ise true,degilse false giriniz");
    	boolean satisMi=veri.nextBoolean();
    	
    	yeniUrun.UrunStokGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
    			GrainsCerealslist, urunAdi, satisMi, adet);
    	
    	
    	veri.nextLine();
    	
    	System.out.println("Urun adi");
    	urunAdi=veri.nextLine();
    	
    	System.out.println("adet sayisini giriniz");
    	adet=veri.nextInt();
    	
    	yeniUrun.UrunStokGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
    			GrainsCerealslist, urunAdi, adet);
    	
    	
	  }


protected static void ListeOlustur(ArrayList<Paket1.Beverages> Beverages,ArrayList<Paket1.Condiments> Condiments,
		ArrayList<Paket1.Confections> Confections,ArrayList<Paket1.DairyProducts> DairyProducts,ArrayList<Paket1.GrainsCereals> GrainsCereals )
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
