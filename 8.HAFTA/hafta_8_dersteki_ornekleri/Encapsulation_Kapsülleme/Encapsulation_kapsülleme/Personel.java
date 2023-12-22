package Encapsulation_kapsülleme;

//read-only olarak bizden yazmamızı isterse sadece okumamız ister(getleri yazarız), setler yazılmaz
//write-only olarak bizden yazmamızı isterse sadece yazmamızı ister(setler yazarız),getler yazılmaz

public class Personel {
	
		private int yasi;
		private String adi;
		private double maas;
		
		//AYNI paket içinde encapsulation yapmak istiyorsan private yapmak zorundayız
	    
		public Personel(int yasi) 
		{
			this.yasi=yasi;
		}

		public int getYasi() {  //OKUMA
			return yasi;
		}

		public void setYasi(int yasi) {  //YAZMA
			this.yasi = yasi;
		}

		public String getAdi() {
			return adi;
		}

		public void setAdi(String adi) {
			this.adi = adi+" yilmaz"; //STringin üzerine ekleme yaparken bu şekilde yapılabilir
		}

		public double getMaas() {
			return maas*1.1;
		}

		public void setMaas(double maas) {
			this.maas = maas;
			System.out.println(maas);
		}
		
	




}
