//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//       OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
//      System.out.println(ogretmenKrediManager.hesapla(200));

        BaseKrediManager[] krediManagers=new BaseKrediManager[]
                {new BaseKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};
        for(BaseKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(200));
        }
    }
}