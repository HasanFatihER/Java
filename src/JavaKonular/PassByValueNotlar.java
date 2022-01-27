package JavaKonular;



import java.util.ArrayList;
import java.util.List;

public class PassByValueNotlar<indirimYap> {
    /* Java passByValue dur. Aşağıdaki eticaret sitesi indirim örneğini inceleyelim */

    static double urunFiyati = 250;
    // PassByValue da methoda gönderilen urunFiyati datası değil değeridir. Bu sebeple
    // fiyattaki method içindeki değişiklik gerçek fiyatı etkilemez.



    public static void main(String[] args) {
        System.out.println("%10 indirim yapıldı : "+ indirimYap10(urunFiyati));
        System.out.println("Fiyat : "+urunFiyati);
        System.out.println("%20 indirim yapıldı : "+ indirimYap20(urunFiyati));
        System.out.println("Fiyat : "+urunFiyati);

        ///---------------******************************************---------------///
        // List ve Arrayleriçin de geçerlidir. Sadece dikkat edilmesi gerekem husus şudur.
        // Listenin elemanlarında değişiklik yapılabilir fakat liste değişmemez. Aşağıdaki örneği inceleylim.

        List<String> liste =new ArrayList<>();
        liste.add("Ahmet");
        liste.add("Mehmet");
        liste.add("Cemal");
        System.out.println(liste);
        System.out.println(isimDegistir(liste));

        /* Burada 0.indexteki ismin değiştiğini görüyoruz.
        Yukarıdaki mantıkla değişmemesi gerekir gibi yanlış düşünceye kapılabilirsiniz. Değişen
        değerdir. Liste değişmez. Devamını inceleyiniz.
        */
        System.out.println(liste); // Listenin son hali
        System.out.println(isimDegistirYeni(liste));
        System.out.println(liste);  // Burada görüldüğü gibi method içinde yeni liste oluşturmamıza rağmen
        // son hali yine eski listedir. Bu da Java passByValue nun kanıtıdır.
    }

    private static List isimDegistirYeni(List<String> liste) {
        liste=new ArrayList<>();
        liste.add("Kemal");
        liste.add("Mahmut");
        liste.add("Ömer");
        return  liste;
    }

    private static List isimDegistir(List<String> liste) {
        liste.set(0,"Hasan");
        return liste;
    }

    ////--------------/-*-*********************-*-*/////////////////////////
    public static double indirimYap10(double urunFiyati){
        urunFiyati=0.90*urunFiyati;
        return urunFiyati;
    }
    public static double indirimYap20(double urunFiyati){
        urunFiyati=0.80*urunFiyati;
        return urunFiyati;
    }




}
