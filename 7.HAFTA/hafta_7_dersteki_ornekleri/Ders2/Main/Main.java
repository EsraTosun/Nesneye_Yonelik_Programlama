package Main;

import Paket2.*;



public class Main {

	public static void main(String[] args) {

		Otomobil yeniOto=new Otomobil("sahin", 1995, "LPG", 20,12, 5);
		//otomobil tasit olabilir
		//ama tasit otomobil olamaz
		
		Tasit yeniTasit=yeniOto;
		
		System.out.println(yeniOto.GetKalanYakit());
		yeniTasit.YuklenenDegerAl(3);
		System.out.println("yeniTasit.kalanYakit:"+yeniTasit.kalanYakit);
	}

}
