package hafta_3_calisma_sorulari;

public class girilen_sayinin_asal_carpanlarini_bulma {

	public static void main(String[] args) 
	{
		int sayi=150,sayac=0,sayac1=0;
		
		System.out.print(sayi+" 'nin carpanlari: ");
		for(int i=2;i<sayi;i++)
		{
			sayac=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					sayac=1;
				}
			}
			if(sayac==0 && sayi%i==0)
			{
				sayac1++;
				System.out.print(" "+i);
			}
		}
		System.out.println("\ncarpan sayisi: "+sayac1);
		
		
		

	}

}
