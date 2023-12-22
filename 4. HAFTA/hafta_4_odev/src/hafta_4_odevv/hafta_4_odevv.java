package hafta_4_odevv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hafta_4_odevv {

	public static void main(String[] args) {
		Scanner veri=new Scanner(System.in);
		
		ArrayList<Integer> List=new ArrayList<Integer>();
		ArrayList<Integer> List1=new ArrayList<Integer>(); //sayılar
		ArrayList<Integer> List2=new ArrayList<Integer>();  //frekansları

		System.out.println("1: SayiListesiOlustur\r\n"
				+ "2: FrekansHesapla\r\n"
				+ "3. FrekansaGoreSil\r\n"
				+ "4: YeniElemanEkle\r\n"
				+ "5: Cikis");
		int secenek=veri.nextInt();
		
	    do {
	    	switch (secenek) {
			case 1:
				if(List.isEmpty())//liste boşsa true değerinini döndürür
				SayiListesiOlustur(List);
				//liste boşsa silme yapılmayacağı için ilki kullanılır
				else
				{
					List.clear();
					//tekrar oluşturacağımızda listeyi baştan oluşturacağımız için
					//listeyi boşaltırız
					SayiListesiOlustur(List);
				}
				
				break;
				
	        case 2:
	        	if(List.isEmpty())
	        		System.out.println("LISTE BOS");
	        	//ana listemiz oluşup oluşmadığı kontrol edilir
	        	//eğer oluşmadıysa liste boş şeklinde kullanıcıya bildirir
	        	//ve hesapla yapılamaz
	        	else
	        	{
	        		if(List1.isEmpty())
			        	FrekansHesapla(List, List1, List2);

	    				else
	    				{
	    					List1.clear();
	    	        		List2.clear();
	    	        		//listeler dolu olduğu için ilk önce boşaltılır
	    	        		//sonra hesaplama yapılır
	    		        	FrekansHesapla(List, List1, List2);
	    				}
	        	}
	        	
				break;
				
	        case 3:
	        	if(List.isEmpty())
	        		System.out.println("LISTE BOS");
	        	else
	        	{
	        		if(List1.isEmpty()) //liste boş mu
			        	FrekansaGoreSil(List, List1, List2);

	    			else
	    			{
	    				List1.clear(); //listeleri boşalt
	    	        	List2.clear();
	    		        FrekansaGoreSil(List, List1, List2);
	    			}
	        	}
	        	break;
	        	
	        case 4:
	        	if(List.isEmpty())
	        		System.out.println("LISTE BOS");
	        	else
		        	YeniElemanEkle(List, List1, List2);
	        	
	        	break;

			default:
				System.out.println("YANLIS SECIM. TEKRAR DENEYINIZ");
				break;
			}
	    	System.out.println("\n\n1: SayiListesiOlustur\r\n"
					+ "2: FrekansHesapla\r\n"
					+ "3. FrekansaGoreSil\r\n"
					+ "4: YeniElemanEkle\r\n"
					+ "5: Cikis");
			   secenek=veri.nextInt();
	    }while(secenek!=5);
		
		
	}
	
	static void SayiListesiOlustur(ArrayList<Integer> List)
	{
		
		for(int i=0;i<30;i++)
		{
			List.add((int)(Math.random()*9)+1);
		}
		ListeyiYazdir(List);
	}
	
	static void FrekansHesapla(ArrayList<Integer> List,ArrayList<Integer> List1,ArrayList<Integer> List2)
	{
		
		for(int i=0;i<List.size();i++)
		{
			int sayac=0;
			int varMi=List1.indexOf(List.get(i));
			
			if(varMi!=-1) //elemanın indexi bulunduysa sıradakine geç
				continue;
			
			for(int j=i;j<List.size();j++)
			{
				
					if(List.get(i)==List.get(j))
					sayac++;
				
			}
				List1.add(List.get(i));
				System.out.println(List.get(i)+" sayisinin frekansi: "+sayac);
				List2.add(sayac);
				
		}
	    Siralama(List1, List2);
		
	}
	
	static void Siralama(ArrayList<Integer> List1,ArrayList<Integer> List2)
	{
		System.out.println("FREKANSA GORE BUYUKTEN KUCUGE SIRALANMIS HALI");
		int yedek1,yedek2;
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
			   
			   System.out.println(List1.get(i)+" sayisi "+List2.get(i)+" kere tekrarlanmistir");
	 } 
}
	
	static void FrekansaGoreSil(ArrayList<Integer> List,ArrayList<Integer> List1,ArrayList<Integer> List2)
	{
		FrekansHesapla(List, List1, List2);
		Scanner veri=new Scanner(System.in);
		System.out.println("silmek istediginiz frekansi siliniz");
		int frekans=veri.nextInt();
		
		int index=List2.indexOf(frekans);
		
		if(index==-1)
		{
			System.out.println("aradiginiz frekansta eleman bulunmamaktadir");
		}
		
		else
		{
			System.out.println("\nSILINMEDEN ONCEKI HALI");
			ListeyiYazdir(List);
		for(int j=0;j<List2.size();j++)
		{
			if(frekans==List2.get(j))
			{
				int silinecekSayi=List1.get(j);
				System.out.println("\n\n"+silinecekSayi+" SAYISI SILINIYOR");
				for(int i=List.size()-1;i>=0;i--)
				{
					if(silinecekSayi==List.get(i))
					{
						List.remove(i);
						ListeyiYazdir(List);
						System.out.println();
					}
					
				}
			}
		}
	} 
		
		
	}
	
	static void YeniElemanEkle(ArrayList<Integer> List,ArrayList<Integer> List1,ArrayList<Integer> List2)
	{
       Scanner veri=new Scanner(System.in);
		
		System.out.println("eklemek istediginiz elemani giriniz");
		int sayi=veri.nextInt();
		
		
		boolean VarMi=List.contains(sayi);
		
		if(VarMi)
		{
			System.out.println("girmek istedeginiz "+sayi+" listede bulunmaktadir");
		}
		
		else
		{
			System.out.println("kac kere eklenmesini istersiniz");
			int tekrar=veri.nextInt();
			for(int i=0;i<tekrar;i++)
			{
			    List.add(sayi);
			}
			ListeyiYazdir(List);
		}
	}
	
	static void ListeyiYazdir(ArrayList<Integer> List)
	{
		int sayac=0;
		for (Integer deger : List) 
		{
			System.out.print(deger+"  ");
			sayac++;
		}
		System.out.println("\n"+sayac+" tane sayi vardir");
	}
}