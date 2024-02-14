//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number=49;
        int total=0;
        for(int i=1;i<number;i++){
            if(number%i==0)
                total+=i;
        }
        if(number==total)
            System.out.println("Sayı bir mükemmel sayıdır.");
        else
            System.out.println("Sayı bir mükmmel sayı değildir.");
    }
}