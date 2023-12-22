package Polymorphism_CokBicimlilik;


class Personel {
	
	protected int yasi;
	protected String adi;
	protected double maas;
	
    
	public Personel(int yasi,double maas,String adi) 
	{
		this.yasi=yasi;
		this.maas=maas;
		this.adi=adi;
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
	
	public double MaasHesapla(int artisMiktari)
	{
		return this.maas*1.1;
	}
	





}

