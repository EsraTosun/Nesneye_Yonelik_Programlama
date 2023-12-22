package Donguler;

public class for_doWhileDonguleri {
	
		public static void main(String[] args) {

			// CarpimTablosuOlustur();
			// Asal();
			// Ornek();

			int sayi = 4;
			int adet = 4;

			boolean MukemmelMi;
			int ilkSayi = sayi;

			do {
				sayi++;
				MukemmelMi = MukemmelSayi(sayi);

				if (MukemmelMi == true) {
					System.out.println(ilkSayi + " dan buyuk en kucuk mukemmel sayi " + sayi + " dir");
					ilkSayi = sayi;
					adet--;
				}

			} while (adet > 0);

		}

		static void CarpimTablosuOlustur() {
			for (int i = 1; i <= 10; i++) {
				System.out.print("\t" + i);
			}

			System.out.println("\n");
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + "\t");
				for (int j = 1; j <= 10; j++) {
					System.out.print((i * j) + "\t");
				}
				System.out.println();
			}
		}

		static void Asal() {
			int sayi = 25;
			boolean AsalMisin = true;

			for (int i = 2; i < sayi / 2; i++) {
				if (sayi % i == 0) {
					AsalMisin = false;
					break;
				}
			}

			if (AsalMisin == true) {
				System.out.println("sayi asal");
			} else {
				System.out.println("sayi asal degil");
			}
		}

		static void Ornek() {
			for (int i = 1; i < 20; i++) {
				if (i % 5 == 0) {
					continue;
				}
				System.out.print(i + "\t");
			}

		}

		static boolean MukemmelSayi(int sayi) {
			int toplam = 1;// bütün sayılar 1 e bölündüğü için

			for (int i = 2; i <= sayi / 2; i++) {
				if (sayi % i == 0) {
					toplam += i;
				}
			}

			if (toplam == sayi) {
				// System.out.print(sayi +"mukemmel sayi");
				return true;
			}

			else {
				// System.out.print(sayi +"mukemmel sayi degil");
				return false;
			}
		}

	}


