package veri_girisi;

import java.util.ArrayList;

public class math_fonksiyonuı {

	public static void main(String[] args) {
       MathFonksiyonu();
		
	}
	static void MathFonksiyonu()
	{
        System.out.println("Math.PI:"+Math.PI);
		
		int a=10,b=20;
		System.out.println("Math.abs(a-b):"+Math.abs(a-b));
		System.out.println("Math.cos(Math.PI):"+Math.cos(Math.PI));
		System.out.println("Math.cos(Math.PI):"+Math.cos(0));
		System.out.println("Math.cos(Math.PI):"+Math.sin(Math.PI));
		System.out.println("Math.cos(Math.PI):"+Math.sin(90));
		System.out.println("Math.abs(a-b):"+Math.abs(a-b));
		System.out.println("Math.random():"+Math.random());
		
		
		System.out.println("Math.floor:"+Math.floor(2.19123));
		//floor ondalıklı sayıyı üstüne yuvarlar(ondalık ifade olarak yuvarlar)
		
		System.out.println("Math.ceil:"+Math.ceil(2.12123));
		//ceil ondalılı sayıyı altına yuvarlar(ondalık ifade olarak yuvarlar)
		
		System.out.println("Math.round:"+Math.round(2.1219123));
		//round ondalıklı sayıyı 5 ve üzeri ise bir üstüne
		//5 altı ise bir altına tam sayı olarak yuvarlar
		
		System.out.println("Math.log10(100:"+Math.log10(1000));
		System.out.println("Math.sqrt:"+Math.sqrt(8));
		
		ArrayList<Integer> intList=new ArrayList<Integer>();
		
		for(int i=0;i<10;i++)
		{
			int randomVeri=(int) (Math.random()*50)+50;
			//veriyi int değerine döndürmek zorundeyız
			//ve Mart.randomu parantez içine almak zorundayız
			//yoksa hep hangi sayı ile çarpıyorsak o değeri döndürür
			//System.out.println(randomVeri);
			intList.add(randomVeri);
		}
		
		for (Integer integer : intList) 
		{
		System.out.print(integer+"\t");	
		}  
		
	}

}
