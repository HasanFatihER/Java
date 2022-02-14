package JavaKonular;



// Aynı package'ta bir class
public class Encapsulation2 {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        System.out.println(obj.proje);
        System.out.println(obj.butce);
        obj.butce = 430000;
        System.out.println(obj.butce);
        /* Access modifier ile erişiyorsam değiştirebilirim. Datayı private olarak tanımlarsan
         buradan ulaşamayız. Datyı korumuş oluruz fakat dataya ulaşım sağlayamamış oluruz.
         Bundan dolayı encapsulation kullanılır.*/
        System.out.println(obj.getProjeAsgariUcret());
       /* obj.projeAsgariUcret=4000;  private olduğu için ulaşamayız. obj.getProjeAsgariUcret()
        üzerinden ulaşabiliriz. */

        /* Encapsulation'ı datayı private yapıp getter ve setter methodlarını kullanarak yapıyoruz.*/

        System.out.println(obj.getDepartman());
        System.out.println(obj.isAccess());

    }
}
