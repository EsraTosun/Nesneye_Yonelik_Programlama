package Paket1;

import java.util.ArrayList;
import java.util.Scanner;



public class Condiments extends Urun 
{
	
	private String kategoriAdi;
	private String detay;
	
	public Condiments()
	{
		
	}
	public Condiments(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari,
			String kategoriAdi, String detay) {
		super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari, kategoriAdi, detay);
		this.kategoriAdi = kategoriAdi;
		this.detay = detay;
	}
	
	@Override
	 public void UrunAdiDegistir(ArrayList<Beverages> Beverageslist,
	    		ArrayList<Condiments> Condimentslist,ArrayList<Confections> Confectionslist,
	    		ArrayList<DairyProducts> DairyProductslist,ArrayList<GrainsCereals> GrainsCerealslist,
	    		String adi)
	    {	
			 Scanner scanner=new Scanner(System.in);
			 String yeniAdi;
			 int sayac=0;
	    	
	    	
	       		for(int i=0;i<Condimentslist.size();i++)
	       		{
	       			if(Condimentslist.get(i).getAdi().compareTo(adi)==0)
	       			{
	       	       		Condiments.ListeyiYazdir(Condimentslist);
	       	       		for(int k=0;k<adi.length();k++)
	       	       		{
	       	       			if(adi.charAt(k)=='a' ||adi.charAt(k)=='e' ||adi.charAt(k)=='i' ||adi.charAt(k)=='u' ||
	       	       				adi.charAt(k)=='o' || adi.charAt(k)=='A' ||adi.charAt(k)=='e' ||adi.charAt(k)=='I' ||
	       	       			adi.charAt(k)=='U' ||adi.charAt(k)=='O')
	       	       			{
	       	       				adi=adi.replace("a","");
	       	       				adi=adi.replace("e","");
	       	       				adi=adi.replace("i","");
	       	       				adi=adi.replace("u","");
	       	       				adi=adi.replace("o","");
	       	       				adi=adi.replace("A","");
	       	       				adi=adi.replace("E","");
	       	       				adi=adi.replace("I","");
	       	       				adi=adi.replace("U","");
	       	       				adi=adi.replace("O","");
	       	       				System.out.println(adi);
	       	       				k--;
	       	       			}
	       	       			
	       	       		}
	       				Condimentslist.get(i).setAdi(adi);	
	       				break;
	       			}
	       		}
	       		Condiments.ListeyiYazdir(Condimentslist);
	      
	    }
	
	public static void  UruneZamYap(ArrayList<Condiments> Condimentslist,double zamOrani)
	{
		ListeyiYazdir(Condimentslist);
		for(int i=0;i<Condimentslist.size();i++)
		{
			Condimentslist.get(i).setBirimFiyati(Condimentslist.get(i).getBirimFiyati()+
					Condimentslist.get(i).getBirimFiyati()*zamOrani/100);
		}
		ListeyiYazdir(Condimentslist);
	}
	
	public static void UruneZamYap(ArrayList<Condiments> Condimentslist,double zamOrani, int stokKontrol)
	{
		ListeyiYazdir(Condimentslist);
		for(int i=0;i<Condimentslist.size();i++)
		{
			if(stokKontrol<10)
			{
				Condimentslist.get(i).setBirimFiyati(Condimentslist.get(i).getBirimFiyati()+
						Condimentslist.get(i).getBirimFiyati()*zamOrani/100);	
			}
			else
			{
				Condimentslist.get(i).setBirimFiyati(Condimentslist.get(i).getBirimFiyati()+
						Condimentslist.get(i).getBirimFiyati()*zamOrani/100/2);
			}
		}
		ListeyiYazdir(Condimentslist);
	}  
	
	public static void UruneZamYap(ArrayList<Condiments> Condimentslist,double zamOrani,int stokKontrol, int birimFiyati)
	{
		ListeyiYazdir(Condimentslist);
		for(int i=0;i<Condimentslist.size();i++)
		{
			if(birimFiyati<10)
			{
				Condimentslist.get(i).setBirimFiyati(Condimentslist.get(i).getBirimFiyati()+
						Condimentslist.get(i).getBirimFiyati()*zamOrani/100);	
			}
			else if(birimFiyati<50)
			{
				Condimentslist.get(i).setBirimFiyati(Condimentslist.get(i).getBirimFiyati()+
						Condimentslist.get(i).getBirimFiyati()*zamOrani/100/2);	
			}
			else
			{
				Condimentslist.get(i).setBirimFiyati(Condimentslist.get(i).getBirimFiyati()+
						Condimentslist.get(i).getBirimFiyati()*zamOrani/100/4);
			}
		}
		ListeyiYazdir(Condimentslist);
	}
	    
		
	
		
	public static void ListeyiYazdir(ArrayList<Condiments> urun)
	{
		for(int i=0;i<urun.size();i++)
		{
			System.out.println("\t "+urun.get(i).getAdi()+
					"     \t \t "+urun.get(i).getKategoriIndex()+
					"\t \t      "+urun.get(i).getBirimAgirligi()+
					"\t \t "+urun.get(i).getBirimFiyati()+
					"\t \t "+urun.get(i).getStokMiktari()+
					"\t \t "+urun.get(i).kategoriAdi+
					"\t \t "+urun.get(i).detay);
				}
			System.out.println("listede eleman sayisi:"+urun.size());
			System.out.println();
	}
}
