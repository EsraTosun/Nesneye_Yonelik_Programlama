package hafta_9_odev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;



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
		
		System.out.println("1:UrunStokGuncelle\r\n"
				+ "2: UrunFiyatGuncelle\r\n"
				+ "3. UrunKategorikZamYap\r\n"
				+ "4. YeniUrunEkle\r\n"
				+ "5. UrunIsimGuncelle\r\n"
				+ "6. UrunSil\r\n"
				+ "7. Cikis");
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
		    		System.out.println("Yapmak istediginiz orani giriniz");
			    	int oran=veri.nextInt();
			    	
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
				 System.out.println("Zam yapmak istediginiz orani giriniz");
			    	oran=veri.nextInt();
			    	
			    	if(kategori==1)
					{
						beverages.UrunKategorikZamYap(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
				    			GrainsCerealslist, kategori, oran);
					}
					else if(kategori==2)
					{
						condiments.UrunKategorikZamYap(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
				    			GrainsCerealslist, kategori, oran);
					}
					else if(kategori==3)
					{
						confections.UrunKategorikZamYap(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
				    			GrainsCerealslist, kategori, oran);
					}
					else if(kategori==4)
					{
						dairyProducts.UrunKategorikZamYap(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
				    			GrainsCerealslist, kategori, oran);
					}
					else if(kategori==5)
					{
						grainsCereals.UrunKategorikZamYap(Beverageslist, Condimentslist, Confectionslist, DairyProductslist,
				    			GrainsCerealslist, kategori, oran);				
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
				System.out.println("Stok Miktari giriniz");
				int StokMiktari=veri.nextInt();
				
				if(kategori==1)
				{
					beverages.YeniUrunEkle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, Adi, BirimAgirligi, BirimFiyati, StokMiktari, "");
				}
				else if(kategori==2)
				{
					condiments.YeniUrunEkle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, Adi, BirimAgirligi, BirimFiyati, StokMiktari, "");
				}
				else if(kategori==3)
				{
					confections.YeniUrunEkle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, Adi, BirimAgirligi, BirimFiyati, StokMiktari, "");
				}	
				else if(kategori==4)
				{
					dairyProducts.YeniUrunEkle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, Adi, BirimAgirligi, BirimFiyati, StokMiktari, "");
				}
				else if(kategori==5)
				{
					grainsCereals.YeniUrunEkle(Beverageslist, Condimentslist, Confectionslist, DairyProductslist, 
							GrainsCerealslist, kategori, Adi, BirimAgirligi, BirimFiyati, StokMiktari, "");	
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
			System.out.println("1-Beverages : \r\n"
					+ "2-Condiments: \r\n"
					+ "3-Confections : \r\n"
					+ "4-DairyProducts: \r\n"
					+ "5-Cereals: \r\n"
					+ "6-Cikis:");
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
			
			System.out.println("1:UrunStokGuncelle\r\n"
					+ "2: UrunFiyatGuncelle\r\n"
					+ "3. UrunKategorikZamYap\r\n"
					+ "4. YeniUrunEkle\r\n"
					+ "5. UrunIsimGuncelle\r\n"
					+ "6. UrunSil\r\n"
					+ "7. Cikis");
			
			      secenek=veri.nextInt();
		}while(secenek!=7);

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
