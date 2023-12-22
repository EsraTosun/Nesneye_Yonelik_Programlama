package Paket2;

public class Otomobil extends Tasit
{
	protected int koltukSayisi;

	public Otomobil(String marka, int model, String yakit, int kapasite, double kalanYakit, int koltukSayisi) {
		super(marka, model, yakit, kapasite, kalanYakit);
		this.koltukSayisi = koltukSayisi;
	}

	
}
