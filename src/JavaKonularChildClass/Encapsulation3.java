package JavaKonularChildClass;
// Farklı package'ta bir class
import JavaKonular.Encapsulation;



public class Encapsulation3 {
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        System.out.println(obj.butce);
        System.out.println(obj.proje);
        System.out.println(obj.getProjeAsgariUcret());
        /* Eğer getDepartman() default olduğu için. Bu package'tan ulaşamam.*/
        // System.out.println(obj.getDepartman());


    }
}
