public class Manager extends Employer{
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void showResult() {
        super.showResult();
        System.out.println("Department: " + department);
    }
}
