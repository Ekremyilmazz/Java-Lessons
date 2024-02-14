public class Employer {
    private String name;
    private double salary;

    public Employer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showResult() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
