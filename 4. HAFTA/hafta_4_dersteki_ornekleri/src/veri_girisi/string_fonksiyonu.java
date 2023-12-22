package veri_girisi;

public class string_fonksiyonu {
	
	public static void main(String[] args)
	{
		StringFonksiyon();
	}
	
	static void StringFonksiyon()
	{
		String metin1="Yazilim;; muhendisligi; arkadaslari";
		String metin2="Muhendisligi";
		
		String metin3=metin1.concat(" "+metin2);
		//birleştirirken araya yukarıdaki gibi araya boşluk koyabiliriz
		System.out.println(metin3);
		
		System.out.println("metin1.lenght"+metin1.length());
		//metinin boyutunu gösterir
		
		System.out.println("metin1.indexOf:"+metin1.indexOf("1"));
		System.out.println("metin1.index:"+metin1.indexOf("lim"));
		//bulmak istediğimiz ifadenin bağlangıç indexini döndürür.
		System.out.println("metin1.charAt():"+metin1.charAt(0));
		//istenilen indexteki değeri döndürür
		
		for (int i = 0; i < metin1.length(); i++) 
		{
		  System.out.print(metin1.charAt(i)+"\t");	
		}
		
		//ASCII tabloya göre büyüklüklerin farkını buluruz
		System.out.println("\nmetin1.comperateTo:"+metin1.compareTo("Yazilim"));
		System.out.println("metin1.comperateTo:"+metin1.compareTo("Yazilin"));
		System.out.println("metin1.comperateTo:"+metin1.compareTo("Yazili"));
		
		System.out.println("metin1.contains():"+metin1.contains("lir"));
		//olup olmadığını kontrol ederek true yada false değerlerini döndürür
		
		System.out.println("metin1.contentEquals():"+metin1.contentEquals("lim"));
		//başının lim ile başlayıp başlamadığını kontrol eder
		
		System.out.println("metin1.endsWith():"+metin1.endsWith("lim"));
		//sonu lim ile bitip bitmediğini kontrol eder
		
		//işlmi yaptığımızda metine geri atamazsak metin eski halinde kalır
		//güncellenmemiş olur 
		//güncellemek için taptığımız değişikliği atamamız lazım
		System.out.println("metin1.replace():"+metin1.replace(";",""));
		System.out.println(metin1);
		metin1=metin1.replace(";","");
		System.out.println(metin1);
		
		System.out.println("metin1.subString(0,3):"+metin1.substring(0,3));
		System.out.println(metin1);
		
		String[] dizi=metin1.split(";");
		
		for(String string:dizi)
		{
			System.out.print(string+"\t");
		}
		


	}

}
