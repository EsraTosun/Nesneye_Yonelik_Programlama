 package hafta_5_calisma_sorulari;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Ogrenci> ogrenciList= ListeOlustur();
		ListeyiYazdir(ogrenciList);
		
		System.out.println();
		Double ort=OrtalamaBulma(ogrenciList);
		
		ArrayList<Ogrenci> ortUstu=new ArrayList<Ogrenci> ();
		ArrayList<Ogrenci> ortAlti=new ArrayList<Ogrenci> ();
		
		OrtalamayaGoreAyirma(ort, ogrenciList, ortUstu, ortAlti);
		
		System.out.println("ORTALAMA:"+ort);
		
		System.out.println("ORTALAMADAN YUKSEK OLANLAR");
		ListeyiYazdir(ortUstu);
		
		System.out.println("ORTALAMADAN DUSUK OLANLAR");
		ListeyiYazdir(ortAlti);
		
		ArrayList<Ogrenci> Gecenler=new ArrayList<Ogrenci> ();
		ArrayList<Ogrenci> Kalanlar=new ArrayList<Ogrenci> ();
		
		//GectiMi(ogrenciList, Gecenler, Kalanlar);
		GectiMi(ogrenciList);
		
		System.out.println("GECENLER\n");
		ListeyiYazdir(Gecenler);
		
		System.out.println("KALANLAR\n");
		ListeyiYazdir(Kalanlar);
		
		System.out.println("HARF NOTU\n");
		HarfNotuYazdir(ogrenciList);
		ListeyiYazdir(ogrenciList);

		TekCiftGoster(ogrenciList);
		
		Scanner veri=new Scanner(System.in);
		System.out.println("vize mi finale mi eklemek istiyorsunuz");
		String sinav=veri.next();
		
		System.out.println("% kac eklenmesini istiyorsunuz");
		int x=veri.nextInt();
		
		if(sinav=="vize")
			PuanEkle(ogrenciList,true,x);
		
		else
			PuanEkle(ogrenciList,false,x);  
		
		/*
		Scanner veri=new Scanner(System.in);
		System.out.println("vize(true) mi finale(false) mi eklemek istiyorsunuz");
		Boolean sinav=veri.nextBoolean();  */
		
		ListeyiYazdir(ogrenciList);  
		
		OrtGoreSiralama(ogrenciList);
		ListeyiYazdir(ogrenciList);
		
		//OrtSiraliEkleme(ogrenciList);
		//ListeyiYazdir(ogrenciList);
		
		NumaraGoreSiralama(ogrenciList);
		ListeyiYazdir(ogrenciList);
		
		//NumarayaGoreSiraliEkleme(ogrenciList);
		
		TekCiftEnBasariliYerDegistirme(ogrenciList);
		ListeyiYazdir(ogrenciList);
		

	}
	

	public static ArrayList<Ogrenci> ListeOlustur() 
	{
		
		ArrayList<Ogrenci> ogrenciList=new ArrayList<Ogrenci>();
		
		try (BufferedReader okuyucu=new BufferedReader(new FileReader("Ogrenci.txt"))) {
			
			String satir=okuyucu .readLine();
			
			while(satir!=null)
			{
				
				Ogrenci yeniOgrenci=new Ogrenci();
				
				
				//System.out.println(satir);
				String[] dizi= satir.split(" ");
				
				yeniOgrenci.Numara=Integer.valueOf(dizi[0]);
				yeniOgrenci.Adi=dizi[1];
				yeniOgrenci.Vize=Integer.valueOf(dizi[2]);
				yeniOgrenci.Final=Integer.valueOf(dizi[3]);
				//yeniOgrenci.AktifMi=dizi[4].equals("E")? true:false;
				//dizi[4].compareTo("E")==0?
				
				
				ogrenciList.add(yeniOgrenci);
				yeniOgrenci=null;
				
				//boşluğa kadar olan verileri sıra ile dizye aktatır
				//System.out.println("adi: "+dizi[0]+" soyadi:"+dizi[1]);
				
				satir=okuyucu.readLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ogrenciList;
	}
	
	static Double OrtalamaBulma(ArrayList<Ogrenci> ogrenciList)
	{
		Double ort=0.0;
		System.out.println("ORTALAMA BULMA");
		System.out.println();
		
		for(int i=0;i<ogrenciList.size();i++)
		{
			double ortalama=((ogrenciList.get(i).Vize)*4+(ogrenciList.get(i).Final)*6)/10;
			ort+=ortalama;
			ogrenciList.get(i).Ort=ortalama;
		}
		ort/=ogrenciList.size();
		
		
		System.out.println();
		ListeyiYazdir(ogrenciList);
		
		
		
		return ort;
	}
	
	static void OrtalamayaGoreAyirma(Double ort,ArrayList<Ogrenci> OgrenciList,ArrayList<Ogrenci> ortUstu,
			ArrayList<Ogrenci> ortAlti)
	{
		
		
		for(int i=0;i<OgrenciList.size();i++)
		{
			Ogrenci ortalama=new Ogrenci();
			
			if(OgrenciList.get(i).Ort>ort)
			{
				
			    ortalama.Adi=OgrenciList.get(i).Adi;
				ortalama.Numara=OgrenciList.get(i).Numara;
				ortalama.Vize=OgrenciList.get(i).Vize;
				ortalama.Final=OgrenciList.get(i).Final;
				ortalama.Ort=OgrenciList.get(i).Ort;
			
				ortUstu.add(ortalama);
			}
			
			else
			{
				ortalama.Adi=OgrenciList.get(i).Adi;
				ortalama.Numara=OgrenciList.get(i).Numara;
				ortalama.Vize=OgrenciList.get(i).Vize;
				ortalama.Final=OgrenciList.get(i).Final;
				ortalama.Ort=OgrenciList.get(i).Ort;
				
				ortAlti.add(ortalama);
			}
			ortalama=null;
		}
		
	}
	static void GectiMi(ArrayList<Ogrenci> OgrenciList)
	{
		for(int i=0;i<OgrenciList.size();i++)
		{
			if(OgrenciList.get(i).Ort>=50)
			{
				OgrenciList.get(i).Gectimi=true;
			//	KisiYazdir(OgrenciList.get(i));
			}
		}
		
		for(int i=0;i<OgrenciList.size();i++)
		{
			if(OgrenciList.get(i).Ort<50)
			{
				OgrenciList.get(i).Gectimi=false;
			//	KisiYazdir(OgrenciList.get(i));
			}
		}
	}
	
	/*
	static void GectiMi(ArrayList<Ogrenci> OgrenciList,ArrayList<Ogrenci> Gecenler,ArrayList<Ogrenci> Kalanlar)
	{
		for(int i=0;i<OgrenciList.size();i++)
		{
			Ogrenci gectiMi=new Ogrenci();
			
			if(OgrenciList.get(i).Ort>=50)
			{
				
			    gectiMi.Adi=OgrenciList.get(i).Adi;
				gectiMi.Numara=OgrenciList.get(i).Numara;
				gectiMi.Vize=OgrenciList.get(i).Vize;
				gectiMi.Final=OgrenciList.get(i).Final;
				gectiMi.Ort=OgrenciList.get(i).Ort;
				gectiMi.Gectimi=true;
			
				Gecenler.add(gectiMi);
			}
			
			else
			{
				gectiMi.Adi=OgrenciList.get(i).Adi;
				gectiMi.Numara=OgrenciList.get(i).Numara;
				gectiMi.Vize=OgrenciList.get(i).Vize;
				gectiMi.Final=OgrenciList.get(i).Final;
				gectiMi.Ort=OgrenciList.get(i).Ort;
				gectiMi.Gectimi=false;
				
				Kalanlar.add(gectiMi);
			}
			gectiMi=null;
		}
	}  */
	
	static void HarfNotuYazdir(ArrayList<Ogrenci> ogrenciList)
	{
		for(int i=0;i<ogrenciList.size();i++)
		{
			
			if(0<=ogrenciList.get(i).Ort && ogrenciList.get(i).Ort<40)
			{
				ogrenciList.get(i).HarfNotu="FF";
			}
			
			else if(40<=ogrenciList.get(i).Ort && ogrenciList.get(i).Ort<50)
			{
				ogrenciList.get(i).HarfNotu="DD";
			}
			
			else if(50<=ogrenciList.get(i).Ort && ogrenciList.get(i).Ort<70)
			{
				ogrenciList.get(i).HarfNotu="CC";
			}
			
			else if(70<=ogrenciList.get(i).Ort && ogrenciList.get(i).Ort<80)
			{
				ogrenciList.get(i).HarfNotu="BB";
			}
			
			else if(80<=ogrenciList.get(i).Ort && ogrenciList.get(i).Ort<100)
			{
				ogrenciList.get(i).HarfNotu="AA";
			}
			
	
		}
	}
	
	static void TekCiftGoster(ArrayList<Ogrenci> ogrenciList)
	{
		System.out.println("TEK NUMARALILAR\n");
		for(int i=0;i<ogrenciList.size();i++)
		{
			if(ogrenciList.get(i).Numara%2==1)
				KisiYazdir(ogrenciList.get(i));
		}
		
		System.out.println("CIFT NUMARALILAR\n");
		for(int i=0;i<ogrenciList.size();i++)
		{
			if(ogrenciList.get(i).Numara%2==0)
				KisiYazdir(ogrenciList.get(i));
		}
	}
	
	private static void PuanEkle(ArrayList<Ogrenci> ogrenciList,boolean VizeMi, int x) 
	{
		int k=0;
		for(int i=0;i<ogrenciList.size();i++)
		{
			if(ogrenciList.get(k).Ort>ogrenciList.get(i).Ort)
				k=i;
		}
		
		if(VizeMi)
		{
			System.out.println(ogrenciList.get(k).Adi+" kisinin vize notuna ekleme yapilacak");
			ogrenciList.get(k).Vize+=ogrenciList.get(k).Vize*x/100;
			ogrenciList.get(k).Ort=((ogrenciList.get(k).Vize)*4+(ogrenciList.get(k).Final)*6)/10;
		}
		
		else
		{
			System.out.println(ogrenciList.get(k).Adi+" kisinin vize notuna ekleme yapilacak");
			ogrenciList.get(k).Final+=ogrenciList.get(k).Final*x/100;
			ogrenciList.get(k).Ort=((ogrenciList.get(k).Vize)*4+(ogrenciList.get(k).Final)*6)/10;
		}
		
	}
	
	static void OrtGoreSiralama(ArrayList<Ogrenci> ogrenciList)
	{
		System.out.println("ORTALAMAYA GORE SIRALAMA");
		Ogrenci yedek1;
		int maximum;
		
		for(int i=0;i<ogrenciList.size()-1;i++)
		{
		   	maximum=i;
		   	
		   	for(int j=i+1;j<ogrenciList.size();j++)
		   	{
		   		if (ogrenciList.get(j).Ort>ogrenciList.get(maximum).Ort)
		   		 maximum=j;
		    }
			   
			   yedek1=ogrenciList.get(i);
			   ogrenciList.set(i,ogrenciList.get(maximum));
			   ogrenciList.set(maximum,yedek1);
		   
		}
		//ListeyiYazdir(ogrenciList);
		
		
	}
	
	static void OrtSiraliEkleme(ArrayList<Ogrenci> ogrenciList)
	{
		Ogrenci yeni=new Ogrenci();
		Scanner veri=new Scanner(System.in);
		
		System.out.println("ogrenci adini giriniz");
		String adi=veri.next();
		yeni.Adi=adi;
		
		System.out.println("numarasini giriniz");
		int numara=veri.nextInt();
		yeni.Numara=numara;
		
		System.out.println("vize notunu giriniz");
		int vize=veri.nextInt();
		yeni.Vize=vize;
		
		System.out.println("final notunu giriniz");
		int Final=veri.nextInt();
		yeni.Final=Final;
		
		int ort=((vize)*4+(Final)*6)/10;
		yeni.Ort=ort;
		
		System.out.println(yeni);
		
		int sayac=0;
		
		for(int i=0;i<ogrenciList.size();i++)
		{
			if(ogrenciList.get(i).Ort<ort)
			{
				ogrenciList.add(i,yeni);
				sayac=1;
				break;
			}		
		}
		if(sayac==0)
			ogrenciList.add(yeni);
		
		HarfNotuYazdir(ogrenciList);
		GectiMi(ogrenciList);
		ListeyiYazdir(ogrenciList);
		
	}
	
	static void NumaraGoreSiralama(ArrayList<Ogrenci> ogrenciList)
	{
		System.out.println("NUMARAYA GORE SIRALAMA\n");
		Ogrenci yedek1;
		int maximum;
		
		for(int i=0;i<ogrenciList.size()-1;i++)
		{
		   	maximum=i;
		   	
		   	for(int j=i+1;j<ogrenciList.size();j++)
		   	{
		   		if (ogrenciList.get(j).Numara>ogrenciList.get(maximum).Numara)
		   		 maximum=j;
		    }
			   
			   yedek1=ogrenciList.get(i);
			   ogrenciList.set(i,ogrenciList.get(maximum));
			   ogrenciList.set(maximum,yedek1);
		}
	}
	
	static void NumarayaGoreSiraliEkleme(ArrayList<Ogrenci> ogrenciList)
	{
		Ogrenci yeni=new Ogrenci();
		Scanner veri=new Scanner(System.in);
		
		System.out.println("ogrenci adini giriniz");
		String adi=veri.next();
		yeni.Adi=adi;
		
		System.out.println("numarasini giriniz");
		int numara=veri.nextInt();
		yeni.Numara=numara;
		
		System.out.println("vize notunu giriniz");
		int vize=veri.nextInt();
		yeni.Vize=vize;
		
		System.out.println("final notunu giriniz");
		int Final=veri.nextInt();
		yeni.Final=Final;
		
		int ort=((vize)*4+(Final)*6)/10;
		yeni.Ort=ort;
		
		System.out.println(yeni);
		
		int sayac=0;
		
		for(int i=0;i<ogrenciList.size();i++)
		{
			if(ogrenciList.get(i).Numara<numara)
			{
				ogrenciList.add(i,yeni);
				sayac=1;
				break;
			}		
		}
		if(sayac==0)
			ogrenciList.add(yeni);
		
		HarfNotuYazdir(ogrenciList);
		GectiMi(ogrenciList);
		ListeyiYazdir(ogrenciList);
	}
	
	static void TekCiftEnBasariliYerDegistirme(ArrayList<Ogrenci> ogrenciList)
	{
		int maximumCift=0,maximumTek=0;
		Object yedek;
		
		System.out.println("CIFT NUMARALILAR EN BASARILI\n");
		for(int i=0;i<ogrenciList.size();i++)
		{
			if(ogrenciList.get(i).Numara%2==0)
			{
				if(ogrenciList.get(maximumCift).Ort<ogrenciList.get(i).Ort)
				{
					maximumCift=i;
				}
			}
		}
		KisiYazdir(ogrenciList.get(maximumCift));
		
		System.out.println("TEK NUMARALILAR EN BASARILI\n");
		for(int i=0;i<ogrenciList.size();i++)
		{
			if(ogrenciList.get(i).Numara%2==1)
			{
				if(ogrenciList.get(maximumTek).Ort<ogrenciList.get(i).Ort)
				{
					maximumTek=i;
				}
			}
		}
		KisiYazdir(ogrenciList.get(maximumTek));
		
		   yedek=ogrenciList.get(maximumTek);
		   ogrenciList.set(maximumTek,ogrenciList.get(maximumCift));
		   ogrenciList.set(maximumCift,(Ogrenci) yedek);
		
	}
	

	
	static void KisiYazdir(Ogrenci ogrenci)
	{
		
			System.out.println("Numarasi:"+ogrenci.Numara+
			"\nOgrenci Adi: "+ogrenci.Adi+
			"\nVize: "+ogrenci.Vize+
			"\nFinal: "+ogrenci.Final+
			"\nOrtalama:"+ogrenci.Ort+
			"\nGecti mi:"+ogrenci.Gectimi+
			"\nHarf notu:"+ogrenci.HarfNotu);
			
			System.out.println();
	}

	
	static void ListeyiYazdir(ArrayList<Ogrenci> ogrenciList)
	{
		for (Ogrenci ogrenci : ogrenciList) {
			System.out.println("Numarasi:"+ogrenci.Numara+
			"\nOgrenci Adi: "+ogrenci.Adi+
			"\nVize: "+ogrenci.Vize+
			"\nFinal: "+ogrenci.Final+
			"\nOrtalama:"+ogrenci.Ort+
			"\nGecti mi:"+ogrenci.Gectimi+
			"\nHarf notu:"+ogrenci.HarfNotu);
			
			System.out.println();
		}
	}
}

