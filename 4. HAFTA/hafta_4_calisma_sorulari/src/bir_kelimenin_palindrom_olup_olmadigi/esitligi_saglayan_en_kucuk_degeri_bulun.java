package bir_kelimenin_palindrom_olup_olmadigi;

public class esitligi_saglayan_en_kucuk_degeri_bulun {

	public static void main(String[] args) 
	{
		//(n-1)! > 2^(n) * n^(Logn), n>2 olmak üzere eşitsizliğini 
		//sağlayan en küçük n değerini bulunuz.
		
		for(int i=3;i<100;i++)
		{
			int faktoriyel=1;
			for(int k=1;k<=i;k++)
			{
				faktoriyel*=k;
			}
			
			if(faktoriyel>(Math.pow(2,i)*Math.pow(i, Math.log10(i))))
			{
				System.out.println("(n-1)! >2^(n) * n^(Logn), n>2 esitsizligini sagalayan"
						+ "en kucuk sayi:"+i);
				break;
			}
			
		}

	}

}
