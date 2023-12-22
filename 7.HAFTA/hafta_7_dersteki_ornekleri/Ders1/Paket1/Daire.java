package Paket1;

public final class Daire extends Sekil
{
	
	private final double PI=Math.PI; //sadece yazıldığı classlarda kullanılabilir
	private static int r;

	public Daire(double alan, double cevre,int r) {
		super(alan, cevre); //super=>sekilin constructoru olduğu için alt sınıfında da tanımlamak zorundayız
		//bu ifade gelen veriyi ataya göndermemizi sağlar
		//üst clasda constructor(kurucu method) olduğu için değikenler sadece super ile tanımlanır

		this.r=r;
	}
	
	public void setR(int r)
	{
		this.r=r;
	}
	
	public int getR( )
	{
		return r;
	}
	
	public void AlanYazdir()
	{
		System.out.println(alan);
		System.out.println(PI);
		//PI=3; final=> kullanıldığı için değişkenin değeri değiştiremez
		System.out.println(defaultVeri);
		
		System.out.println(r);
	}
	

}
