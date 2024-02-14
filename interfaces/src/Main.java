//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // ICustomerDal customerDal=new OracleCustomerDal(); // interfaceler referans tutucu görevi görürler.
        CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
    //    customerManager.customerDal=new OracleCustomerDal();
        customerManager.Add();
    }
}