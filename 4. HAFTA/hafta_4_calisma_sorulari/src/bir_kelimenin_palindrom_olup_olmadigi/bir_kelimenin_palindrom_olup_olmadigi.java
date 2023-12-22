package bir_kelimenin_palindrom_olup_olmadigi;

import java.util.Scanner;

public class bir_kelimenin_palindrom_olup_olmadigi {

	public static void main(String[] args) {
		
		Scanner giris=new Scanner(System.in);
		System.out.println("string bir ifade giriniz");
		String myStr=giris.nextLine();
		//System.out.println(myStr);
		
		int sayac=0;
		
		for(int i=0;i<myStr.length()/2;i++)
		{
			if(myStr.charAt(i)!=myStr.charAt((myStr.length()-i-1)))
			{
				sayac=1;
				break;
			}
		}
		
		if(sayac==0)
			System.out.println(myStr+" palindrom sayidir");
		
		else 
			System.out.println(myStr+" palindrom sayi degildir"); 

	}

}
