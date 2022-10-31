package kodalama_io_lessons;

public class sesliHarfler {

	public static void main(String[] args) {
		char girilenDeger = 'b';
		char[] inceHarfler = { 'E', 'e', 'İ', 'i', 'Ö', 'ö', 'Ü', 'ü' };
		char[] kalinHarfler = { 'A', 'a', 'I', 'ı', 'O', 'o', 'U', 'u' };

		for (int i = 0; i < inceHarfler.length; i++) {
			if (girilenDeger == inceHarfler[i]) {
				System.out.println(girilenDeger + " : ince bir harftir");
				break;
			} else if (girilenDeger == kalinHarfler[i]) {
				System.out.println(girilenDeger + " : kalin bir harftir");
				break;
			} else {
				System.out.println("gecersiz deger girdiniz");
				break;
			}
		}

		//////////////////////

		switch (girilenDeger) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalin sesli harf");
			break;
		default:
			System.out.println("Ince sesli harf");
		}
	}
}
