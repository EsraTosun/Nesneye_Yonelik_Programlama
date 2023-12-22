package hafta_5_odev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class hafta_5_odev {

   // private static final String FILE_NAME = "/hafta_5_odev/UrunListesi.xlsx";

    public static void main(String[] args) {
		Scanner veri=new Scanner(System.in);

    	ArrayList<ExcelTablo> UrunListesi=new ArrayList<ExcelTablo>();
    	ArrayList<ExcelTablo> KategoriListesi=new ArrayList<ExcelTablo>();
    	
    	System.out.println("1: Liste Olustur\r\n"
				+ "2: Kategori Listesi Olustur\r\n"
				+ "3. Birim Fiyat Guncelle\r\n"
				+ "4: Stok Guncelle\r\n"
				+ "5: Urun Sil\r\n"
				+ "6: Cikis");
		int secenek=veri.nextInt();
		
	    do {
	    	switch (secenek) {
			case 1:
				if(UrunListesi.isEmpty())//liste boşsa true değerinini döndürür
				UrunListesi=ListeOlustur();
				else
				{
					UrunListesi.clear();
					//tekrar oluşturacağımızda listeyi baştan oluşturacağımız için
					//listeyi boşaltırız
					UrunListesi=ListeOlustur();
				}
				break;
				
	        case 2:
	        	if(UrunListesi.isEmpty())
	        	System.out.println("LISTE BOS");
	        	//ana listemiz oluşup oluşmadığı kontrol edilir
	        	//eğer oluşmadıysa liste boş şeklinde kullanıcıya bildirir
	        	//ve hesapla yapılamaz
	        	else
	        	{
	        		if(UrunListesi.isEmpty())
			        KategoriGoster(UrunListesi, KategoriListesi);	

	    				else
	    				{
	    					KategoriListesi.clear();
	    	        		//listeler dolu olduğu için ilk önce boşaltılır
	    	        		//sonra hesaplama yapılır
	    		        	KategoriGoster(UrunListesi, KategoriListesi);
	    		        	KategoriListeyiYazdir(KategoriListesi);
	    				}
	        	}
	        	
				break;
				
	        case 3:
	        	if(UrunListesi.isEmpty())
	        		System.out.println("LISTE BOS");
	        	else
	        	{
	        		KategoriGoster(UrunListesi, KategoriListesi);
	        		BirimFiyatDegistir(UrunListesi, KategoriListesi);
	        	}
	        	break;
	        	
	        case 4:
	        	if(UrunListesi.isEmpty())
	        		System.out.println("LISTE BOS");
	        	else {
	        		int sayac=0;
	        		veri.nextLine();
		        	System.out.println("urun adini giriniz:");
	        	    String urunAdi=veri.nextLine();
	        	   
	        	    for(int i=0;i<UrunListesi.size();i++)
	        	    {
	        	    	if(UrunListesi.get(i).Adi.compareTo(urunAdi)==0)
	        	    	{
	        	    		sayac=1;
	        	    		break;
	        	    	}
	        	    }
	        	    if(sayac==0)
	        	    {
	        	    	System.out.println("girdiginiz adda urun bulunmamaktadir ");
	        	    	break;
	        	    }
	        	    
	        	    System.out.println("urun adeti giriniz:");
	        	    int urunAdeti=veri.nextInt();
	        	    
	        	    System.out.println("urununu satin alacaksaniz ise 1\n satis yapacaksaniz 1 disinde herhangi bir sayi giriniz");
	        	    int SatisMi=veri.nextInt();
	        	    
	        	    if(SatisMi==1)
	        	    	StokGuncelle(urunAdi, urunAdeti, true,UrunListesi);
	        	    
	        	    else
	        	    	StokGuncelle(urunAdi, urunAdeti, false,UrunListesi);       } 	            	
	        	break;
	        	
	        case 5:
	        	if(UrunListesi.isEmpty())
	        		System.out.println("LISTE BOS");
	        	
	        	else
	        	{
	        		KategoriGoster(UrunListesi, KategoriListesi);
	        		System.out.println("silmek istediginiz kategori indexini yaziniz");
	        		int index=veri.nextInt();
	        		
	        		int sayac=0;
	            	for(int i=0;i<KategoriListesi.size();i++)
	            	{
	            		if(index==KategoriListesi.get(i).KategoriIndex)
	            		{
	            			sayac=1;
	            			break;
	            		}
	            	}
	            	
	            	if(sayac==0)
	            	{
	            		System.out.println("girdiginiz kategori indexi bulunmamaktadir\n ");
	            		break;
	            	}
	        		UrunSil(index,UrunListesi);
	        		ListeyiYazdir(UrunListesi);
	        	}
	        	break;
	        

			default:
				System.out.println("YANLIS SECIM. TEKRAR DENEYINIZ\n");
				break;
			}
	    	System.out.println("1: Liste Olustur\r\n"
					+ "2: Kategori Listesi Olustur\r\n"
					+ "3. Birim Fiyat Guncelle\r\n"
					+ "4: Stok Guncelle\r\n"
					+ "5: Urun Sil\r\n"
					+ "6: Cikis");
			secenek=veri.nextInt();
	    }while(secenek!=6);
    	
    	
    }
    static void UrunSil(int index,ArrayList<ExcelTablo> urunListe) 
    {
    	String EnKucukUrunAdi=KategoriIndexEnKucuk(index, urunListe);
    	System.out.println("SILINECEK URUN ADI:"+EnKucukUrunAdi);
    	for(int i=0;i<urunListe.size();i++)
    	{
    		if(EnKucukUrunAdi==urunListe.get(i).Adi)
    		{
    			urunListe.remove(i);
    			break;
    		}
    	}
    }
     
	static void StokGuncelle(String UrunAdi,int adet,Boolean SatisMi,ArrayList<ExcelTablo> urunListesi)
    {
    	for(int i=0;i<urunListesi.size();i++)
    	{
    		if(urunListesi.get(i).Adi.compareTo(UrunAdi)==0)
    		{
    			if(SatisMi)
    			{
    				int yedek;
    				yedek=urunListesi.get(i).StokMiktari-adet;
    				if(yedek<0)
    					System.out.println("istediginiz miktarda urun bulunmamaktadir");
    				
    				else
    					urunListesi.get(i).StokMiktari=yedek;
    			}
    			else
    				urunListesi.get(i).StokMiktari+=adet;
    			break;
    		}
    	}
    	ListeyiYazdir(urunListesi);
    }
    
    static void BirimFiyatDegistir(ArrayList<ExcelTablo> urunList,ArrayList<ExcelTablo> kategoriList)
    {
    	Scanner veri=new Scanner(System.in);
    	System.out.println("hangi kategori indexinde fiyat degistirmek istersiniz");
    	int kategoriIndex=veri.nextInt();
    	
    	int sayac=0;
    	for(int i=0;i<kategoriList.size();i++)
    	{
    		if(kategoriIndex==kategoriList.get(i).KategoriIndex)
    		{
    			sayac=1;
    			break;
    		}
    	}
    	
    	if(sayac==0)
    	{
    		System.out.println("girdiginiz kategori indexi bulunmamaktadir ");
    		return;
    	}
    	
    	else
    	{
    		System.out.println("yüzde kac zam ve indirim yapmak istersiniz");
    		int miktar=veri.nextInt();
    		String enKucukAdi=KategoriIndexEnKucuk(kategoriIndex, urunList);
    		String enBuyukAdi=KategoriIndexEnBuyuk(kategoriIndex, urunList);
    		
    		System.out.println("ZAM YAPILACAK URUN: "+enKucukAdi+"\n");
    		System.out.println("INDIRIM YAPILACAK URUN: "+enBuyukAdi+"\n");
    		
    		for(int i=0;i<urunList.size();i++)
    		{
    			if(urunList.get(i).Adi==enKucukAdi)
    				urunList.get(i).BirimFiyati+=(urunList.get(i).BirimFiyati*miktar/100); 	
    			
    			if(urunList.get(i).Adi==enBuyukAdi)
    				urunList.get(i).BirimFiyati-=(urunList.get(i).BirimFiyati*miktar/100);
    		}
    	}
    	ListeyiYazdir(urunList);
    }
    
    static String KategoriIndexEnKucuk(int kategoriIndex,ArrayList<ExcelTablo> urunList)
    {
    	String EnKucukAdi=null;;
        double minimum=1000;
        for(int i=0;i<urunList.size();i++)
		{
			if(kategoriIndex==urunList.get(i).KategoriIndex && urunList.get(i).BirimFiyati<minimum)
			{
				EnKucukAdi=urunList.get(i).Adi;
				minimum=urunList.get(i).BirimFiyati;
			}	
		}   
        System.out.println(EnKucukAdi);
    	return EnKucukAdi;
    }
    
    static String KategoriIndexEnBuyuk(int kategoriIndex,ArrayList<ExcelTablo> urunList)
    {
        String EnBuyukAdi=null;;
        double maximum=0;      
        for(int i=0;i<urunList.size();i++)
		{
			if(kategoriIndex==urunList.get(i).KategoriIndex && urunList.get(i).BirimFiyati>maximum)
			{
				EnBuyukAdi=urunList.get(i).Adi;
				maximum=urunList.get(i).BirimFiyati;
			}
		}
    	return EnBuyukAdi;
    }
    
    static void KategoriGoster(ArrayList<ExcelTablo> urunList,ArrayList<ExcelTablo> kategoriList )
    {
    	if(kategoriList.isEmpty()!=true) //liste doluysa boşalt
    		kategoriList.clear();
    	
    	for(int i=0;i<urunList.size();i++)
    	{
    		ExcelTablo yeniUrun=new ExcelTablo();
    		int sayac1=0,sayac2=0;
    		
    		for(int j=0;j<kategoriList.size();j++)
    		{
    			if(kategoriList.get(j).KategoriIndex==urunList.get(i).KategoriIndex)
    			{
    				sayac1=1;
                    break; 
    			}
    		} 		
    		if(sayac1==1)
    			continue;
    		
    		yeniUrun.KategoriIndex=urunList.get(i).KategoriIndex;
    		for(int j=i;j<urunList.size();j++)
    		{
    			if(urunList.get(i).KategoriIndex==urunList.get(j).KategoriIndex)
    			sayac2++;	
    		}
    		yeniUrun.StokMiktari=sayac2;
    		kategoriList.add(yeniUrun);
    		yeniUrun=null;
    	}
    	KategoriSirala(kategoriList);
    }
    
    static void KategoriSirala(ArrayList<ExcelTablo> kategoriList)
    {
    	ExcelTablo yedek;
		int maximum;
		
		for(int i=0;i<kategoriList.size()-1;i++)
		{
		   	maximum=i;
		   	   	for(int j=i+1;j<kategoriList.size();j++)
		   	{
		   		if (kategoriList.get(j).StokMiktari>kategoriList.get(maximum).StokMiktari)
		   		 maximum=j;
		    }			   
			   yedek=kategoriList.get(i);
			   kategoriList.set(i,kategoriList.get(maximum));
			   kategoriList.set(maximum,yedek);
	 } 
    }
    
    public static ArrayList<ExcelTablo> ListeOlustur() 
	{
    	ArrayList<ExcelTablo> UrunListesi=new ArrayList<ExcelTablo>();
    	try {
            FileInputStream excelFile = new FileInputStream(new File("UrunListesi.xlsx"));
            Workbook workbook = new XSSFWorkbook(excelFile);
            
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();

            Row currentRow = iterator.next();
            while (iterator.hasNext()) {

                currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                Cell currentCell = cellIterator.next();
                ExcelTablo yeniVeri=new ExcelTablo();
                
                yeniVeri.Adi=currentCell.getStringCellValue();
                currentCell = cellIterator.next();
                yeniVeri.KategoriIndex=(int)(currentCell.getNumericCellValue());
                currentCell = cellIterator.next();
                yeniVeri.BirimAgirligi=currentCell.getStringCellValue();
                currentCell = cellIterator.next();
                yeniVeri.BirimFiyati=(currentCell.getNumericCellValue());
                currentCell = cellIterator.next();
                yeniVeri.StokMiktari=((int) currentCell.getNumericCellValue());
               
                
                UrunListesi.add(yeniVeri);
                yeniVeri=null;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ListeyiYazdir(UrunListesi);
        return UrunListesi;
	}
	
	static void ListeyiYazdir(ArrayList<ExcelTablo> urun)
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
	
	static void KategoriListeyiYazdir(ArrayList<ExcelTablo> Urun)
	{
		for (ExcelTablo urun : Urun) {
			System.out.println(
			"\nkatagori Index: "+urun.KategoriIndex+
		    "\nAdet Miktari:"+urun.StokMiktari);
			
			System.out.println();
		}
	}
}