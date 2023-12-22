package Donguler;

public class for_dongusu 
{
	//println alt satıra geçerek yazdırır
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Donguler");
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
			/*
			System.out.println("Çiftler");
			for (int i = 0; i < 10; i=i+2) {
				System.out.println(i);

			}
			
			System.out.println("Tekler");
			for (int i = 1; i < 10; i=i+2) {
				System.out.println(i);

			}
			*/
			System.out.println("tek dongu ile once ciftler sonra tekleri yazdirma");
			for (int i = 0; i < 10; i=i+2) {
				System.out.println(i);
				if(i==8) {
					i=-1;
				}
			}
			
			DonguYazdir();
			
			
			
		}
		
		
		
		
		
		
		static void DonguYazdir() {
			
			System.out.println("Çiftler");
			for (int i = 0; i < 10; i=i+2) {
				System.out.println(i);

			}
			
			System.out.println("Tekler");
			for (int i = 1; i < 10; i=i+2) {
				System.out.println(i);

			}
			
		}
}