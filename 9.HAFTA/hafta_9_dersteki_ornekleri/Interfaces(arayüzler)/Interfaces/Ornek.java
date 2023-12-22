package Interfaces;

interface IVeriTabani
{
	public void Baglan();
	public void Ekle();
	public void Sil();
}

class MSSQL implements IVeriTabani
{

	@Override
	public void Baglan() {
		System.out.println("MSSQL.Baglan()");
		
	}

	@Override
	public void Ekle() {
		System.out.println("MSSQL.Ekle()");
		
	}

	@Override
	public void Sil() {
		System.out.println("MSSQL.Sil()");
		
	}
	
}

class Oracle implements IVeriTabani
{

	@Override
	public void Baglan() {
		System.out.println("Oracle.Baglan()");
		
	}

	@Override
	public void Ekle() {
		System.out.println("Oracle.Ekle()");
		
	}

	@Override
	public void Sil() {
		System.out.println("Oracle.Sil()");
		
	}
	
}

class MySQL implements IVeriTabani
{

	@Override
	public void Baglan() {
		System.out.println("MySQL.Baglan()");
		
	}

	@Override
	public void Ekle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sil() {
		// TODO Auto-generated method stub
		
	}
	
}

class VeriTabaniYonetici
{
	IVeriTabani veriTabani;
	public VeriTabaniYonetici(IVeriTabani veriTabani)
	{
		this.veriTabani=veriTabani;
	
	}
	public void VeriTabaniYonet(IVeriTabani veriTabani)
	{
		if(veriTabani instanceof MySQL)
		{
			((MySQL)veriTabani).Baglan();
			((MySQL)veriTabani).Ekle();
			((MySQL)veriTabani).Sil();
		}
		else if(veriTabani instanceof Oracle)
		{
			((Oracle)veriTabani).Baglan();
			((Oracle)veriTabani).Ekle();
			((Oracle)veriTabani).Sil();

		}
		else if(veriTabani instanceof MSSQL)
		{
			 MSSQL mssql=((MSSQL)veriTabani);
			((MSSQL)veriTabani).Baglan();
			//((MSSQL)veriTabani).Ekle();
			//((MSSQL)veriTabani).Sil();
			mssql.Ekle();
			mssql.Sil();
		}

		
		//veriTabani.Baglan();
		//veriTabani.Ekle();
		//veriTabani.Sil();
	}
}


public class Ornek {

	public static void main(String[] args) {

		IVeriTabani veriTani=new MSSQL();
		
		VeriTabaniYonetici yonetici=new VeriTabaniYonetici(veriTani);
		yonetici.VeriTabaniYonet(veriTani);
	}

}
