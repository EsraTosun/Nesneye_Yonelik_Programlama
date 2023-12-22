package Nested_Classes;

import java.util.ArrayList;

import Nested_Classes.Arac.Motor.Yakit;

//Nested Classes(İç içe sınıflar)
//Sınıfları ve arabirimleri daha okunabilir ve bakım yapılabilir şekilde tek bir yerde 
//mantıksal olarak gruplandırmak için iç sınıflar kullanılır

//Ek olarak, özel veri üyerleri ve yöntemleri dahil olmak üzere dış sınıfn tüm üyelerine erişebilir.

//YAPISI AŞAĞIDAKİ GİBİDİR
/* class Jaca_Onder_class{
  class  Java_Inner_class{
  }
 }
 */

//İç sınıfların üç avantajı vardır
//1- İç sınıflar,özel sınıf da dahil olmak üzere dış sınıfın tüm üyelerine(veri üyeleri ve yöntemleri) erişebilen
//belirli bir ilişki türünü temsil eder
//2-İç sınıflar, mantıksal  olarak sınıfları ve arabirimleri yalnızca tek bir yerde gruplandığı için 
//okunabilir ve korubalir kod geliştirmek için kullanılır
//3-Kod Optimizasyonu: Yazmak için daha az kod gerektirir.

//Nested class: İç içe sınıflar static yapıdaıdr
//Inner class: İç sınıflar static olmayan Yapılardır

//ENUM KAVRAMI
//public enum Tip{Doğu,Bati,Kuzey,Guney}


public class Main {

	public static void main(String[] args) 
	{
		//Arac.Motor motor=new Arac.Motor(); içerdeki class static olmadığı için direk çağırılamaz
		
		//Arac a=new Arac();  //sınıfın içinden alt sınıfı çağırmak mantılı değildir o yüzden alt classları static yapmalıyız
		//a.MotorCagir(30,500,"honda", "benzin");
		
		Arac.Motor.Yakit yakit=new Yakit(12,"LPG");
		Arac.Motor motor=new Arac.Motor(yakit,30,500,"honda", "benzin"); //classı static yaptığımız için direk çağırabiliriz
		motor.MotorOzellikleriniGoster();
		Arac.Sensor sensor=new Arac.Sensor("park sensoru","maleszya",12.5);
		sensor.SensorOzellikleriniGoster();
		
		Arac a=new Arac(sensor,motor);
		a.AracOzellikleriniGoster();
		
		a.AracOzellikleriniGoster();
		
		Arac.Motor.Yakit yakit1=new Arac.Motor.Yakit(12,YakitTipi.LPG);
		a.YakitGoster();
		
		Arac.Sensor sensor1=new Arac.Sensor("park sensoru","maleszya",12.5);
		Arac.Sensor sensor2=new Arac.Sensor("park sensoru","maleszya",12.5);
		Arac.Sensor sensor3=new Arac.Sensor("park sensoru","maleszya",12.5);
		Arac.Sensor sensor4=new Arac.Sensor("park sensoru","maleszya",12.5);
		Arac.Sensor sensor5=new Arac.Sensor("park sensoru","maleszya",12.5);
		
	    a.SensorList.add(sensor1);
	    a.SensorList.add(sensor2);
	    a.SensorList.add(sensor3);
	    a.SensorList.add(sensor4);
	    a.SensorList.add(sensor5);
	    
	    System.out.println("sensor adet "+a.SensorSay());
	    a.TumSensorleriGoster();


				
				

		
		
		

	}

}









