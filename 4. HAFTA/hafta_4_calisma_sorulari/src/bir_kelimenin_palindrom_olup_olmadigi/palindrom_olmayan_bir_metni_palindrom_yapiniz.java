package bir_kelimenin_palindrom_olup_olmadigi;

import java.util.ArrayList;
import java.util.Scanner;

public class palindrom_olmayan_bir_metni_palindrom_yapiniz {

	public static void main(String[] args) {
		
		Scanner giris=new Scanner(System.in);
		System.out.println("string bir ifade giriniz");
		String myStr=giris.nextLine();
		
		ArrayList List= new ArrayList<>();
		
		for(int i=0;i<myStr.length();i++)
		{
	        List.add(myStr.charAt(i));
			//if(myStr.charAt(i)!=myStr.charAt((myStr.length()-i-1)))
		}
		
		ListeyiYazdir(List);
		
		for(int i=0;i<=List.size()/2;i++)
		{
			//ListeyiYazdir(List);
			if(List.get(i)!=List.get(List.size()-i-1))
			{
				List.remove(i);
				List.remove(List.size()-i-1);
				i--;
			}
			ListeyiYazdir(List);
		}
		
		ListeyiYazdir(List);
		

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
