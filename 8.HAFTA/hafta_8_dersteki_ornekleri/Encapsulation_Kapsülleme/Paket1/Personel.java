package Paket1;

public class Personel {
	
	protected int yasi;
	protected String adi;
	protected double maas;
	
	//FARKLI paketler içinde Encapsulation yapmak istiyorsak protected kullanılır
    
	public Personel(int yasi) 
	{
		this.yasi=yasi;
	}

	public int getYasi() {  //EKLEME
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

