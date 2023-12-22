package Abstraction_soyutlama;

abstract class Sekil
{
	//değişkenler abstract olarak tanımlanamaz
	
	int alan;
	int daire;
	int kenar;
	
	public Sekil(int kenar)
	{
		this.kenar=kenar;
	}
	
	abstract double AlanHesapla();
	abstract double CevreHesapla();
	
	void Yazdir()
	{
		System.out.println("bu nesne bir sekildir");
	}

}

abstract class Dortgen extends Sekil
{
	//Alt sinif da abstract olursa üst sınıfın abstract metotu bu sınıfta tanımlanmak(override edilmek) zorunda değil.

	int kenar2;
	
	public Dortgen(int kenar) {
		super(kenar);
	}
	
	abstract double KosegenGesapla();
	
}



class Daire extends Sekil
{
	public Daire(int kenar) {
		super(kenar);
	}

	final double PI=Math.PI;

	@Override
	double AlanHesapla() {
		return PI*kenar*kenar;
	}

	@Override
	double CevreHesapla() {
		return 2*PI*kenar;
	}	
	
	double CapHesapla()
	{
		return kenar*2;
	}
}

class Kare extends Dortgen
{

	public Kare(int kenar) {
		super(kenar);
	}

	@Override
	double AlanHesapla() {
		return kenar*kenar;
	}

	@Override
	double CevreHesapla() {
		return 4*kenar;
	}

	@Override
	double KosegenGesapla() {
		return kenar*Math.sqrt(2);
	}
	
}

class Dikdortgen extends Dortgen
{

	public Dikdortgen(int kenar,int kenar2) {
		super(kenar);
		this.kenar2=kenar2;
		// TODO Auto-generated constructor stub
	}

	@Override
	double KosegenGesapla() {
		// TODO Auto-generated method stub
		return kenar*kenar2*Math.sqrt(2);
	}

	@Override
	double AlanHesapla() {
		// TODO Auto-generated method stub
		return kenar*kenar2;
	}

	@Override
	double CevreHesapla() {
		// TODO Auto-generated method stub
		return 2*(kenar+kenar2);
	}
	
}

public class Sekil_Ornegi {

	public static void main(String[] args) {
		
		Daire daire=new Daire(10);
		
		System.out.println("Alan:"+daire.AlanHesapla());
		System.out.println("Cevre:"+daire.CevreHesapla());
		System.out.println("Cap: "+daire.CapHesapla());
		
		Kare kare=new Kare(5);
		System.out.println("Alan:"+kare.AlanHesapla());
		System.out.println("Cevre:"+kare.CevreHesapla());
		System.out.println("Kosegen hesapla"+kare.KosegenGesapla());
		kare.Yazdir();
		
		Dortgen dikdortgen=new Dikdortgen(10, 20);
		System.out.println("Alan:"+dikdortgen.AlanHesapla());
		System.out.println("Cevre:"+dikdortgen.CevreHesapla());
		System.out.println("Kosegen hesapla"+dikdortgen.KosegenGesapla());
		

		
	}

}
