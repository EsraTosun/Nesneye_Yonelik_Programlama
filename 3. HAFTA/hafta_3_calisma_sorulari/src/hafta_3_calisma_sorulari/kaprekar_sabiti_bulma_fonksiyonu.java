 package hafta_3_calisma_sorulari;

public class kaprekar_sabiti_bulma_fonksiyonu {

	public static void main(String[] args) 
	{
		int sayi=7329,sayi1;
		int sayac=0;
		int fark;
		
		
		if(basamakKontrol(sayi)==4 && AyniSayiMiKontrol(sayi)==1)
		{
			System.out.println("calisiyor");
		}
		
		else
			System.out.println("calismiyor");  
		
		do
		{
			fark=SayiBuyuktenKucuge(sayi)-SayiKucuktenBuyuge(sayi); 
			sayi1=sayi;
			sayi=fark;
			System.out.println(fark);
			 if(fark==6174)
				break;
				
			
		}while(fark!=sayi1);
		
		
        
        
		
	}
	
	public static int SayiKucuktenBuyuge(int sayi)
	{
		int []dizi=new int[20];
		int i=0,deger=1000,gecici,toplam=0,k=0;
			
			while(sayi>0)
			{
				dizi[i]=sayi%10;
				sayi/=10;
				i++;
			}
			
			for(int j=0;j<i-1;j++)
			{
				int enkucuk=j;
				for( k=j;k<i;k++)
				{
					if(dizi[enkucuk]>dizi[k])
						enkucuk=k;
					
				}
				gecici=dizi[j];
				dizi[j]=dizi[enkucuk];
				dizi[enkucuk]=gecici;
				toplam+=(dizi[j]*deger);
				deger/=10;
			}
			toplam+=dizi[i-1];
			System.out.println("en kucuk:"+toplam);
			return toplam;
		
	}
	
	public static int SayiBuyuktenKucuge(int sayi)
	{
		int []dizi=new int[20];
		int i=0,deger=1000,gecici,toplam=0,k=0;
		while(sayi>0)
		{
			dizi[i]=sayi%10;
			sayi/=10;
			i++;
		}
		
		
		for(int j=0;j<i-1;j++)
		{
			int enbuyuk=j;
			for(k=j;k<i;k++)
			{
				if(dizi[enbuyuk]<dizi[k])
					enbuyuk=k;
			}
			gecici=dizi[j];
			dizi[j]=dizi[enbuyuk];
			dizi[enbuyuk]=gecici;
			toplam+=dizi[j]*deger;
			deger/=10;
		}
		toplam+=dizi[i-1];
		System.out.println("en buyuk:"+toplam);
		return toplam;
		
	}
	
	public static int basamakKontrol(int sayi)
	{
		int sayac=0;
		while(sayi>0)
		{
			sayi/=10;
			sayac++;
		}
		return sayac;
	}
	
	public static int AyniSayiMiKontrol(int sayi)
	{
		int basamak,oncekiBasamak=sayi%10;
		while(sayi>0)
        {
        	basamak=sayi%10;
        	sayi=sayi/10;
        	
        	if(oncekiBasamak!=basamak)
        		return 1;
        	oncekiBasamak=basamak;

        }
		
		return 0;
	}
	
	public static void kaprekarSabitiBulma()
	{
		
		
		
	}

}
