package ders1;

public class Main {

	public static void main(String[] args) 
	{
		
		Daire daire1=new Daire(5,"Daire1");
		
		daire1.AlanHesapla();
		System.out.println("daire 1 alan:"+daire1.alan);
		System.out.println("daire1.alanHesapla():"+daire1.AlanHesapla());
		
		daire1.CevreHesapla();
		System.out.println("daire 1 cevre:"+daire1.cevre+"\n");
		
		
		Dikdortgen dikdortgen1=new Dikdortgen(10, 20);
		dikdortgen1.AlanHesapla();
		dikdortgen1.CevreHesapla();
		dikdortgen1.EkranaYaz();
		
		System.out.println("Dikdortgen 1 cevre:"+dikdortgen1.cevre+" Dikdortgen 1 alan:"+dikdortgen1.alan+"\n");
		
		
		Kare kare1=new Kare(10);
		kare1.AlanHesapla();
		kare1.CevreHesapla();
		kare1.EkranaYaz();
		
		System.out.println("Kare 1 cevre:"+kare1.cevre+" alan:"+kare1.alan);
		
		
		
		
		

	}

}
