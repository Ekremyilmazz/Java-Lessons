//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] sayilar= {1,5,9,7,12};
        int aranacak=12;
        boolean varMi=false;

        for(int sayi:sayilar){
            if(sayi==aranacak) {
                varMi = true;
                break;
            }
        }
        if(varMi)
            mesajVer("Sayı mevcuttur: "+aranacak);
        else
            mesajVer("Sayi mevcut değildir: "+aranacak);
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}