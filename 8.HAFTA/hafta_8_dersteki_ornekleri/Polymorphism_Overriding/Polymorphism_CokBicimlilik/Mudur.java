package Polymorphism_CokBicimlilik;

import java.util.ArrayList;

public class Mudur extends Personel 
{
	ArrayList<Personel> pList=new ArrayList<Personel>();
	String unvan;

	public Mudur(int yasi, double maas,String adi ) {
		super(yasi, maas, adi);
		
	}
	
	/*@Override //anlamı => bu method üst sınıfta var ama o metotu kullanma bu metotu kullan
	public double MaasHesapla()
	{
		return this.maas*1.5;
	}  */
	
	//@Override yazarsak üst sınıflarda aynı isim olamdığı için hata verir
	//Eğer biz maasHesaplayı çağırırsak bu sınıfta olmadığı için üst metottakini erişir ve onu kullanılır
	public double MaasHesapla1()
	{
		return this.maas*1.5;
	}
	
	

}

//SOLID araştır
//overloading arastir