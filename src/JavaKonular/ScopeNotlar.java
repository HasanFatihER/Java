package JavaKonular;



public class ScopeNotlar {
    /*Java’da olusturulan variable’lar icin 4 Scope mevcuttur.

1) Instance (Object) Variables //
2) Static (Class) Variables //
3) Local (Method) Variables
4) Loop Variables */ // Loop variable bazı kaynaklarda local variables olarak geçer.

    // Variable birden fazla methodu ilgilendirecekse instance ya da static olarak planlanmalı.

    int a=1; // Instance variable dır.  Static olmamalı.
    int b,c,d;
    boolean k;  // Default--> false
    float f;    // Instance variableların ve static variablerın oluşturulması yeterli.
    byte l;     // Değer ataması yapılmayabilir. Java Deafult değerleri atar.
    long v;
    double g;
    String isim;   // Default null;
    static  int sayi; // static variable
    static  double sayilar;  // Static adı üzerinde sabit demektir. Ulaşan herkes üzerinde değişiklik yaabilir.
    // Dolayısıyla en son hangi değer atandıysa o değer valiable da kalır.



    public static void main(String[] args) {
        ScopeNotlar obj1=new ScopeNotlar();
        System.out.println(obj1.yaz());

        // System.out.println(a);
        // Hata verir çünkü object variableslara sadace obje üzerinden erişebilirsinizi.
        // Bunun asıl nedeni de main metod static olduğu içindir. Static alanlardan static
        // olmayan alanlara ulaşmak için obje üzerinden gitmeliyiz.

        System.out.println(sayi);
        // Sayi static olduğu için direk ulaşabiliriz. Static class variable
        // olmasındaki dememizdeki amaç budur .


        int m;  // Hata vermez değer atmanı bekler.
        //  m++;  Local variable larda java default değer atamaz. Bu onu gösterir.
        m=6;
        // double m  Aynı localde aynı isimli 1 adet valiable oluşturabilirsin. Data türü farklı olsa bile.


        int sayi=9;
        for(int i=0;i<3;i++){
            //    int sayi=0; Main methodun localinde. Bir isim 1 valiable. CTE verir.
            sayi=12;
            System.out.println(i+ " "+sayi);

        }
        // System.out.println(i); i for un local valiable'ıdır.
    }




    public String yaz() {
        System.out.println(k); //Hata vermez çünkü static olmayan bir method.

        System.out.println(sayilar); // Satic variablelara her yerden ulaşılır.
        System.out.println(yazS());  // Aynı şekilde yazS() static method olduğu için direk ulaşabiliriz.
        // m=11;  Hata verir çünkü m local variable. Main de tanımlanmış sadece orda kullanılır.
        // Fakat bu yeni bir değer
        int m=8;
        return "Static olmayan method";
    }





    public static String yazS(){
        // System.out.println(c); Hata verir çünkü static alanlardan object variableslara
        // sadace obje üzerinden erişebilirsiniz

        System.out.println(sayilar); // Satic variablelara her yerden ulaşılır.
        ScopeNotlar obj=new ScopeNotlar();
        obj.c=8;     // instance variable
        obj.yaz(); // Static olmayan method  yaz(); Hata verir.
        //  m=9,   Hata verir çünkü m local variable. Main de tanımlanmış sadece orda kullanılır.
        // Fakat bu yeni bir değer
        int m=8;
        return "Static method";

    }



}
