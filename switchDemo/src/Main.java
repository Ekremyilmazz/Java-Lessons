//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel, geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel,geçtiniz");
                break;
            case 'C':
                System.out.println("İyi geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil, geçtiniz");
                break;
            case 'F':
                System.out.println("Kötü,kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}