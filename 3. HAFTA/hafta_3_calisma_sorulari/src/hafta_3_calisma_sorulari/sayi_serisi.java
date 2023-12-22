package hafta_3_calisma_sorulari;

import java.util.Scanner;

public class sayi_serisi 
{
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Serinin ilk elemanini giriniz: ");
		int ilk_eleman = girdi.nextInt();
		System.out.print("\nSerinin eleman sayisini giriniz: ");
		int eleman_sayisi = girdi.nextInt();
		System.out.println("\nSerinin artis miktarini giriniz: ");
		int artis_miktari = girdi.nextInt();
		System.out.println("Olusturulan Seri: ");
		for (int i = 0; i < eleman_sayisi; i++) {
			System.out.print(ilk_eleman + "\t");
			ilk_eleman += artis_miktari;
		}
	}

}
