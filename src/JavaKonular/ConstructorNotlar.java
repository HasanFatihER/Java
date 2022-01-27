package JavaKonular;



public class ConstructorNotlar {
    int notMatematik=90;
    int notFen=85;
    int notBeden=100;
    String isim;
    String ders;
    int dersNotu;

    public ConstructorNotlar(String isim, String ders, int dersNotu) {
        this.isim=isim;   // this ifadesi class seviyesindeki dataları Costructora gelen datalar ile eşleştiri.
        this.ders=ders;   // Kodun anlaşılması için benzer isimler kullanılır. this. ile hangi ismi aldığını bu şekilde görmüş oluruz.
        this.dersNotu=dersNotu;

    }

    /*  Her sınıfta default constructor vardır. Görünmeyen bir constructor.
      ConstructorNotlar () {
      }
      şeklindedir. Objeleri zaten bu şekilde üretiriz.


      Constructorlar Class ismi ile aynı olmak zorundadır.
      Return type ları yoktur.
      Eğer ben default constructordaki değerleri kullanmayacaksam ve kendi bilgilerimle işlem yapacaksam
      parametreli constructor oluşturmam gerekir. */
    ConstructorNotlar () {
    }
    /*  Parametreli constructor oluşturduğumda ise gizli default constructor java tarafında silinir.
      Bundan dolayı kendimiz default constructor ı yazmak zorunda kalırız.


      Main method her classta olmak zorunda değildir.
      Bazı classları sadece constructor oluşturmak için kullanabiliriz


  */
    public static void main(String[] args) {
        // Constructor Java’da object olusturmak icin kullanilan kod blogudur. Constructor olmadan
        // obje oluşturamazsınız.
        // Constructorlar class içinde FAKAT main methodun dışında üretilir.
        // ConstructorNotllar      obj              =        new             ConstructorNotllar();
        // Sınıf adı      ---     obje ismi   -- atama  --  new keyword    ---  constructor call
        ConstructorNotlar obj  = new ConstructorNotlar();
        System.out.print("Notunuz : " +obj.notMatematik);


        ArrayListNotlar arraydenConst=new ArrayListNotlar();

        ConstructorNotlar obj2=new ConstructorNotlar( "Hasan", "Matematik", 100);

        // Class icinde birden fazla Constructor varsa
        // Java obje create ederken kullandigimiz argument’lere gore uygun constructor’i kullanir
        //---------**********************------//

        //this()  This constructor içinden constructor çağırmak için kullanılır.
        //this() 1 adettrir ve ilk satıra yazılır.

    }
}
