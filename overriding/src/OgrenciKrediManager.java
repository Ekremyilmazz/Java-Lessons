public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar){     //Override edilidi
        return tutar*1.10;                   //Override edilmesini istemiyorsak burdaki metodun önüne(final double
    }                                        //şeklinde) final ifadesi yazılır.
}
