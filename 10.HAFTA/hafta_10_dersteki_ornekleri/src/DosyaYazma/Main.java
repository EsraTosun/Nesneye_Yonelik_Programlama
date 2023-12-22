package DosyaYazma;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

//SERİALİZATİON ve DESERİALİZATİON: Bir nesnenin durumunu bir bayt akışına yazma mekanizmasıdır.Esas olarak Hibernate,RMI,JPA,EJM ve JMS teknolijileri kullanılır.
//Serileştirmenin ters işlemi, bayt akışının bir nesneye dönüştürüldüğü seri kaldırma(DESERİALİZATİON) olarak adlandırılır.
//esas olarak ağdaki nesnenin durumunu dolaşmak için kullanılır.

public class Main {
	
	static String fileName="file.txt";
	
	static void DosyayaYaz(ArrayList<Ogrenci> ogrList) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("file.txt");
		ObjectOutputStream out=new ObjectOutputStream(fos);
		
		out.writeObject(ogrList);
		out.close();
		fos.close();
	}
	
	static void CokluOku() throws IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream in=new ObjectInputStream(fis);
		ArrayList<Ogrenci> ogrList=(ArrayList<Ogrenci>) in.readObject();
		
		//Ogrenci ogr1=(Ogrenci) in.readObject();
		
		for (Ogrenci ogr : ogrList) {
			System.out.println(ogr.adi+" "+ogr.soyadi+" "+ogr.numara+" "+
					ogr.sehir);
		}
		
	}
	

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		//KOLAY YOL İLE DOSYA YAZMA
		/* FileWriter writer=new FileWriter("dosya.txt");
		writer.write("Esra Tosun\n");
		writer.write(String.valueOf(10));
		
		for(int i=0;i<10;i++)
		{
			writer.write(String.valueOf(i));
		}
		
		writer.append("esra",0,0); //Sorgulama
		writer.close();  */
		
		
		//SERİALİZATİON YOLU İLE DOSYA YAZMA
		Ogrenci ogr=new Ogrenci("ahmet", "yilmaz",20,50,(20+50)/2,21122000,Sehir.ANKARA);
		Ogrenci ogr2=new Ogrenci("ali", "yilmaz",20,50,(20+50)/2,21122000,Sehir.ANKARA);
		Ogrenci ogr3=new Ogrenci("veli", "yilmaz",20,50,(20+50)/2,21122000,Sehir.ANKARA);
		Ogrenci ogr4=new Ogrenci("ayse", "yilmaz",20,50,(20+50)/2,21122000,Sehir.ANKARA);
		Ogrenci ogr5=new Ogrenci("zeki", "yilmaz",20,50,(20+50)/2,21122000,Sehir.ANKARA);
		
		ArrayList<Ogrenci> list=new ArrayList<>();
		
		list.add(ogr);
		list.add(ogr2);
		list.add(ogr3);
		list.add(ogr4);
		list.add(ogr5);


		
		/*Date tarih=new Date(2022,10,1);
		System.out.println(tarih.toLocalDate());
		
		FileOutputStream fos=new FileOutputStream("file.txt");
		ObjectOutputStream out=new ObjectOutputStream(fos);
		
		out.writeObject(ogr);
		out.close();
		fos.close();  */
		
		//DosyayaYaz(ogr);
		DosyayaYaz(list);
		CokluOku();
		
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream in=new ObjectInputStream(fis);
		
		//Ogrenci ogr1=(Ogrenci) in.readObject();
		
		//System.out.println(ogr.adi+" "+ogr.soyadi+" "+ogr.numara+" "+
		//ogr.sehir);
		
		
		
		
	}

}








