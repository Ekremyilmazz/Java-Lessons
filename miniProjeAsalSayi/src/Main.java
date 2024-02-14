//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number=1;
        int reminder=number%2;
        System.out.println(reminder);
        boolean isPrime=true;
        if(number==1){
            System.out.println("Sayı asal sayı değildir.");
            return;
        }
        if(number<1){
            System.out.println("Geçersiz sayı");
        }

        for(int i=2; i<number;i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime);
    }
}