package Istisna_Yonetimi;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Ogrenci
{
	String adi;
}

public class Main {
	

	public static void main(String[] args) 
	{
		//run time hatası
		//logging(bir sistemin verilerin kaydoldugu yerdir. )  ???????????
		//SADECE exception en sonlara yazılır diğerlerin belli bir sırası yok rasgele yazılabilir
		
		
		try 
		{
				
		}catch (ArithmeticException e)  // AritmeticException özel hata olduğu için exceptiondan once yazilir,yoksa hata alır
			{
				String str=e.toString();  //hatanın ne olduğunu ve yerini söyler
				System.out.println("ARITMETIK HATA");			
				

			} 
		try{
			int a=1;
			int b=2;
			
			/*if(b==0)
				throw new ArithmeticException("SIFIRA BOLEMEZSIN ");  */
			int c=a/b;
			
			int dizi[]=new int[5];
			//dizi[-1]=123;  //BU HATA ONEMLI ÇOK ALIRIZ
			
			String str="merhaba";
			char ch=str.charAt(str.length());
			
			Integer intVeri=Integer.valueOf("12.33A");
			
			FileReader file=new FileReader("abc.txt");
			file.read();
			
			Object dizi2[]=new Double[3];
			Integer intdata=10;
			dizi[2]=intdata;
			
			Object sayi=10;
			String str1=(String) sayi;
			
			Ogrenci ogr=null;
			ogr.adi="ahmet";
			
		
			
		}catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("STRING KARAKTER SORUNUN VAR SENIN");
		} catch (NumberFormatException e) 
		{
			System.out.println("BOYLE SAYİ GİRİSİ Mİ OLUR");
		} 
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e)  // AritmeticException özel hata olduğu için exceptiondan once yazilir,yoksa hata alır
		{
			System.out.println("ARITMETİK YADA INDEX TASTI HATASI");			
		}catch (ArrayStoreException e) 
		{
			System.out.println("dizi depolama sorunumuz var");
		} catch (ClassCastException e) 
		{
			System.out.println("tur degisme hatasi verir");
		} catch (NullPointerException e) 
		{
			System.out.println("Null hatasi ");
		}catch (FileNotFoundException e) 
		{
			System.out.println("Dosya yok");
		} catch (Exception e)  //Exception=> genel hatadir FİNALLY den once yazılmak zorunda
		{
			// e.printStackTrace(); 0> hatayı doğrudan yakalamamızı sağlar
			String str=e.getLocalizedMessage();  //hatanın ne olduğunu söyler
			System.out.println(str);
			
			str=e.toString();  //hatanın ne olduğunu ve yerini söyler
			System.out.println(str);
			
			e.getStackTrace();	

		}finally  //her durumda finally içine girer(hata olsa da olmasa da)  EN SONA yazılır
		{
			System.out.println("finally");
			
			try {
				int bb=1/0;
			} catch (Exception e2) {
				System.out.println(e2.getMessage());

			}
		}
		

	}

}


//Spıng Boot
//darknet


//SINAV
//POLYMORPHİSM ÇOK ÖNEMLİ
//OVERRİDE VE OVERLOADİNG FARKI NELERDİR
//ABSTRACTİON ÇOK ÇOK ÖNEMLİ BUNU TAMAMEN 
//ÖZELLİKLERİNİ DE ÖĞREN
//ABSTRACT VE INTERFACE FARKI
//SERİALİZATİON
//DESERİALİZATİON

//5 SORU
//BİR SENORYAYA GORE 4 FARKLI BAŞLIKTAN SORULAR OLABİLİR
//KALITIM 
//İÇ İÇE SINIFLAR
//İNTERFACE
//ABSTRACT
//KLASİK SORU OLACAK
//SINIFIN NULLL OLMA DURUMU HATALAR KLASİK SORU OLARAK GELEBİLİR













