package veri_girisi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class veri_girisi {

	public static void main(String[] args) {
		
		VeriGirisiYap();
		
	}
	
	
	static void VeriGirisiYap()
	{
        Scanner giris=new Scanner(System.in);
		
		System.out.println("sayi giriniz:");
		int sayi=giris.nextInt();
		System.out.println(sayi);
		
		System.out.println("string bir ifade giriniz");
		String myStr=giris.next();
		System.out.println(myStr);
		
		giris.nextLine();
		
		
		System.out.println("string bir ifade giriniz");
		String myStr1=giris.nextLine();
		System.out.println(myStr1);
		
		
		
		System.out.println("double bir ifade giriniz");
		double doubleVeri=giris.nextDouble();
		System.out.println(doubleVeri);
	
	}
	
}
