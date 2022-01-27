package JavaKonular;



import java.util.Arrays;

public class StringMethodlar
{
    public static void main(String[] args) {

        // split() : split() methodu String i parçalara ayırır ve Array e çevirir.

        // ****************************************************************** //
        String isim="Hasan";
        String [] harfler =isim.split("a"); // a lara göre parçala demektir.
        // Bunun gibi düşünebilirsiniz.
        String [] isimler={"ali","veli","hayri","hüsamettin"};
        System.out.println(Arrays.toString(harfler));
        // ******Ya DA ****** //
        System.out.println(Arrays.toString(isim.split("a"))); // şeklinde yazılabilir.


        // replaceAll() : içerisine yazdığımız harf ya da String in olduğu yerlere yine içerisne
        // yazdığımız harf ya da Stringe çevirir. Özetle şunu gördüğün yerlere şunu yaz gibi.

        //*****************************************************************//

        System.out.println(isim.replaceAll("sa","kaldı"));
        String yeniAd=isim.replaceAll("sa","kaldı"); /// şeklinde atama yapalım
        //Atama yapılayan her bilgi java da askıda kalır.
        System.out.println(isim);  //  Yukarıda yapılan tüm değişiklikler atama yapılmadığı için sadece
        // o an bize değer olarak görünür. Bunu da tekrar etmiş olalım.

        //*****************************************************************//

        // replace() :

    }
}
