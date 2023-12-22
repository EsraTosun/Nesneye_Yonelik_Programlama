package hafta_3_calisma_sorulari;

public class girilen_sayinin_harshad_sayi_olup_olmaması 
{
	public static void main(String[] args)
	{
		int sayi=162;
		
		if(sayi%rakamlarToplami(sayi)==0)
		{
			System.out.println(sayi+" harshad sayidir");
		}
		
		else
			System.out.println(sayi+" harshad sayi degildir");

		
	}
	
	public static int rakamlarToplami(int sayi)
	{
		int toplam=0;
		
		while(sayi>0)
		{
			System.out.println("\t"+sayi%10);
			toplam+=sayi%10;
			sayi/=10;
		}
		return toplam;
	}
}
