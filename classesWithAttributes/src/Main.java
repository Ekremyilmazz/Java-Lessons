//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Product product=new Product(1,"Laptop","HP Laptop",35000,5,"Beyaz");

/*     product.setId(1);
     product.setName("Laptop");
     product.setDescription("HP Laptop");
     product.setPrice(35000);
     product.setStockAmount(5);
     product.setRenk("Beyaz");*/


     ProductManager productManager=new ProductManager();
     productManager.Add(product);

     System.out.println(product.getRenk()); //getkodu sadece getter metodu ile okuma

    }
}