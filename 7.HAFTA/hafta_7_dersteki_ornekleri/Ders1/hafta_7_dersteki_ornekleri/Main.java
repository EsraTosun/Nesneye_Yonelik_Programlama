package hafta_7_dersteki_ornekleri;

import Paket1.*;
//import Paket1.Daire; //sadece daire sınıfına erişim sağlar


public class Main {

	public static void main(String[] args) 
	{
		
      Sekil sekil1=new Sekil(20,50.0);
      sekil1.SekilYazdir(); 
      //prodected olduğu için farklı bir paketten erişmek istediğimiz için erişemeyiz
      //başka bir paketten sadece public olurssa erişebiliriz
      sekil1.setAlan(20); 
  //    sekil1.setCevre(50); //set değişkene değer atamal için
		
      Sekil sekil2=new Sekil(40,60.0);
      sekil2.SekilYazdir(); 
      //prodected olduğu için farklı bir paketten erişmek istediğimiz için erişemeyiz
      //başka bir paketten sadece public olurssa erişebiliriz
      sekil2.setAlan(100);
      
      System.out.println(sekil1.getAlan());
      System.out.println(sekil2.getCevre());  
      
      Daire yeniDaire=new Daire(20,50,2);
      yeniDaire.setR(111);
      System.out.println("yeniDaire.getR()"+yeniDaire.getR());
      yeniDaire.AlanYazdir();
      yeniDaire.setAlan(2);
      
      yeniDaire.AlanYazdir();
	}

}
