public class ProductValidator {    //javada ana class static olamıyor

    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
//    public ProductValidator(){
//        System.out.println("Yapıcı blok çalıştı");
//    }
     public static boolean isValid(Product product){  //bir metodu static yaptığımızda direk class ismiyle çağrılır.
         if(product.price>0 && !product.name.isEmpty()){
             return true;
         }else{
             return false;
         }

     }
     public void bisey(){
     }

    /* public static class BaskaBirClass {  //ama inner classta static ifadesi kullanılabilir.
        public static void sil(){

        }
     }*/
}
