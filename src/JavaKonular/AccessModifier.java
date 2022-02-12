package JavaKonular;

import JavaKonularChildClass.AccessModifierChild;

// Java öğrencileri için notlar
public class AccessModifier {
    private String str="Java öğreniyorum"; // private variable
    int number;   // default variable
    protected double number1=10.2;  //protected variable
    public float number2=20.5f;     // public  variable
    static boolean isTrue;

    // Bu classtan hepsine ulaşabilirim.

    public static void main(String[] args) {
        /* Access Modifier  : Erişim düzenleyici anlamına gelir. Bir class, variable ya da methodlara
        erişimi sınırlandırma yöntemindir.
        4 farklı access modifier vardır.
        -Private : Sadece içinde bulunduğu class tan erişilebilir.
        -Default : İçinde bulunduğu package'lardan erişim sağlanır.
         (Bu örnekteki JavaKonular altındaki her class)
        -Protected : İçinde bulunulan package'tan (JavaKonular) ve diğer package'lardaki
        child class_lardan erişim sağlanır.
        -Public : Tüm package'lardan erişim sağlanabilir.

        NOT : Class lar sadece ve sadece public ya da default olabilir. Class’lar private veya protected olamazlar.
         */

        AccessModifier obj=new AccessModifier();
        System.out.println(obj.str);
        System.out.println(obj.number);
        System.out.println(obj.number1);
        System.out.println(obj.number2);

        /* Main method static olduğu için bu datalara obje üzerinden ulaşabiliriz. Static variable'lara
        direk ulaşabiliriz. Bunun için ScopeNotlar bölümüne bakabilirsiniz.
        */
        System.out.println(isTrue);
    }
}
