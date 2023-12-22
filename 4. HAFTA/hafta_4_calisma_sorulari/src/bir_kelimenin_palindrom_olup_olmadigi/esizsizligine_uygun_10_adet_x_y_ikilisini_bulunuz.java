package bir_kelimenin_palindrom_olup_olmadigi;

import java.util.ArrayList;

public class esizsizligine_uygun_10_adet_x_y_ikilisini_bulunuz {

	public static void main(String[] args) 
	{

	     ArrayList<Integer> Listx=new ArrayList<Integer>() ;
	     ArrayList<Integer> Listy=new ArrayList<Integer>() ;
	     
	     int sayac=0;

		// 𝜋√𝑥∗𝑦 > 𝑥 ∗ 𝐿𝑜𝑔𝑦 eşitsizliğine uygun 
		// x, y > 10 olacak şekilde 10 adet x, y ikilisi bulunuz.
		
		for(int x=11;x<1000;x++)
		{
			for(int y=11;y<15;y++)
			{
				if((Math.PI*Math.sqrt(x*y))>x*Math.log(y))
				{
					Listx.add(x);
					Listy.add(y);
					sayac++;
				}
				if(sayac==10)
					break;
			}
			if(sayac==10)
				break;

		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println(Listx.get(i)+"\t"+Listy.get(i)+"\n");
		}
	}

}
