package methods;

public class Methods2 {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println (yeniMesaj);
        int sayi = topla (15, 7);
        int sayi2 = topla2(2,34,45,6);
        System.out.println (sayi);
        System.out.println (sayi2);
    }
    public static void ekle () {
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle() {
         System.out.println("Güncellendi");
    }
    public static int topla (int say1,int say2) {
        return 5;
    }
    public static String sehirVer() {
        return "Ankara" ;
    }

    //variable arguments
    public static int topla2(int... sayilar){
        int toplam = 0;
        for( int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
