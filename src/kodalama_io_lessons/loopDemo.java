package kodalama_io_lessons;

public class loopDemo {

	public static void main(String[] args) {
		//for
		for (int i = 2; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		
		int i =1;
		//while
		while (i<10) {		
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		
		//do-while
		do {
			System.out.println(i);
			i+=3;
		}while(i<10);
		System.out.println("Do-While Döngüsü Bitti");
	}
	
}

