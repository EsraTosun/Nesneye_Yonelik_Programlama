package Abstraction_soyutlama;

//Soyutlama,gereksiz ayrıntıları göz ardı ederek bir nesnenin yalnızca gerekli özelliklerini 
//belirleme işlevi olarak da nitelendirilebilir.
//Soyutlama işlemi yapmak için soyur sınıf(abstr


//Soyut Sınıf(Abstract Class)
//Amaç: Soyut bir sınıfın amacı, türetilmiş sınoflar için bir plan sağlamk ve türetilmiş sınıfların
//soyut bir sınıfı miras aldıklarında uygulamaları gereken bazı kurallar belirlemektir.
//Soyut bir sınıfı temel sınıf olarak kullanabiriz ve türetilmiş tüm sınıflar soyut tanımları uygulamalıdır
//5 temel kural vardır
//1-Sınıfı abstract olaran tanımla
//2-abstract olan veya olmayan metotları bildir(Ne kadar abstrak olarak yaparsan o kadar soyut olur)
//3-Absrtract sınıf nesnesi diğerleri gibi oluşturulmaz.
//4-Final metotları olabilir
//5-Kurucu metotlar


//aynı sayfada olduğu için classa public izin verilmez,ama farklı dosyalarda olduğu zaman yazmak gerekir
abstract class SoyutSinif
{
	public SoyutSinif(int a,int b)
	{
		this.a=a;
		this.b=b;
		//final değişjkenini yukarıdaki gibi yazamayız
	}
	
	abstract void Yazdir(); //abstract sınıfta abstract metotu soyutlamak için bu şekilde tanımlanır
	                        //görevi biz veririz ama işlemi yapamayız o yüzden bu şekilde boş bırakılır.
	
	abstract void Yazdir2(int b);
	
	final int c=4;
	int b=4;
	static int d=4;
	int a=5;
	
	void SoyutSinifYazdir()                         //abstract sınıfta hepsi bu şekilde de tanımlanabilir
	{                                               //o zaman abstract sınıf olmasının mantığı kalmaz
		System.out.println("SoyutSinifYazdir");
	}
	
	final int kareAl(int a)
	{
		return (int) Math.pow(a,2);
	}
	
	static String YaziDondur(String str)
	{
		d=3;  //metotumuz static ise değiken static olanlar kullanılabilir sadece
		      //kullanmak farklı yazdırmak farklıdır.
		      //sadece sttaic kullabilirsin ama hepsini yazdırabilirsin
		return str.substring(3);
	}
	
}

class AltSinif extends SoyutSinif
{

	public AltSinif(int a,int b)
	{
		super(a, b);
	}
	
	@Override
	void SoyutSinifYazdir()                         //abstract sınıfta hepsi bu şekilde de tanımlanabilir
	{                                               //o zaman abstract sınıf olmasının mantığı kalmaz
		System.out.println("AltSinif:Soyut sinif Yazdir");
	}
	
	@Override
	void Yazdir() {
		
	}

	@Override
	void Yazdir2(int b) {
		
	}

	
	
}

public class Main {

	public static void main(String[] args) {

		//SoyutSinif s=new SoyutSinif();  abstract sınıf nesnesini bu şekilde oluşturalamaz
		
		AltSinif altSinif=new AltSinif(2, 5);

		System.out.println(altSinif.kareAl(2));
		System.out.println(AltSinif.YaziDondur("YAZILIMCI GENCLER"));
		altSinif.SoyutSinifYazdir();
		
		
	
		
	}

}
