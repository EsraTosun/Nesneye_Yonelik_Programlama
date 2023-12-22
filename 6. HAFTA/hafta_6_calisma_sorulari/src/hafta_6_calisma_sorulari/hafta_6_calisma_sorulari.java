package hafta_6_calisma_sorulari;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class hafta_6_calisma_sorulari {

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
					if(Condimentslist.get(k).Adi.compareTo(yeniAdi)==0)
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
		GrainsCereals.TahılMinStokEkle(GrainsCerealslist, miktar);
		GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		
		Confections.ListeyiYazdir(Confectionslist);
		Confections.SekerlemeDetaySil(Confectionslist);
		Confections.ListeyiYazdir(Confectionslist);
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
	
	static void KisiYazdir(Urun urun)
	{
		
		System.out.println("\t "+urun.Adi+
				"     \t \t "+urun.KategoriIndex+
				"\t \t      "+urun.BirimAgirligi+
				"\t \t "+urun.BirimFiyati+
				"\t \t "+urun.StokMiktari);
				
			System.out.println();
	}
	
	static void ListeyiYazdir(ArrayList<Urun> urun)
	{
		for(int i=0;i<urun.size();i++)
		{
			System.out.println("\t "+urun.get(i).Adi+
					"     \t \t "+urun.get(i).KategoriIndex+
					"\t \t      "+urun.get(i).BirimAgirligi+
					"\t \t "+urun.get(i).BirimFiyati+
					"\t \t "+urun.get(i).StokMiktari);
				}
			System.out.println("listede eleman sayisi:"+urun.size());
			System.out.println();
	}

}
