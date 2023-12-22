package hafta_3_calisma_sorulari;

import java.util.Scanner;

public class geometrik_sekiller_olusturma {

	public static void main(String[] args) {
		
		//Kare();
		//Dikdortgen();
		//DikUcgen();
		EsKenarUcgen();
		

	}
	
	public static void Kare()
	{
		int kenar=7;
		
		for(int i=0;i<kenar;i++)
		{
			for(int j=0;j<kenar;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Dikdortgen()
	{
        int kenar1=7,kenar2=3;
		
		for(int i=0;i<kenar1;i++)
		{
			for(int j=0;j<kenar2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	 
	public static void DikUcgen()
	{

		int kenar=9;
		
		for(int i=1;i<=kenar;i++)
		{
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void EsKenarUcgen()
	{
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Olusturmak istediginiz esucgenin kenar uzunlugunu giriniz: ");
		int esusgen_kenar = girdi.nextInt();
		System.out.println("OLUSTURULAN ESUCGEN");
		for (int i = 0; i < esusgen_kenar; i++) {
			for (int j = 0; j < esusgen_kenar - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j < esusgen_kenar - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	

}
