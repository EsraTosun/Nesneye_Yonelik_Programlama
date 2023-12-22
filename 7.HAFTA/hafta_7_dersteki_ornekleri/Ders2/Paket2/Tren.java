package Paket2;

public class Tren extends Tasit
{
	private boolean yolcuTreniMi;
	protected int vagonSayisi;

	public Tren(String marka, int model, String yakit, int kapasite, double kalanYakit, boolean yolcuTreniMi,
			int vagonSayisi) {
		super(marka, model, yakit, kapasite, kalanYakit);
		this.yolcuTreniMi = yolcuTreniMi;
		this.vagonSayisi = vagonSayisi;
		this.YakitDoldur();
	}
	
	public void Vagonkle(int vagonSayisi)
	{
		this.vagonSayisi+=vagonSayisi;
	}
	

}
