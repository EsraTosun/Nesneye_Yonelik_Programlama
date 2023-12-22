package Polymorphism_CokBicimlilik;

import Paket1.Personel;

//Polymprphism,(Overriding,çok biçimlilik) metotlarının nesneye göre farklı çıktılar üretmesi veya farklı işlemler yapmasıdır
//Kısaca; metotlara sabit görevler vermek yerine onlara çok biçimlilik davranacak şekilde bir esneklik vermektedir


public class Main 
{
	public static void main(String[] args)
	{
		Polymorphism_CokBicimlilik.Personel p=new Polymorphism_CokBicimlilik.Personel(20, 6000, "Ahmet");
		System.out.println("p.MaasHesapla=>"+p.MaasHesapla(1000));
		
		//Mudur m=(Mudur) p; //personeli mudur yaptık(tip Dönüşümü)
		
		Mudur m=new Mudur(20, 6000, "Ahmet");
		System.out.println("m.MaasHesapla=>"+m.MaasHesapla(1000));
		
		Isci I=new Isci(20, 6000, "Ahmet");
		System.out.println("m.MaasHesapla=>"+I.MaasHesapla(10000));
		
		Isci.IsciGunleri();  //static kulllanıldığı için nesne kullanılmadan
		Isci.calismaSuresi=10;  //direk erişebiliriz
		
	}

}
