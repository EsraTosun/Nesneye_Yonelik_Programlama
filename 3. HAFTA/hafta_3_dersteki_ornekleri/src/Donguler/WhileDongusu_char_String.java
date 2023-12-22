package Donguler;

public class WhileDongusu_char_String {
	public static void main(String[] args) {

		string();
		Basamak();
		
	}
	
	
	
	static void string() {
		String[] dizi= {"Ankara","istanbul","izmir","konya","bursa"};
		char[] ch= {'a','b','c','d'};
		
		for(String sehir:dizi)
		{
			System.out.println("\t "+sehir);
		}
		for (char c : ch) {
			System.out.println("\t "+c);

		}
	}

	static void Basamak() {
		int sayi = 12345;
		int basamak = 0;

		while (sayi > 0) {
			basamak++;
			sayi /= 10;
		}
		System.out.println(basamak);
	}

}
