package Nested_Classes;

import java.util.ArrayList;

public class Arac 
{
	static int model=1996;
	//alt classımızı static yaptığımız için değişkeninide static yapmak zorundayız
	
	ArrayList<Sensor> SensorList=new ArrayList<>();
	Sensor sensor;
	Motor motor;
	
	public int SensorSay()
	{
		return SensorList.size();
	}
	
	public void TumSensorleriGoster()
	{
		for (Sensor sensor : SensorList) {
			System.out.println(sensor.fiyat+" "+
		sensor.mensei+" "+sensor.ozellik
		);
		}
	}
	
	public Arac(Sensor sensor,Motor motor) {
		super();
		this.sensor = sensor;
		this.motor=motor;
	}
	
	public void YakitGoster()
	{
		System.out.println(motor.yakit1.yakitTipi+" "+sensor.fiyat+" "+motor.marka);

	}
	
	public void AracOzellikleriniGoster()
	{
		System.out.println(motor.yakit1.yakitAdi+" "+sensor.fiyat+" "+motor.marka);
	}

	public static class Motor
	{
		public static class Yakit
		{
			int fiyat;
			String yakitAdi;
			YakitTipi yakitTipi;
			
			public Yakit(int fiyat, String yakitAdi) {
				super();
				this.fiyat = fiyat;
				this.yakitAdi = yakitAdi;
			}
			
			public Yakit(int fiyat, YakitTipi yakitTipi) {
				super();
				this.fiyat = fiyat;
				this.yakitTipi=yakitTipi;
			}
			
			
		}
		int hacmi;
		int beygir;
		String marka;
		String yakit;
		Yakit yakit1;
		
		public void MotorOzellikleriniGoster()
		{
			System.out.println(model+" "+hacmi+" "+beygir+" "+marka+" "+yakit);
		}
		
		public Motor(Yakit yakit)
		{
			this.yakit1=yakit;
		}
		
		public Motor(Yakit yakit1,int hacmi, int beygir, String marka, String yakit) {
			//super();
			this.hacmi = hacmi;
			this.beygir = beygir;
			this.marka = marka;
			this.yakit = yakit;
			this.yakit1=yakit1;
		}
	}
	
	public static class Sensor
	{
		String ozellik;
		String mensei;
		double fiyat;
		
		public Sensor(String ozellik, String mensei, double fiyat) {
			//super();
			this.ozellik = ozellik;
			this.mensei = mensei;
			this.fiyat = fiyat;
		}
		
		public void SensorOzellikleriniGoster()
		{
			System.out.println(model+" "+ozellik+" "+mensei+" "+fiyat+" ");
		}
		
	}
	
/*	public void MotorCagir(int hacmi, int beygir, String marka, String yakit)
	{
		Motor m=new Motor(hacmi,beygir,marka,yakit);
		m.MotorOzellikleriniGoster();
		
	} */

}
