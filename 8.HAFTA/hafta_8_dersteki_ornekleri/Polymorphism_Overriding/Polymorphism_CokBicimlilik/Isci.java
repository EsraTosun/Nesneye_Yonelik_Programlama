package Polymorphism_CokBicimlilik;

public class Isci extends Personel 
{
	public static int calismaSuresi;
	//bir metot yada değişkene static eklersek direk erişebiliriz.
	//nesne üzerinden erişilemez direk erişilir.
	
	public static void IsciGunleri()
	{
		System.out.println("genel bir islem yapildi");
	}

	public Isci(int yasi, double maas, String adi) {
		super(yasi, maas, adi);
		
	}
	
	@Override //anlamı => bu metot üst sınıfta var ama o metotu kullanma bu metotu kullan
	//override ettiğin metot, erişim belirleyici üst metottan en az onun kadar erişebilir olmak zorunda
	//üstü ve aynı olabilir ama alt seviyede olamaz
	//metotun tipi aynı olmak zorunda(int ise her yerde int olmak zorunda)
	public double MaasHesapla(int artisMiktari)
	{
		return 1000+artisMiktari;
	}

}
