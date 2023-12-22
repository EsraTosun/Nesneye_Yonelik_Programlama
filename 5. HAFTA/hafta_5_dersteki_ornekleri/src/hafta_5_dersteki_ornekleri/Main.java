package hafta_5_dersteki_ornekleri;

//debug kullan ve öğren

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {

	
		
		ArrayList<Musteri> musteriList= ListeOlustur();
	
		
		AktifKonyalilariGoster(musteriList,"Ankara");
		Yazdir(EnYuksekFaturali(musteriList));
		
		ArrayList<Musteri> musteriList2=OrtalamadanBuyukleriGoster(musteriList);
		CokluYazdir(musteriList2);
		
		musteriList2.get(0).Adi="Fatma Fatma";
		
		CokluYazdir(musteriList);
		
		PuanGuncelle(musteriList);
		CokluYazdir(musteriList);
		
		MusteriaktifYap(musteriList,"Sami" ,"Güneş");
		
		Collections.sort (musteriList,new Comparator()
				{
			public int compare(Object object1,Object object2)
			{
				return ((Musteri) object1).Adi.compareTo(((Musteri) object2).Adi);
			}
				});
				
		
				Collections.sort (musteriList,new Comparator()
				{
			public int compare(Object object1,Object object2)
			{
				return ((Musteri) object2).Adi.compareTo(((Musteri) object1).Adi);
			}
				});
			
				System.out.println("sirali");
				CokluYazdir(musteriList);
				
				Musteri yeniMusteri=new Musteri();
				yeniMusteri.Adi="Engin";
				yeniMusteri.Soyadi="korkmaz";
				
				int index=0;
				
				for (Musteri musteri : musteriList2) {
					
					//System.out.println(musteri.Adi.compareTo(yeniMusteri.Adi));
					
					if(musteri.Adi.compareTo(yeniMusteri.Adi)>0)
					{
						musteriList.add(index,yeniMusteri);
						break;
					}
					index++;
				}
				
				System.out.println("eklenmis hali");
				
				CokluYazdir(musteriList);
		


	}
	
	
	
	private static ArrayList<Musteri> ListeOlustur1() {
		Musteri yeniMusteri=new Musteri();
		yeniMusteri.Adi="Ahmet";
		yeniMusteri.Soyadi="Yılmaz";
		yeniMusteri.AktifMi=true;
		yeniMusteri.FaturaTutari=1253.24;
		yeniMusteri.puan=60;
		
		String aktifMi=yeniMusteri.AktifMi==true?"Evet":"hayır";
		
		System.out.println("adi:"+yeniMusteri.Adi+"\n Soyadi:"+yeniMusteri.Soyadi
				+"Aktiflik Durumu"+aktifMi+
				"Tutari:"+yeniMusteri.FaturaTutari+"puan:" +yeniMusteri.puan); 
		
		return null;
	}



	static void MusteriaktifYap(ArrayList<Musteri> musteriList,String Adi,String Soyadi)
	{
		for (Musteri musteri : musteriList) 
		{
			if(musteri.Adi.equals(Adi) && musteri.Soyadi.equals(Soyadi))
			{
				musteri.AktifMi=true;
				return;
			}
				
				
		}
	}
	
	static void PuanGuncelle(ArrayList<Musteri> musteriList)
	{
		for(Musteri musteri:musteriList)
		{
			if(musteri.puan<50)
			{
				musteri.puan=musteri.puan*125/100;
			}
		}
	}
	
	static ArrayList<Musteri> OrtalamadanBuyukleriGoster(ArrayList<Musteri> musteriList)
	{
		System.out.println("ORTALAMADAN BUYUKLER" );
		
		double ort=0;
		
		for(Musteri musteri: musteriList)
		{
			ort+=musteri.FaturaTutari;		
		}
		ort=ort/musteriList.size();
		
		System.out.println(ort);
		
		ArrayList<Musteri> musteriList2=new ArrayList<Musteri>();
		
		for (int i = 0; i < musteriList.size(); i++) {
			if(musteriList.get(i).FaturaTutari>ort)
			{
				musteriList2.add(musteriList.get(i));
			}
			
		}
		
		return musteriList2;
	}
	
	
	static void AktifKonyalilariGoster(ArrayList<Musteri> musteriList,String sehir)
	{
		System.out.println("aktif konyalilar");
		
		for(Musteri musteri: musteriList)
		{
			if(musteri.AktifMi==true && musteri.sehir.equals(sehir))
				Yazdir(musteri);
		}
	}
	
	static Musteri EnYuksekFaturali(ArrayList<Musteri> musteriList)
	{
		System.out.println("rn yuksej faturali kisi");
		
		double maxDeger=Double.MIN_VALUE;
		
		for(Musteri musteri: musteriList)
		{
			if(musteri.FaturaTutari>maxDeger)
			{
				maxDeger=musteri.FaturaTutari;
				System.out.println(maxDeger);
			}
				
		}
		
		for(Musteri musteri: musteriList)
		{
			if(musteri.FaturaTutari==maxDeger)
				return musteri;
				
		}
		return null;
	}
	
	static void  AktifleriGoster(ArrayList<Musteri> musteriList)
	{
          System.out.println("AKTIF MUSTERI LISTEMIZ");
		
		for (Musteri musteri : musteriList) {
			
			if(musteri.AktifMi==true)
			{
				Yazdir(musteri);
			}
		}
	}
	
	public static ArrayList<Musteri> ListeOlustur() 
	{
		//FileReader fileReader=new FileReader("Musteri.txt");
		//dosya oluşturmak için ilk önce üstteki komutu ekle;
		//projenin olduğu projeye git ve sağa tıkla
		//properties diyerek dosyayı ekle
		//dosya eklemesini öğren
		//o yüzden hara veriyor
		
		//BufferedReader bufferedReader=new BufferedReader(fileReader);
		
		ArrayList<Musteri> musteriList=new ArrayList<Musteri>();
		
		try(BufferedReader bufferedReader=new BufferedReader(new FileReader("Musteri.txt")))
		{
			String satir=bufferedReader .readLine();
			
			
			
			while(satir!=null)
			{
				
				Musteri yeniMusteri=new Musteri();
				
				
				//System.out.println(satir);
				String[] dizi= satir.split(" ");
				
				yeniMusteri.Adi=dizi[0];
				yeniMusteri.Soyadi=dizi[1];
				yeniMusteri.puan=Integer.valueOf(dizi[2]);
				yeniMusteri.FaturaTutari=Double.valueOf(dizi[3]);
				yeniMusteri.AktifMi=dizi[4].equals("E")? true:false;
				//dizi[4].compareTo("E")==0?
				yeniMusteri.sehir=dizi[5];
				
				musteriList.add(yeniMusteri);
				yeniMusteri=null;
				
				//boşluğa kadar olan verileri sıra ile dizye aktatır
				//System.out.println("adi: "+dizi[0]+" soyadi:"+dizi[1]);
				
				satir=bufferedReader.readLine();
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		for (int i = 0; i <musteriList.size(); i++) 
		{
			Musteri mevcutMusteri=musteriList.get(i);
			System.out.println("\t"+mevcutMusteri.Adi+mevcutMusteri.Soyadi+"\t"
			+mevcutMusteri.FaturaTutari
			+"\t"+mevcutMusteri.AktifMi+"\t"
			+mevcutMusteri.puan);
		}
		
		return musteriList;
	}
	
	public static void CokluYazdir(ArrayList<Musteri> musteriList)
	{
		for(Musteri mevcutMusteri: musteriList)
		{
			System.out.println("\t"+mevcutMusteri.Adi+mevcutMusteri.Soyadi+"\t"
					+mevcutMusteri.FaturaTutari
					+"\t"+mevcutMusteri.AktifMi+"\t"
					+mevcutMusteri.puan);
			
		}
		
		
	}
	
	public static void Yazdir(Musteri mevcutMusteri)
	{
		System.out.println("\t"+mevcutMusteri.Adi+mevcutMusteri.Soyadi+"\t"
				+mevcutMusteri.FaturaTutari
				+"\t"+mevcutMusteri.AktifMi+"\t"
				+mevcutMusteri.puan);
		
	}

}

