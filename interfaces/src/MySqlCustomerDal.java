public class MySqlCustomerDal implements ICustomerDal,IRepository{//Bir class sadece bir classı extends edebilir
                                                                  //ama bir class birden fazla interface implement edebilir.
    @Override
    public void add() {
       System.out.println("My Sql Eklendi.");
    }
}
