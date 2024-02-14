//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String[] ogrenciler=new String[4];
       ogrenciler[0]="Ekrem";
       ogrenciler[1]="Ahmet";
       ogrenciler[2]="Süleyman";
       ogrenciler[3]="Sena";

       for(int i=0;i<ogrenciler.length;i++){
           System.out.println(ogrenciler[i]);
       }
       System.out.println("--------------------");
       for(String ogrenci:ogrenciler) // yukarıdaki for dööngüsüyle aynıdır.
           System.out.println(ogrenci);

    }
}