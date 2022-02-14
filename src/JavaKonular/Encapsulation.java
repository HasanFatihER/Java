package JavaKonular;
//Java öğrencileri için notlar

public class Encapsulation {
    public String proje = "Game Air";
    public int butce = 450000;
    private int projeAsgariUcret = 3000;
    private String departman = "Teknoloji";
    private boolean access = true;
    public boolean isAccess() {
        return access;
    }



    protected String getDepartman() {
        return departman;
    }

    public int getProjeAsgariUcret() {
        return projeAsgariUcret;
    }
// Getter ve Setter kullandığımızda tüm sınıflar için artık ulaşılabilir ya da değer atanılabilir hale gelir.


    public static void main(String[] args) {
        /* Access modifierda da görüldüğü üzere datanın erişiminin sınırlandırmaları yapılmaktadır.
        Encapsulation (Datahiding) da erişim sınırlandırma yöntemidir.
        Her şirkette ya da kurumlarda bilmesi gereken prensibi vardır. Her departmanın ya da şahısların
        ulaşabileceği data sınırlıdır. Kimisi datayı düzenler, değiştirir bazıları ise sadece datayı görür.
        */
        /* Methodlar ve variable'lar için encapsulation kullanılabilir..
        Encapsulation2 ve 3  class'larını inceleyiniz.
        */
        Encapsulation obj = new Encapsulation();
        System.out.println(obj.departman);

    }
}
