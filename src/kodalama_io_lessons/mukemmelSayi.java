package kodalama_io_lessons;

public class mukemmelSayi {

	public static void main(String[] args) {
		int girilenDeger = 10;
		int toplam = 0;
		for (int i = 1; i <= (girilenDeger / 2); i++) {
			if (girilenDeger % i == 0) {
				toplam += i;
			}
		}
		if (toplam == girilenDeger) {
			System.out.println("girdiginiz deger bir mukemmel sayidir");
		} else {
			System.out.println("girdiginiz deger bir mukemmel sayi degildir");
		}

	}

}
