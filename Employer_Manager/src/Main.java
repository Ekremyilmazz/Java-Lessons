//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employer employer1 = new Employer("Ekrem", 27000.0);
        Manager manager1 = new Manager("Ali", 25000.0, "IT");

        employer1.showResult();
        System.out.println("------------");
        manager1.showResult();
    }
}