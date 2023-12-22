package hafta_3_calisma_sorulari;

public class girilen_sayidan_kucuk_en_buyuk_asal_sayi {

	public static void main(String[] args) 
	{
		int sayi=12;
		EnBuyukAsal(sayi);
		
		if(EnBuyukAsal(sayi)!=0)
	    System.out.println(sayi+ " dan kucuk en buyuk 3. asal sayi "+EnBuyukAsal(sayi));
		
		else 
        System.out.println(sayi+ " dan kucuk en buyuk 3. asal sayi yoktur");


		
	}
	
	public static int EnBuyukAsal(int sayi)
	{
		int artis=0;
		for(int i=sayi-1;i>1;i--)
		{
			int sayac=0;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					sayac=1;
					break;
				}
			}
			if(sayac==0)
				artis++;
			
			if(sayac==0 && artis==3)
			{
				//System.out.println(sayi+ " dan kucuk en buyuk asal sayi "+i);
				return i;
			}
			
		}
	  return 0;
	}
	
}
