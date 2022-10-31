package kodalama_io_lessons;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int numberEntered = 10;
		int result;
		boolean boolValue = false;
		boolean isPrime = true;

		if (numberEntered == 1) {
			System.out.println("Asal değil");
		} 
		else if (numberEntered <= 0) {
			System.out.println("0 ve 0'dan küçük sayılar asal sayı olamazlar.");
		}
		for (int i = 2; i < numberEntered; i++) {
			result = numberEntered / i;
			if (result * i == numberEntered) {
				boolValue = true;
			}
		}
		if (boolValue) {
			System.out.println("Sayi Asal Değil");
		} else {
			System.out.println("Sayi Asal");
		}
		
		////////////////////////////////////////

		for (int i = 2; i < numberEntered; i++) {
			if (numberEntered % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayi Asal");
		} else {
			System.out.println("Sayi Asal Değil");
		}
	}

}
