//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //for
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("Döngü bitti");

        //while
        int i=1;
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("Döngü bitti");

        //do-while döngüsü
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
    }
}