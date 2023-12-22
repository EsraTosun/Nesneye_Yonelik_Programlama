package bir_kelimenin_palindrom_olup_olmadigi;

import java.util.ArrayList;
import java.util.Scanner;

public class girilen_bir_metnin_icindeki_her_harfin_kac_kez_tekrar_ettigini_bulunuz {

	public static void main(String[] args) {
		
		Scanner giris=new Scanner(System.in);
		System.out.println("string bir ifade giriniz");
		String myStr=giris.nextLine();
		System.out.println(myStr);
		
		for(int i=0;i<myStr.length();i++)
		{
			int sayac=0,harf=0;
			for(int j=0;j<i;j++)
			{
				if(myStr.charAt(i)==myStr.charAt(j))
				{
					sayac=1;
					break;
				}
			}
			for(int j=i;j<myStr.length();j++)
			{
					if(myStr.charAt(i)==myStr.charAt(j))
					{
						harf++;
					}
			}
			if(sayac==0)
			{
				System.out.println(myStr.charAt(i)+" harfi:"+harf+" kere tekrar etmistir");
			}
		}
	
		
		ArrayList<Character> KelimeList =new ArrayList<Character>();
		for(int i=0;i<myStr.length();i++)
		{
			System.out.println(myStr.charAt(i));
			KelimeList.add(myStr.charAt(i));
		}

	}

}
