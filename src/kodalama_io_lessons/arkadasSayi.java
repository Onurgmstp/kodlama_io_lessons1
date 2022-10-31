package kodalama_io_lessons;

public class arkadasSayi {

	public static void main(String[] args) {
		int say1 = 220;
		int say2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		for (int i = 1; i <= (say1 / 2); i++) {
			if (say1 % i == 0) {
				toplam1 += i;
			}
		}
		for (int j = 1; j <= (say2 / 2); j++) {
			if (say2 % j == 0) {
				toplam2 += j;
			}
		}
		if (toplam1 == say2) {
			System.out.println("girilen sayilar arkadas sayilardir");
		} else if (toplam2 == say1) {
			System.out.println("girilen sayilar arkadas sayi degildir");
		}
	}

}
