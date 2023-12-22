package Overloading;

public class Personel 
{
	protected int yasi;
	protected String adi;
	protected double maas;
	
    
	public Personel(int yasi,double maas,String adi) 
	{
		this.yasi=yasi;
		this.maas=maas;
		this.adi=adi;
	}
	
	public Personel(int yasi)
	{
		this.yasi=yasi;
		this.adi="anonim";
	}
	
	public Personel()
	{
		
	}
	
	//yukarıda üç tane aynı isimlerden oluşan ama farklı parametlerden oluşam metotlar(kurucu metotlar) bulunmaktadir
	//buna overloading denir.
	
	public double Hesapla(int a,int b)
	{
		return Math.pow(a, b);
	}
	
	public double Hesapla(int a)
	{
		return Math.pow(a, 2);
	}
	
	public static int Hesapla(int a,int b,int c)
	{
		return (int) Math.pow(Math.pow(a, 2),b);
	}
	
	//overloading metotların parametreleri aynı olmak zorunda değil
	//birine static dediğimizde hata vermez
	//parametresi biri double,biride int olduğu içinde hata vermez.
	//ama override de hata verir aynı olmak zorunda(her şeyi ile)
	//ikisini karıştıma
	
	public static String Hesapla(String a,int b)
	{
		return a.substring(b);	
	}
	
	public static String Hesapla(String a,int b,int c)
	{
		return a.substring(b,c);	
	}
	
	/*
	public static int Hesapla(String a,int b,int c)
	{
		return a.substring(b,c);	
	}  */
	
	//aynı parametrelere sahip ama tipi farklı olma durumu yoktur
	//hata verir
	//overloading de parametreler önemlidir
	//Overloadin metotların hepsinde parametreler farklı olmak zorunda
	//parametrelerin tipi önemli değildir,sayısı önemlidir
	//parametre sayısı farklı olmak zorundadır
	
	

}
