package kodalama_io_lessons;

public class arrayDemo {

	public static void main(String[] args) {
		String ogrencil = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";
		
		System.out.println (ogrencil);
		System.out.println (ogrenci2);
		System.out.println (ogrenci3);
		System.out.println (ogrenci4);
		 
		System.out.println("------------------");
		 
		String[] ogrenciler = new String[5];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		ogrenciler[4] = "Ali";
		
		
		for (int i=0; i < ogrenciler.length ; i++) {
			System.out.println(ogrenciler[i]);
		}
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
