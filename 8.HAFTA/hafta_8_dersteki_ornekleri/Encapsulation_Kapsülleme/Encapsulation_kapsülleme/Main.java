package Encapsulation_kapsülleme;

import Paket1.Personel;

//Encapsulation(kapsüllememe veya sarmallama) prensibi sınıfın özelliklerini korumaya almasıdır
//Bu korumayı sağlamak için private ve protected(erişim belirteci)kullanılır.
//Encapsulation prensibinin amacı sınıfa ait özelliklere her sınıfın istediği gibi erişmesini ve değiştirmesini engellemektedir.


public class Main {

	public static void main(String[] args) 
	{
		Personel p=new Paket1.Personel(10);
		p.setAdi("Ahmet");
		p.setMaas(12000.12);
		
		System.out.println(p.getMaas());
		System.out.println(p.getAdi());

		
		

	}

}
