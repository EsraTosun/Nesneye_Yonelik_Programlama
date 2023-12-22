package DosyaYazma;

import java.sql.Date;
import java.io.Serializable;

public class Ogrenci implements Serializable
{
	String adi;
	String soyadi;
	int vize;
	int genelNot;
	double ort;
	int numara;
	Date yasi;
	
	Sehir sehir;

	public Ogrenci(String adi, String soyadi, int vize, int genelNot, double ort, int numara,
			Sehir sehir) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
		this.vize = vize;
		this.genelNot = genelNot;
		this.ort = ort;
		this.numara = numara;
		this.yasi = yasi;
		this.sehir = sehir;
	}
	
	
}
