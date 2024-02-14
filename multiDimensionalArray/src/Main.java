//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String [][] sehirler=new String[3][3];

        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Ankara";
        sehirler[0][2]="Adana";
        sehirler[1][0]="Kars";
        sehirler[1][1]="Siirt";
        sehirler[1][2]="Manisa";
        sehirler[2][0]="Antalya";
        sehirler[2][1]="Eskişehir";
        sehirler[2][2]="Bayburt";

        for(int i=0;i<=2;i++){
            System.out.println("------------");
            for(int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}