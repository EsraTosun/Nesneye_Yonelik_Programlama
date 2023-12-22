package ders2;

import java.util.ArrayList;

public class PasifMusteri extends Musteri
{
	
	public void AktifYap()
	{
	this.AktifMi=true;	
	}
	
	public void HepsiniAktifYap(ArrayList<PasifMusteri> pasifMusteriList)
	{
		System.out.println(this.Adi);
		System.out.println(this.Adi);

		for (PasifMusteri pasifMusteri : pasifMusteriList) {
			pasifMusteri.AktifYap();
		}
	}

	public static void ListeGoster(ArrayList<PasifMusteri> pasifMusteriList)
	{
		for (Musteri pasifMusteri : pasifMusteriList) {
			System.out.println(pasifMusteri.Adi+"\t"+pasifMusteri.Soyadi+"\t"+pasifMusteri.FaturaTutari);
		}
	}
}
