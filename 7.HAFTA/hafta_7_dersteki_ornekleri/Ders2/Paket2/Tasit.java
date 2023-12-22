package Paket2;

public class Tasit
{
	protected String marka;
	protected int model;
	protected String yakit;
	protected int kapasite;
	public double kalanYakit;
	
	public Tasit(String marka, int model, String yakit, int kapasite, double kalanYakit) {
		super();
		this.marka = marka;
		this.model = model;
		this.yakit = yakit;
		this.kapasite = kapasite;
		this.kalanYakit = kalanYakit;
	}
	
	public double GetKalanYakit()
	{
		return this.kalanYakit;
	}

	private int yukenecekYakitMiktari;
	
	public void YuklenenDegerAl(int yeniYakitMiktari)
	{
		this.yukenecekYakitMiktari=yeniYakitMiktari;
		YakitDoldur();
	}
	
	protected void YakitDoldur() 
	{
		if(this.kalanYakit+this.yukenecekYakitMiktari>this.kapasite)
		{
			this.kalanYakit=this.kapasite;
			return;
		}
		
		this.kalanYakit+=this.yukenecekYakitMiktari;
	}

}
