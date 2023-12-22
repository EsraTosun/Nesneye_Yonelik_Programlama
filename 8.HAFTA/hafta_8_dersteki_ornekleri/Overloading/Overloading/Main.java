package Overloading;

//Overloading(aşırı yükleme) => Ayni isimde birden çok metot tanımlama işlemine denir
//Bir sınıfa aynı isimde birden fazla metot oluşturulduğunda,bu tip metoda Overloaded method denir
//Örneğin; Birden fazla kurucu metot oluşturulmasıdır

public class Main {

	public static void main(String[] args) {
		
		String s="yazilim Muehdisligi";
		s.substring(2); //2 den başla bitesiye kadar devam et
		s.substring(2, 10); //2 ile 10 arasında işlem yap
		//yuukarıdaki işlem Overloadingdir.Çünkü aynı isimde farklı parametrelerle birden fazla metotların bulunmasıdır.
		
		Personel p=new Personel(10, 20, "esra");
		Personel p2=new Personel(20);
		Personel p3=new Personel();
		
		//aynı sınıfın kurucu metotları ama farklı parametre metotlarından oluşmaktadir(overloading)
		
		System.out.println(p.Hesapla(10));
		//System.out.println(p3.Hesapla("yazilim"));
		System.out.println(p.Hesapla(10, 3));
		System.out.println(Personel.Hesapla(10, 2, 3));
		System.out.println(Personel.Hesapla("yazilim Muhendisligi",2));
		System.out.println(Personel.Hesapla("yazilim Muhendisligi", 2, 10));
			
		
		//sadece kurucu metotlar için değil fonksiyonlar içinde overloading kullanılır
		
		
	}

}


