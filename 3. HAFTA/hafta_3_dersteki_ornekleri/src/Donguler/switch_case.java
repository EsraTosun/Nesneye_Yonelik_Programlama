package Donguler;

public class switch_case {
	public static void main(String[] args) {
		int haftaninGunleri = 4;
		String strGun = "";

		switch (haftaninGunleri) {
		case 1:
			strGun = "pazartesi";
			break;

		case 2:
			strGun = "sali";
			break;

		case 3:
			strGun = "carsamba";
			break;
			
		case 4:
			strGun = "persembe";
			break;
			
		case 5:
			strGun = "cuma";

		default:
			strGun = "hafta sonu";
			break;
		}
		System.out.println(strGun);
	}
}
