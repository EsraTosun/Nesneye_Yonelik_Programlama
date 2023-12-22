package ders2;

import java.util.ArrayList;

public class AktifMusteri extends Musteri
{
	public int Bonus;
	
	public AktifMusteri()
	{
		this.Bonus=20;
		System.out.println(this.Adi+" "+this.Soyadi);
	}
	
	public void PasifYap(/*AktifMusteri m*/)
	{
		System.out.println(this.Adi);
		System.out.println(this.AktifMi);
		this.AktifMi=false;
		//m.AktifMi=false;
	}
	
	public static void ListeGoster(ArrayList<AktifMusteri> aktifMusteriList)
	{
		for (AktifMusteri aktifMusteri : aktifMusteriList) {
			//aktifMusteri.Bonus; aktif musteriyi musteri olarak tanımlasaydık
			//bonus değişkenin ulaşamayacaktır
			System.out.println(aktifMusteri.Adi+"\t"+aktifMusteri.Soyadi+"\t"+aktifMusteri.FaturaTutari);
		}
	}

}
