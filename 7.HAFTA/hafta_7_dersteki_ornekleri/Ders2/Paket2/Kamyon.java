package Paket2;

public class Kamyon extends Tasit
{
	protected int yukKapasite;
	protected int mevcutYuk;
	
	public Kamyon(String marka, int model, String yakit, int kapasite, double kalanYakit, int yukKapasite,
			int mevcutYuk) {
		super(marka, model, yakit, kapasite, kalanYakit);
		this.yukKapasite = yukKapasite;
		this.mevcutYuk = mevcutYuk;
	}
	
	protected void YukEkle(int yeniYuk)
	{
		if(this.mevcutYuk+yeniYuk>this.kapasite)
		{
			System.out.println("UZGUNUM");
			return;
		}
		this.mevcutYuk+=yeniYuk;
	}

}
