package ders2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Musteri> musteriList=ListeOlustur();
		ArrayList<AktifMusteri> aktifMusteriList=new ArrayList<AktifMusteri>();
		ArrayList<PasifMusteri> pasifMusteriList=new ArrayList<PasifMusteri>();
		
		for (Musteri musteri : musteriList) {
			System.out.println(musteri.Adi+"\t");
			
			if(musteri.AktifMi)
			{
				AktifMusteri yeniAktifMusteri=new AktifMusteri();
				
				yeniAktifMusteri.Adi=musteri.Adi;
				yeniAktifMusteri.Soyadi=musteri.Soyadi;
				yeniAktifMusteri.AktifMi=musteri.AktifMi;
				yeniAktifMusteri.FaturaTutari=musteri.FaturaTutari;
				yeniAktifMusteri.puan=musteri.puan;
				yeniAktifMusteri.sehir=musteri.sehir;
				
				//yeniAktifMusteri.
				
				aktifMusteriList.add(yeniAktifMusteri);
				yeniAktifMusteri=null;
			}
			
			else
			{
                AktifMusteri yeniPasifMusteri=new AktifMusteri();
				
				yeniPasifMusteri.Adi=musteri.Adi;
				yeniPasifMusteri.Soyadi=musteri.Soyadi;
				yeniPasifMusteri.AktifMi=musteri.AktifMi;
				yeniPasifMusteri.FaturaTutari=musteri.FaturaTutari;
				yeniPasifMusteri.puan=musteri.puan;
				yeniPasifMusteri.sehir=musteri.sehir;
				
				aktifMusteriList.add(yeniPasifMusteri);
				yeniPasifMusteri=null;
			}
		}
		
		AktifMusteri.ListeGoster(aktifMusteriList);
		PasifMusteri.ListeGoster(pasifMusteriList);
		
		
	    //aktifMusteriList.get(0).PasifYap(aktifMusteriList.get(0));
		aktifMusteriList.get(0).PasifYap();
		
		pasifMusteriList.get(0).AktifYap();
		System.out.println(pasifMusteriList.get(0).Adi);
		
		pasifMusteriList.get(0).HepsiniAktifYap(pasifMusteriList);
		PasifMusteri.ListeGoster(pasifMusteriList);
		
		//new PasifMusteri().HepsiniAktifYap(pasifMusteriList);
		
		
		
		AktifMusteri m=aktifMusteriList.get(1);
		System.out.println(m.Adi+" "+m.puan);
		m.PuanGuncelle(20);
		System.out.println(m.Adi+" "+m.puan);

		
		
		
		
	}
	
	public static ArrayList<Musteri> ListeOlustur() 
	{
		
		ArrayList<Musteri> musteriList=new ArrayList<Musteri>();
		
		try (BufferedReader okuyucu=new BufferedReader(new FileReader("Ogrenci.txt"))) {
			
			String satir=okuyucu .readLine();
			
			while(satir!=null)
			{
				Musteri yeniMusteri=new Musteri();
				String[] dizi= satir.split(" ");
				yeniMusteri.Adi=dizi[0];
				yeniMusteri.Soyadi=dizi[1];
				yeniMusteri.AktifMi=Boolean.valueOf(dizi[2]);
				yeniMusteri.FaturaTutari=Double.valueOf(dizi[3]);
			//	yeniMusteri.puan=Integer.valueOf(dizi[4]);
				
				String aktifMi=yeniMusteri.AktifMi==true?"Evet":"hayır";
				
				musteriList.add(yeniMusteri);
				yeniMusteri=null;
				
				//boşluğa kadar olan verileri sıra ile dizye aktatır
				//System.out.println("adi: "+dizi[0]+" soyadi:"+dizi[1]);
				
				satir=okuyucu.readLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return musteriList;
	}

}
