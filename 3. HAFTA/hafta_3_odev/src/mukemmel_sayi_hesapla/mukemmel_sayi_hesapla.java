package mukemmel_sayi_hesapla;

public class mukemmel_sayi_hesapla {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++)
		{
			int p=UsHesapla(i)-1;
			
			if(SayiAsalMi(p))
			{
				System.out.println("\n"+p+" sayisi asaldir");
				int sayi=p*(UsHesapla(i-1));
				System.out.println("((2^"+i+")-1)*(2^("+i+"-1))="+(UsHesapla(i)-1)+"*"+UsHesapla(i-1)+"="+sayi);

				if(MukemmelSayiHesapla(sayi)==sayi)
					System.out.println("\n"+sayi+" mukemmel sayidir \n");
				
				else
					System.out.println("\n"+ sayi+ " mukemmel sayi degildir \n");  
			}
			else
				System.out.println("\n"+p+" sayisi asal degildir");
		}  
	}
	
	public static int UsHesapla(int sayi)
	{
		int carpim=1;
		if(sayi==0)
			return 1;
		
		for(int i=1;i<=sayi;i++)
		{
			carpim*=2;
		}
		return carpim;
	}
	
	public static boolean SayiAsalMi(int P)
	{
		if(P==1)
			return false;
		
		for(int i=2;i<P/2;i++)
		{
			if(P%i==0)
				return false;
		}
		return true;
	}
	
	public static void BolenleriGoster(int sayi)
	{
		System.out.print(sayi+" ");
	}
	
	public static int MukemmelSayiHesapla(int P)
	{
		int toplam=0;
		System.out.print(P+" sayisinin bolenleri: ");
		for(int i=1;i<=P/2;i++)
		{
			if(P%i==0)
			{
				toplam+=i;
				BolenleriGoster(i);
			}
		}
		return toplam;
	}
}
