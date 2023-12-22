package veri_girisi;

import java.util.ArrayList;
import java.util.List;

public class arraylist_olusturmaa {

	public static void main(String[] args) 
	{
		Liste();
	}

	static void ListeyiYazdir(ArrayList<Integer> intList)
	{
		for (Integer deger : intList) 
		{
			System.out.print(deger+"\t");
		}
		System.out.println();
	}
	
	static void Liste()
	{
		ArrayList listem=new ArrayList<>();
		// hangi tür olduğunu belirtmeden tanımladığımız için
		// listemizde birden fazla veri türü değişkeni içerebilir
		
		listem.add("ahmet");
		listem.add(20);
		listem.add('c');
	    listem.add(12.06);
	    System.out.println();
	    
	    for(Object deger: listem)
	    {
	    	System.out.println(deger.toString()+"\t");
	    }
	    
	    System.out.println();
		
		ArrayList<Integer> intList=new ArrayList<Integer>();
		//listemizde tür belirttiğimiz için sadece
		//int değerler girebiliriz
		
		for (int i = 0; i <5; i++) 
		{
			intList.add((i+1)*100);
		}
		
		ListeyiYazdir(intList);
		
		intList.add(600); //listenin sonuna ekler
		ListeyiYazdir(intList);
		
		intList.add(2, 250); //istenilen indexe eleman eklenir
		ListeyiYazdir(intList);
		
		//intList.remove(0); //indexteki elemani siler
		//ListeyiYazdir(intList);
		
		//silme işlemini sondan yapmak daha mantıklı
		//örneğin çift indexteki elemanları silmek istediğimizde
		//baştan başlarsak silmeye elemanları sildikten sonra
		//ilk baştaki çift indexlerin,indexleri değişiceği için
		//doğru sonuç bulmamış oluruz
		//sondan başlarsak çiftleri silmeye önceki çift elemanların
		//indexlerine etki etmiyeceği için doğru sonuç buluruz
		
		for(int i=intList.size()-1;i>=0;i-=2)
		{
			intList.remove(i);
			ListeyiYazdir(intList);
		}
		
		System.out.println("get kullanimi"); //veriye ulaşmak için
	     for(int i=0;i<intList.size();i++)
	     {
	    	 System.out.println(intList.get(i)+"\t");
	     }
	     ListeyiYazdir(intList);
	     
	     intList.set(0,88888); //veriyi güncelleme
	     ListeyiYazdir(intList);
	     
	     boolean varMi= intList.contains(-300); //elemanın olup olmadığı kontrol eder
	     System.out.println(varMi);
	     
	     ArrayList<Integer> cloneList=(ArrayList<Integer>) intList.clone();
	     ///elemanı başka bir listeye kopyalamamızı sağlar
	     ListeyiYazdir(cloneList);
	     ListeyiYazdir(intList);
	     
	     cloneList.set(0, -123);
	     ListeyiYazdir(cloneList);
	     ArrayList<Integer> copyList=intList; 
	     //listeyi direk kopyaladığımız için kopya listeye yapılan her değşiklik
	     //kopyalanan listeye de yapılmış olur
	     copyList.set(0, -5000);
	     
	     ListeyiYazdir(copyList);
	     ListeyiYazdir(intList);
	     
	     System.out.println("intList.indexOf(500):"+intList.indexOf(-500));
	     //intList.indexOf(500)
	     //elemanın olup olmadığını kontrol eder
	     //eğer var ise yerini söyler
	     //yoksa -1 döndürür.
	     
	     intList.replaceAll(item->item*2); 
	     //listedeki elemanların katlarını alarak elemanları güncellemimizi sağlar
	     ListeyiYazdir(intList);
	     
	     Object[] dizi=intList.toArray();
	     
	     List<Integer> yeniList=intList.subList(0,3); 
	     //listedeki 0. indexten  3. indexe kadar elemanları yeni listeye aktarmamızı sağlar
	     ListeyiYazdir(intList);
	     System.out.println();
	     
	     yeniList.replaceAll(item->item*2); 
	     for(Integer integer: yeniList)
	     {
	    	 
	    	 System.out.print(integer+"\t");
	     }
	     ListeyiYazdir(intList);
	}
}
