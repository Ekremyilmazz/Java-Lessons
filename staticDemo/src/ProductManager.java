import javax.xml.validation.Validator;

public class ProductManager {
    public void add(Product product){
       if(ProductValidator.isValid(product)){  //static metodu class ismiyle çağırır.(Sadece bir defaya mahsustur
           System.out.println("Ürün eklendi"); //başka bir metodu çağırmak için classı newlememiz gerekir.
       }else{
           System.out.println("Üürn bilgileri geçersiz");
       }
     ProductValidator productValidator=new ProductValidator();//yapıcı bloklar newleyince çalışırlar.
       productValidator.bisey();

    }
}
