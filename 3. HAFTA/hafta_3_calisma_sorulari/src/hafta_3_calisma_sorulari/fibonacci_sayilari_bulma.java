package hafta_3_calisma_sorulari;

public class fibonacci_sayilari_bulma {

	public static void main(String[] args) {
		int sira=8;
		Fib_Hesapla(sira);

	}
	static void Fib_Hesapla(int sira)
	{
		int fibonacciSayi=1,oncekiFibonacciSayisi=0,yedek;
		
		for(int i=1;i<=sira;i++)
		{
			System.out.println("\t "+fibonacciSayi);
			yedek=fibonacciSayi;
			fibonacciSayi+=oncekiFibonacciSayisi;
			oncekiFibonacciSayisi=yedek;
		}
	}
}
