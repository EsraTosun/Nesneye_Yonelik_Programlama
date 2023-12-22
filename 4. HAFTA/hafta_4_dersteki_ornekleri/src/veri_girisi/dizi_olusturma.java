package veri_girisi;

public class dizi_olusturma {

	public static void main(String[] args) {
        DiziOlusturma();
	}
	
	static void DiziOlusturma()
	{
        int[] dizi1=new int[5];
 		
		for(int i=0;i<dizi1.length;i++)
		{
			dizi1[i]=(i+1)*10;
		}
		
		for(int i=0;i<dizi1.length;i++)
		{
			System.out.println(dizi1[i]);
		}

		String[] dizi=new String[5];
		
		for(int i=0;i<dizi.length;i++)
		{
			dizi[i]="a"+"\t";
		}
		
		for(int i=0;i<dizi.length;i++)
		{
			System.out.println(dizi[i]);
		}
	}

}
