//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
         System.out.println("Sayı mevcuttur.");
     else
         System.out.println("Sayı mevcut değildir.");

    }
}