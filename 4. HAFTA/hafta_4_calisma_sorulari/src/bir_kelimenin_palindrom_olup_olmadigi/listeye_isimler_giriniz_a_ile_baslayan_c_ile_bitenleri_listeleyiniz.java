package bir_kelimenin_palindrom_olup_olmadigi;

import java.util.ArrayList;
import java.util.Scanner;

public class listeye_isimler_giriniz_a_ile_baslayan_c_ile_bitenleri_listeleyiniz {

	public static void main(String[] args) {
		//10 tane isim giriniz. 
		//Oluşturduğunuz listede ‘a’ ile başlayıp “c” ile biten isimleri listeleyiniz.
		
		Scanner giris=new Scanner(System.in);
		
		ArrayList<String> List=new ArrayList<String>();
		ArrayList<Integer> List2=new ArrayList<Integer>();
		ArrayList<String> List1=new ArrayList<String>();

		
		for(int i=0;i<5;i++)
		{
			System.out.println("isim giriniz:");
			String isim=giris.next();
		//	System.out.println(isim);
			List.add(isim);
		}
		
		//ilkHarfi_a_sonHarfi_c_olanlar(List);
		//ortaHarfi_m_olanlar(List);
		
		//yaz_iceren_b_harfiIcermeyenKelimeler(List);
		
		isimleriBuyuktenKucugeSiralayin(List,List1,List2);
		
		YeniElamanEkle(List1, List2);
		YeniElamanEkle(List1, List2);
		YeniElamanEkle(List1, List2);
	
		
	
	}
	
	static void ilkHarfi_a_sonHarfi_c_olanlar(ArrayList<String> List)
	{
		for(int i=0;i<List.size();i++)
		{
			if(List.get(i).charAt(0)=='a' && List.get(i).charAt(List.get(i).length()-1)=='c')
            {
	           System.out.println(List.get(i));
            }
		}
	}
	
	//10 adet isim içinden İsim bilgisinin orta karakteri ‘m’ olan isimleri gösteriniz.
	//Örnek: cemal, sami
	//(gösterilecek) vb. İsim Listesini ilk başta manuel oluşturunuz. 
	//“Ahmet”, “Ali”, “Veli” şeklinde.
	
	static void ortaHarfi_m_olanlar(ArrayList<String> List)
	{
		for(int i=0;i<List.size();i++)
		{
			if(List.get(i).charAt(List.get(i).length()/2)=='m')
			{
				System.out.println(List.get(i));
			}
		}
	}
	
	static void yaz_iceren_b_harfiIcermeyenKelimeler(ArrayList<String> List)
	{
		for(int i=0;i<List.size();i++)
		{
			//System.out.println(i);
			if(List.get(i).contains("yaz")==true && List.get(i).contains("b")==false)
			{
				System.out.println(List.get(i));
			}
		}
	}
	
	static void isimleriBuyuktenKucugeSiralayin(ArrayList<String> List,ArrayList<String> List1,ArrayList<Integer> List2)
	{
	
		for(int i=0;i<List.size();i++)
		{
			List1.add(List.get(i));
			List2.add(List.get(i).compareTo("0"));
		}
		
		Siralama(List1, List2);
	}
	
	static void Siralama(ArrayList<String> List1,ArrayList<Integer> List2)
	{
		int yedek2;
		String yedek1;
		int maximum;
		
		for(int i=0;i<List2.size();i++)
		{
		   	maximum=i;
		   	
		   	for(int j=i+1;j<List2.size();j++)
		   	{
		   		if (List2.get(j)>List2.get(maximum))
		   		 maximum=j;
		    }
			   
			   yedek1=List1.get(i);
			   List1.set(i,List1.get(maximum));
			   List1.set(maximum,yedek1);
			   
			   yedek2=List2.get(i);
			   List2.set(i,List2.get(maximum));
			   List2.set(maximum,yedek2);
			   
			   System.out.println(List1.get(i)+" kelimesi "+List2.get(i)+" boyutludur");
	 } 
   }
	
	static void YeniElamanEkle(ArrayList<String> List1,ArrayList<Integer> List2)
	{
		Scanner kelime=new Scanner(System.in);
		System.out.println("kelime giriniz");
		String eleman=kelime.next();
		
		int sayac=0;
		
		for(int i=0;i<List1.size();i++)
		{
			if(List2.get(i)<eleman.compareTo("0"))
			{
				List1.add(i, eleman);
				List2.add(i, eleman.compareTo("0"));
				sayac=1;
				break;
			}
		}
		if(sayac==0)
		{
			List1.add(eleman);
			List2.add(eleman.compareTo("0"));
		}
		ListeyiYazdir(List1);
		ListeyiYazdir(List2);
		
	}
	
	
	static void ListeyiYazdir(ArrayList List)
	{
		for (Object deger : List) 
		{
			System.out.print(deger+" ");
		}
		System.out.println();
	}
	
	
	

}
