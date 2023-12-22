package bir_kelimenin_palindrom_olup_olmadigi;

import java.util.ArrayList;
import java.util.Scanner;

public class koordinatlari_verilen_bir_ucgenin_alanini_denkleme_gore_hesaplayiniz {

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

		double alan=Math.abs(((Listx.get(0)*Listy.get(1)+Listx.get(1)*Listy.get(2)+Listx.get(2)*Listy.get(0))
				-(Listy.get(0)*Listx.get(1)+Listy.get(1)*Listx.get(2)+Listy.get(2)*Listx.get(0))))*1/2;
		
		System.out.println("alan:"+alan);
	}

	

}
