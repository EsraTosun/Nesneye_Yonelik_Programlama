package hafta_3_calisma_sorulari;

public class ardisik_sayilar_ile_ucgen {

	public static void main(String[] args) {

		int m=0,l=1;
		for(int i=1;i<8;i=i+2)
		{

			for(int k=i;k<=i+m;k++)
			{
				System.out.print(l+" ");
				l++;
			}
			m++;
			System.out.println();
		}
	}

}
