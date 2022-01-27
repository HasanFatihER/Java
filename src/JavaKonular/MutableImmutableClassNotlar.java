package JavaKonular;



import java.util.ArrayList;
import java.util.List;

public class MutableImmutableClassNotlar {
    public static void main(String[] args) {
        /* Değiştirilebilen ve değiştirilemeyen classlar olarak nilendirilir.

        Immutable (değişmez) class’lar, objeleri bir kez oluşturulduktan sonra
değiştiremedigimiz class’lardir.

        Mutable (değişebilir) class’lar olusturdugumuz objeleri değiştirebildigimiz class’lardir.

        Bu kavrammların çıkış amacı multi thread ( aynı anda yapılan çoklu işlemler) durumlarında
        datanın orjinal halini korumak.

        String ve tüm Wrapper (Integer, Long, Double, Byte….) class’lar immutable sınıflardır.

        */
        String isim="Hasan"; // Heapte Hasan oluşturuldu. Stack te referans kodu oluşturuldu.
        System.out.println(isim.toUpperCase()); // HASAN heap te ayrıca oluşturuldu fakat stack te bir referans oluşmadı.
        // Çünkü atama yapılmadı. Atama yapamadan onjeyi değiştiremezsin.
        System.out.println(isim);

        // Bu örnekle daha açıklayıcı olacaktır.

        for(int i=0;i<20;i++){
            isim += " , ";
            System.out.println(isim); //20 adet obje oluştu.
        }
        // Konuyla bağlantılı bir husus daha vardır.

        String isim2="Ahmet"; // String havuzuna Ahmet eklenmiştir.
        String ad="Ahmet";   // Ahmet String havuzunda var mı? Var ad ın referansını isim2 ye eşitler.
        System.out.println(ad==isim2);
        String i1="Ah";
        String i2="met";
        String i3=i1.concat(i2);
        System.out.println(ad==i3);  // Bu false verir. Çünkü datanın oluşum aşaması farklıdır.


        ///*************///
        //  Date, StringBuilder,StringBuffer, Arrays ve ArrayList mutable Class’lardandır.

        List<String> isimler=new ArrayList<>();
        isimler.add("Kaya");      // Heapte Kaya datasına sahip isimler listesi oluştu. Stack te referans oluştu.
        isimler.add("Ayşe");   // Heapte Kaya,Ayşe olarak liste değişti. Yeni obje oluşmadı. Stack teki referansa atandı.
        System.out.println(isimler);
    }
}
