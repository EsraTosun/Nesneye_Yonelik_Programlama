package hafta_3_calisma_sorulari;

public class n_siradaki_fermat_sayisi_nedir {

	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=0;i<n;i++)
		{
			System.out.println(i+" . siradaki Ferman Sayi: "+FermanSayiBulma(i));
		}

	}
	
	public static int UsAlma(int sayi)
	{
		int deger=1;
		for(int i=0;i<sayi;i++)
		{
			deger*=2;
		}
		return deger;
	}
	
	public static int FermanSayiBulma(int sayi)
	{
		int deger=UsAlma(UsAlma(sayi));
		return deger+1;
	}

}
