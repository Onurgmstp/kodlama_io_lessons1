package classes;

public class Classes {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();


        int sayi1= 10;
        int sayi2 = 30;
        sayi2 = sayi1;
        sayi1 =50;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[] {4,5,6};
        sayilar2 =sayilar1;
        sayilar1[0]= 10;
        System.out.println(sayilar2[0]);
    }
}