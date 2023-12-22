package Interfaces;

//Arayüzler(ınterfaces)- yapısal olarak soyut sınıflara benzemektedir
//Arayüzler, sınıfların bbir görevi nasıl yapılacağını değil,görev yapılırken hangi adımları yapması gerektiğini belirtir
//Arayüzler ile soyut sınıflar arasındaki temel fark;soyut sınıflarda her metot override edilmek zorunda değildir
//Arayüzler içinde tanımlanan her metot, kullanılan sınıflarda mutlaka override edilmelidir
//Arayüzler sayesinde çoklu kalıtım işkemini gerçekleştirebiliriz
//Arayüzler,karmaşık tasarımları parçalama ve nesneler arasındaki bağımlılıları temizleme işlevi görür
//Arayüzler,uygulamyı gevşek bir şekilde birleşitirilir
//Arayüzler de sınıflardaki gibi genişletilebilir(extends).
//Arayüz dış dünyaya yapılacak hizmetleri sunar/söyler. Nasıl kullanılır kısmını arayüzü kullanan alt sınıflar belirler.
//  Kullanıcı hangi üst sınıf olduğunu bilmek zorunda kalmaz.Böylece esneklik ve sisteme kullanıcları etkilemeden değişiklik
//  sağlar. Servis sunucu ve sağlayıcı arasında bağımlılık azaltır

interface IMotor
{
	public void MotorGucuGoster();
}

interface IArac
{
	int hiz=50;
	double fiyat=0;
	String model="";
	
	public void AracSur();
	public void Dur();
	public void Hizlan(int hiz);
	public void ModelGoster(String model);
	public double FiyatGoster(double guncelFiyat);
	static void YilGoster()  //static olduğu için interface içinde bu şekil kullanılabilir.
	{
		System.out.println("aa");
	}
	
}

class Volvo implements IArac,IMotor
{
	int hiz=50;
	double fiyat=0;
	String model="";
	
	public Volvo(int hiz,double fiyat,String model)
	{
		this.fiyat=fiyat;
		this.hiz=hiz;
		this.model=model;
	}
	
	public void OtomatikKapiAc()
	{
		System.out.println("volvo.OtomotikKapiAc()");
	}
	
	@Override
	public void AracSur() {
		System.out.println("volvo.aracSur()");
	}

	@Override
	public void Dur() {
		System.out.println("volvo.dur()");
	}

	@Override
	public void Hizlan(int hiz) {
		this.hiz+=hiz;
		System.out.println("volvo.aracSur()"+this.hiz);
	}

	@Override
	public void ModelGoster(String model) {
		System.out.println("volvo.model()"+model);

	}

	@Override
	public double FiyatGoster(double zamOrani) {
		this.fiyat*=(1+zamOrani);
		return fiyat;
	}

	@Override
	public void MotorGucuGoster() {
		
	}

	
	
	
}

class Sahin implements IArac,IMotor
{
	int hiz;

	@Override
	public void AracSur() {
		System.out.println("sahin.aracSur()");
		
	}

	@Override
	public void Dur() {
		System.out.println("sahin.dur()");

	}

	@Override
	public void Hizlan(int hiz) {
		this.hiz+=hiz;
		System.out.println("sahin.hizlan():"+this.hiz);
	}

	@Override
	public void ModelGoster(String model) {
		
	}

	@Override
	public double FiyatGoster(double guncelFiyat) {
		return 0;
	}

	@Override
	public void MotorGucuGoster() {
		System.out.println("sahin.motorGucuGoster()");
		
	}
	
}

public class Main {

	public static void main(String[] args) {

		Volvo volvo=new Volvo(40, 120000, "x1");
		volvo.Dur();
		System.out.println(volvo.FiyatGoster(0.4));
		volvo.Hizlan(20);
		
		Sahin sahin=new Sahin();
		sahin.hiz=40;
		sahin.Hizlan(20);
		sahin.MotorGucuGoster();
		
	}

}
