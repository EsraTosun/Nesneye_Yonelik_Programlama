package bir_kelimenin_palindrom_olup_olmadigi;

import java.util.ArrayList;
import java.util.Scanner;

public class poligonun_alanini_formul_ile_hesaplayiniz {

	public static void main(String[] args) {
		Scanner veri=new Scanner(System.in);
		
		ArrayList<Integer> Listx=new ArrayList<Integer>();
		ArrayList<Integer> Listy=new ArrayList<Integer>();

		
		System.out.println("x1 koordinatini giriniz:");
		int x1=veri.nextInt();
		Listx.add(x1);
		
		System.out.println("y1 koordinatini giriniz:");
		int y1=veri.nextInt();
		Listy.add(y1);

		System.out.println("x2 koordinatini giriniz:");
		int x2=veri.nextInt();
		Listx.add(x2);

		System.out.println("y2 koordinatini giriniz:");
		int y2=veri.nextInt();
		Listy.add(y2);

		System.out.println("x3 koordinatini giriniz:");
		int x3=veri.nextInt();
		Listx.add(x3);

		System.out.println("y3 koordinatini giriniz:");
		int y3=veri.nextInt();
		Listy.add(y3);
		
		System.out.println("x4 koordinatini giriniz:");
		int x4=veri.nextInt();
		Listx.add(x4);

		System.out.println("y4 koordinatini giriniz:");
		int y4=veri.nextInt();
		Listy.add(y4);
		
		//alan =alan+ (xn+1 - xn) * (yn+1 + yn) / 2
		
		int alan=0;
		
		for(int i=0;i<3;i++)
		{
			alan+=(Math.abs((Listx.get(i+1)-Listx.get(i)))*
					(Math.abs(Listy.get(i+1)+Listy.get(i))))*1/2;
		}
		
		System.out.println(alan);

	}

}
