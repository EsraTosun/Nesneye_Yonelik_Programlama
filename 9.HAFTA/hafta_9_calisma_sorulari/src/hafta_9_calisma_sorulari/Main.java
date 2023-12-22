package hafta_9_calisma_sorulari;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import hafta_9_calisma_sorulari.Beverages;
import hafta_9_calisma_sorulari.Condiments;
import hafta_9_calisma_sorulari.Confections;
import hafta_9_calisma_sorulari.DairyProducts;
import hafta_9_calisma_sorulari.GrainsCereals;
import hafta_9_calisma_sorulari.Urun;



public class Main {

	public static void main(String[] args) {
		
        Scanner veri=new Scanner(System.in);
        Beverages beverages=new Beverages();
        Condiments condiments=new Condiments();
        Confections confections=new Confections();
        DairyProducts dairyProducts=new DairyProducts();
        GrainsCereals grainsCereals=new GrainsCereals();
		
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
		
		int kategori=0,kontrol=0;
		while(kategori!=6)
		{
		System.out.println("1-Beverages  \r\n"
				+ "2-Condiments \r\n"
				+ "3-Confections  \r\n"
				+ "4-DairyProducts \r\n"
				+ "5-Cereals \r\n"
				+ "6-Cikis");
		kategori=veri.nextInt();
		
		if(kategori>6 || kategori<1)
			System.out.println("hatali secim!!!");
		
		else if(kategori==6)
			return;
		
		else 
			break;
		}
		
		veri.nextLine();
    	System.out.println("islem yapilacak urunu giriniz");
    	String islemYapilacakUrun=veri.nextLine();
		
    	System.out.println("1. UrunStokGuncelle\r\n"
				+ "2. UrunFiyatGuncelle\r\n"
				+ "3. UrunBirimAgirlikGuncelle\r\n"
				+ "4. YeniUrunEkle \r\n"
				+ "5. EnKisaIsimliUrunIsimGuncelle\r\n"
				+ "6. StokEnCokOlanUrunSil\r\n"
				+ "7. EnPahaliUrunFiyatGuncelle\r\n"
				+ "8. DetayGuncelle");
		      int secenek=veri.nextInt();
		do
		{
			switch (secenek) 
			{
		    case 1:	
		    	kontrol=0;
		    	veri.nextLine();
				System.out.println("urun girisi ise true degilse false giriniz");
				boolean girisMi=veri.nextBoolean();
				System.out.println("urun adedi giriniz");
				int adet=veri.nextInt();
				
				if(kategori==1)
				{
					beverages.UrunStokGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, adet, girisMi,islemYapilacakUrun);
				}
				else if(kategori==2)
				{
					condiments.UrunStokGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, adet, girisMi,islemYapilacakUrun);
				}
				else if(kategori==3)
				{
					confections.UrunStokGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, adet, girisMi,islemYapilacakUrun);
				}
				else if(kategori==4)
				{
					dairyProducts.UrunStokGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, adet, girisMi,islemYapilacakUrun);
				}
				else if(kategori==5)
				{
					grainsCereals.UrunStokGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, adet, girisMi,islemYapilacakUrun);
				}
			
			break;
			
            case 2:
            	kontrol=0;
            	veri.nextLine();
            	System.out.println("indirim yapmak istiyorsaniz true,degilse false giriniz");
		    		boolean indirimMi=veri.nextBoolean();
			    	int oran=islemYapilacakUrun.length();
			    	System.out.println(oran);
			    	
			    	if(kategori==1)
					{
						beverages.UrunFiyatGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
								GrainsCerealslist, kategori, oran, indirimMi,islemYapilacakUrun);
					}
					else if(kategori==2)
					{
						condiments.UrunFiyatGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
								GrainsCerealslist, kategori, oran, indirimMi,islemYapilacakUrun);
					}
					else if(kategori==3)
					{
						confections.UrunFiyatGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
								GrainsCerealslist, kategori, oran, indirimMi,islemYapilacakUrun);
					}
					else if(kategori==4)
					{
						dairyProducts.UrunFiyatGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
								GrainsCerealslist, kategori, oran, indirimMi,islemYapilacakUrun);
					}
					else if(kategori==5)
					{
						grainsCereals.UrunFiyatGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
								GrainsCerealslist, kategori, oran, indirimMi,islemYapilacakUrun);					
					}
			    		    	
			break;
			
			case 3:
				kontrol=0;
				veri.nextLine();
				 System.out.println("Eklemek istediginiz orani giriniz");
			    oran=veri.nextInt();
			    	
			    	if(kategori==1)
					{
						beverages.UrunBirimAgirlikGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
				    			GrainsCerealslist, kategori, oran,islemYapilacakUrun);
					}
					else if(kategori==2)
					{
						condiments.UrunBirimAgirlikGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
				    			GrainsCerealslist, kategori, oran,islemYapilacakUrun);
					}
					else if(kategori==3)
					{
						confections.UrunBirimAgirlikGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
				    			GrainsCerealslist, kategori, oran,islemYapilacakUrun);
					}
					else if(kategori==4)
					{
						dairyProducts.UrunBirimAgirlikGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
				    			GrainsCerealslist, kategori, oran,islemYapilacakUrun);
					}
					else if(kategori==5)
					{
						grainsCereals.UrunBirimAgirlikGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
				    			GrainsCerealslist, kategori, oran,islemYapilacakUrun);				
					}
                	break;
					
			case 4:	
				kontrol=0;
				veri.nextLine();
				System.out.println("urun adi giriniz");
				String Adi=veri.nextLine();
				System.out.println("birim agirlik giriniz");
				String BirimAgirligi=veri.nextLine();
				System.out.println("birim fiyat giriniz(kusurlu fiyatlar icin virgulle giriniz)");
				double BirimFiyati=veri.nextDouble();
				veri.nextLine();
				System.out.println("Detay giriniz");
				String detay=veri.nextLine();
				
				if(kategori==1)
				{
					beverages.YeniUrunEkle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, Adi, BirimAgirligi, BirimFiyati,detay);
				}
				else if(kategori==2)
				{
					condiments.YeniUrunEkle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, Adi, BirimAgirligi, BirimFiyati,detay);
				}
				else if(kategori==3)
				{
					confections.YeniUrunEkle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, Adi, BirimAgirligi, BirimFiyati, detay);
				}	
				else if(kategori==4)
				{
					dairyProducts.YeniUrunEkle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, Adi, BirimAgirligi, BirimFiyati, detay);
				}
				else if(kategori==5)
				{
					grainsCereals.YeniUrunEkle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, Adi, BirimAgirligi, BirimFiyati, detay);	
				}
								
			break;
						
			case 5:
				kontrol=0;
				veri.nextLine();
				System.out.println("Degistirmek istediginiz ismi giriniz");
				String yeniIsım=veri.nextLine();				
				System.out.println("Degistirmek istediginiz detayi giriniz");
				String yeniDetay=veri.nextLine();
				
				Urun.UrunIsımGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
						GrainsCerealslist, kategori, islemYapilacakUrun, yeniIsım, yeniDetay);	
			break;	
			
			case 6:
				kontrol=0;
				veri.nextLine();
				
				Urun.UrunSil(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
						GrainsCerealslist, kategori, islemYapilacakUrun);
				
			break;
			
			case 7:
				kontrol=0;
				Urun.EnPahaliUrunFiyatGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
						GrainsCerealslist, kategori);	
			break;
			
			case 8:
				kontrol=0;
				veri.nextLine();
				System.out.println("detay giriniz");
				detay=veri.nextLine();
				Urun.DetayGuncelle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
						GrainsCerealslist, kategori, detay);
			break;
			
			default:
				System.out.println("SECTIGINIZ SECENEK BULUNMAMAKTADIR");
				kontrol=1;			
			break;
			}
			
			if(kontrol==0)
			{
			while(kategori!=6)
			{
			System.out.println("1-Beverages  \r\n"
					+ "2-Condiments \r\n"
					+ "3-Confections  \r\n"
					+ "4-DairyProducts \r\n"
					+ "5-Cereals \r\n"
					+ "6-Cikis");
			kategori=veri.nextInt();
			
			if(kategori>6 || kategori<1)
				System.out.println("hatali secim!!!");
			
			else if(kategori==6)
				return;
			
			else 
				break;
			}
			}
			
			veri.nextLine();
			System.out.println("islem yapilacak urunu giriniz");
	    	islemYapilacakUrun=veri.nextLine();
			
	    	System.out.println("1. UrunStokGuncelle\r\n"
					+ "2. UrunFiyatGuncelle\r\n"
					+ "3. UrunBirimAgirlikGuncelle\r\n"
					+ "4. YeniUrunEkle \r\n"
					+ "5. EnKisaIsimliUrunIsimGuncelle\r\n"
					+ "6. StokEnCokOlanUrunSil\r\n"
					+ "7. EnPahaliUrunFiyatGuncelle\r\n"
					+ "8. DetayGuncelle");			
			      secenek=veri.nextInt();
		}while(secenek!=9);

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
							Beverages yeniBeveragesUrun=new Beverages(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
									Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2],1);
		               		Beverages.add(yeniBeveragesUrun);
							yeniBeveragesUrun=null;
						}
						
						else if(Integer.valueOf(dizi2[0])==2)
						{
							Condiments yeniCondimentsUrun=new Condiments(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
									Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2],2);
						      
							Condiments.add(yeniCondimentsUrun);
							yeniCondimentsUrun=null;
						}
						else if(Integer.valueOf(dizi2[0])==3)
						{
							Confections yeniConfectionsUrun=new Confections(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
									Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2],3);
						     
							Confections.add(yeniConfectionsUrun);
							yeniConfectionsUrun=null;
						}
						
						else if(Integer.valueOf(dizi2[0])==4)
						{
							DairyProducts yeniDairyProductsUrun=new DairyProducts(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
									Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2],4);
		                    
							DairyProducts.add(yeniDairyProductsUrun);
							yeniDairyProductsUrun=null;
						}
						
						else if(Integer.valueOf(dizi2[0])==5)
						{
							GrainsCereals yeniGrainsCerealsUrun=new GrainsCereals(dizi[0], Integer.valueOf(dizi[1]),dizi[2],
									Double.valueOf(dizi[3]),Integer.valueOf(dizi[4]), dizi2[1], dizi2[2],5);							
		                    
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
