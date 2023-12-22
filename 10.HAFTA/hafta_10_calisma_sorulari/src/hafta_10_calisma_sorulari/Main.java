package hafta_10_calisma_sorulari;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import hafta_10_calisma_sorulari.Urun.Beverages;
import hafta_10_calisma_sorulari.Urun.Condiments;
import hafta_10_calisma_sorulari.Urun.Confections;
import hafta_10_calisma_sorulari.Urun.DairyProducts;
import hafta_10_calisma_sorulari.Urun.GrainsCereals;


public class Main implements Serializable {

public static void main(String[] args) throws IOException , ClassNotFoundException {
		
        Scanner veri=new Scanner(System.in);
        
        ArrayList<Urun.Beverages> Beverageslist=new ArrayList<Urun.Beverages>();
		ArrayList<Urun.Condiments> Condimentslist=new ArrayList<Urun.Condiments>();
		ArrayList<Urun.Confections> Confectionslist=new ArrayList<Urun.Confections>();
		ArrayList<Urun.DairyProducts> DairyProductslist=new ArrayList<Urun.DairyProducts>();
		ArrayList<Urun.GrainsCereals> GrainsCerealslist=new ArrayList<Urun.GrainsCereals>();
		
		ListeOlustur(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist);
		
		Urun.Beverages.ListeyiYazdir(Beverageslist);
		Urun.Condiments.ListeyiYazdir(Condimentslist);
		Urun.Confections.ListeyiYazdir(Confectionslist);
		Urun.DairyProducts.ListeyiYazdir(DairyProductslist);
		Urun.GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		
		//Urun.Beverages.DosyaYazma(Beverageslist);
		//Urun.Beverages.CokluDosyaOku();
		DosyaYazma(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist);
		DosyaOku();
		
		


		
		
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
		
		Urun.Beverages.IcecekUrunuEkle(Beverageslist, yeniAdi, yeniBirimAgirligi,yeniBirimFiyati,yeniStokFiyati);
		Urun.Beverages.ListeyiYazdir(Beverageslist);
		
		DosyaYazma(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, GrainsCerealslist);
		DosyaOku();
		
		veri.nextLine();
		System.out.println("fiyati degistirilecek urunun adi giriniz");
		yeniAdi=veri.nextLine();
		
		System.out.println("Birim fiyatini giriniz");
	    yeniBirimFiyati=veri.nextInt();
		
				for(int k=0;k<Condimentslist.size();k++)
				{
					if(Condimentslist.get(k).Adi.compareTo(yeniAdi)==0)
					{
						Urun.Condiments.CesniBirimFiyatGuncelle(Condimentslist.get(k), yeniBirimFiyati);
						break;
					}
				}
		
		Urun.Condiments.ListeyiYazdir(Condimentslist);   
		
	    Urun.DairyProducts.ListeyiYazdir(DairyProductslist);
	    Urun.DairyProducts.SutUrunuSil(DairyProductslist);
	    Urun.DairyProducts.ListeyiYazdir(DairyProductslist);
		
		System.out.println("tahila eklemek istediginiz miktari giriniz");
		int miktar=veri.nextInt();
		
		Urun.GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		Urun.GrainsCereals.TahılMinStokEkle(GrainsCerealslist, miktar);
		Urun.GrainsCereals.ListeyiYazdir(GrainsCerealslist);
		
		Urun.Confections.ListeyiYazdir(Confectionslist);
		Urun.Confections.SekerlemeDetaySil(Confectionslist);
		Urun.Confections.ListeyiYazdir(Confectionslist);
	
	
   }

public static void DosyaYazma(ArrayList<Urun.Beverages> Beverages,ArrayList<Urun.Condiments> Condiments,
ArrayList<Urun.Confections> Confections,ArrayList<Urun.DairyProducts> DairyProducts,
ArrayList<Urun.GrainsCereals> GrainsCereals ) throws IOException
{
	FileOutputStream fos=new FileOutputStream("file.txt");
	ObjectOutputStream out=new ObjectOutputStream(fos);
	
	out.writeObject(Beverages);
	out.writeObject(Condiments);
	out.writeObject(Confections);
	out.writeObject(DairyProducts);
	out.writeObject(GrainsCereals);
	
	out.close();
	fos.close();
}  

static void DosyaOku() throws IOException, ClassNotFoundException {
	FileInputStream fis = new FileInputStream("file.txt");
	ObjectInputStream in = new ObjectInputStream(fis);

	ArrayList<Beverages> BeveragesList=(ArrayList<Beverages>) in.readObject();
	for (Beverages urun : BeveragesList) {
		System.out.println("\t "+urun.Adi+
				"     \t \t "+urun.KategoriIndex+
				"\t \t      "+urun.BirimAgirligi+
				"\t \t "+urun.BirimFiyati+
				"\t \t "+urun.StokMiktari+
				"\t \t "+urun.kategoriAdi+
				"\t \t "+urun.detay);
			}
	
	ArrayList<Condiments> CondimentsList=(ArrayList<Condiments>) in.readObject();
	for (Condiments urun : CondimentsList) {
		System.out.println("\t "+urun.Adi+
				"     \t \t "+urun.KategoriIndex+
				"\t \t      "+urun.BirimAgirligi+
				"\t \t "+urun.BirimFiyati+
				"\t \t "+urun.StokMiktari+
				"\t \t "+urun.kategoriAdi+
				"\t \t "+urun.detay);
			}
	
	ArrayList<Confections> ConfectionsoList=(ArrayList<Confections>) in.readObject();
	for (Confections urun : ConfectionsoList) {
		System.out.println("\t "+urun.Adi+
				"     \t \t "+urun.KategoriIndex+
				"\t \t      "+urun.BirimAgirligi+
				"\t \t "+urun.BirimFiyati+
				"\t \t "+urun.StokMiktari+
				"\t \t "+urun.kategoriAdi+
				"\t \t "+urun.detay);
			}
	
	ArrayList<DairyProducts> DairyProductsList=(ArrayList<DairyProducts>) in.readObject();
	for (DairyProducts urun : DairyProductsList) {
		System.out.println("\t "+urun.Adi+
				"     \t \t "+urun.KategoriIndex+
				"\t \t      "+urun.BirimAgirligi+
				"\t \t "+urun.BirimFiyati+
				"\t \t "+urun.StokMiktari+
				"\t \t "+urun.kategoriAdi+
				"\t \t "+urun.detay);
			}
	
	ArrayList<GrainsCereals> GrainsCerealsList=(ArrayList<GrainsCereals>) in.readObject();
	for (GrainsCereals urun : GrainsCerealsList) {
		System.out.println("\t "+urun.Adi+
				"     \t \t "+urun.KategoriIndex+
				"\t \t      "+urun.BirimAgirligi+
				"\t \t "+urun.BirimFiyati+
				"\t \t "+urun.StokMiktari+
				"\t \t "+urun.kategoriAdi+
				"\t \t "+urun.detay);
			}    
	
		
			
	
}
	




public static void ListeOlustur(ArrayList<Urun.Beverages> Beverages,ArrayList<Urun.Condiments> Condiments,
		ArrayList<Urun.Confections> Confections,ArrayList<Urun.DairyProducts> DairyProducts,ArrayList<Urun.GrainsCereals> GrainsCereals )
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
						Urun.Beverages yeniBeveragesUrun=new Urun.Beverages(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
								Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
	                   
						Beverages.add(yeniBeveragesUrun);
						yeniBeveragesUrun=null;
					}
					
					else if(Integer.valueOf(dizi2[0])==2)
					{
						Urun.Condiments yeniCondimentsUrun=new Urun.Condiments(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
								Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
					
						Condiments.add(yeniCondimentsUrun);
						yeniCondimentsUrun=null;
					}
					else if(Integer.valueOf(dizi2[0])==3)
					{
						Urun.Confections yeniConfectionsUrun=new Urun.Confections(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
								Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
					
						Confections.add(yeniConfectionsUrun);
						yeniConfectionsUrun=null;
					}
					
					else if(Integer.valueOf(dizi2[0])==4)
					{
						Urun.DairyProducts yeniDairyProductsUrun=new Urun.DairyProducts(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
								Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2]);
						
						DairyProducts.add(yeniDairyProductsUrun);
						yeniDairyProductsUrun=null;
					}
					
					else if(Integer.valueOf(dizi2[0])==5)
					{
						Urun.GrainsCereals yeniGrainsCerealsUrun=new Urun.GrainsCereals(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
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
