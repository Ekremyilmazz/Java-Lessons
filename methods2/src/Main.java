//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel.";
        String yeniMesaj=sehirVer();
        System.out.println(yeniMesaj);
        System.out.println(topla(2,3));
        System.out.println(topla2(2,3,4,5,8));
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return  sayi1+sayi2;
    }
    public static int topla2(int... sayilar){   //variable arguments
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "İstanbul";
    }
}