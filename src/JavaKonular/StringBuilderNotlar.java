package JavaKonular;

import java.util.List;

// Java öğrenmek isteyenler için örnek çalışmalarımdır.
public class StringBuilderNotlar {
    public static void main(String[] args) {
        //String Builder mutable dır. Yani hafıza da yeniden yer açmaz. Aynı objenin üzerinde değişiklik yapar
        //Thread safe değildir.

        String str = new String("ali");  //String bu şekilde de üretilebilir.

        StringBuilder stringBuilder = new StringBuilder("Hasan");
        System.out.println(stringBuilder);
        //Multi-thread için String Buffer kullanılır. Fakat StringBuilder a göre yavaştır.
        StringBuffer strBfr = new StringBuffer("Ahmet");
        System.out.println(strBfr);

        /////**********Builder***********/////

        StringBuilder strB = new StringBuilder(10);
        // integer bir değer girildiğinde girilen değer kadar kapasite oluşturur.
        // 10 dan büyük bir length değer atarsak 2*capacity+2 alana yükseltir.
        // String Builder da bir çok methodlara sahiptir.
        strB.append("Celal Emre Mahmut"); // Değer atamak için.
        System.out.println(strB.capacity());
        strB.append("Veli");
        System.out.println(strB.toString());
        System.out.println(strB); // Her ikisi de çalışır.
        //String Builder ardarda ekleme mantığı ile çalışır.
        System.out.println(strB.indexOf("Veli"));
        System.out.println(strB.deleteCharAt(0));
        strB.deleteCharAt(5); //Belirtilen indexteki karakteri sil.
        System.out.println(strB.delete(0, 5));
        System.out.println(strB.isEmpty()); // Boş mu?
        System.out.println(strB);
        System.out.println(strB.lastIndexOf("ali"));
        System.out.println(strB.lastIndexOf("li"));
        System.out.println(strB.lastIndexOf("i"));
        System.out.println(strB.lastIndexOf("a"));
        System.out.println(strB.lastIndexOf("k")); // Aranılan değer yoksa -1 varsa indexini döner.
        strB.append("Nimet", 0, 2); //Sona ekler. Girilen String ve belirtilen aralıktaki karakterleri alır.
        System.out.println(strB);
        System.out.println(strB.length()); //içindeki datanın uzunluğu
        System.out.println(strB.capacity());
        System.out.println(strB.charAt(2)); // girilen indexteki karakteri verir..
        StringBuilder strB1 = new StringBuilder("Ahmet");
        StringBuilder strB2 = new StringBuilder("Ahmet");
        System.out.println(strB1.compareTo(strB2)); // Eğer birebir aynı ise sonuç 0 (sıfır) döner.
        System.out.println(strB.compareTo(strB1));
        StringBuilder strB3 = new StringBuilder("Ae");
        System.out.println(strB1.compareTo(strB3));  // Farklı karakter bulduğunda ilkinin karakteri
        //kaç char önde ya da arkada onu döner. strB1 deki h karakteri strB3 deki e den önde olduğu için +,arasında da
        // 3 harf olduğu için 3 sonucunu verir.
        StringBuilder strB4 = new StringBuilder("Al");
        System.out.println(strB1.compareTo(strB4));  // -4

        //String Builder equals mantığı Stringteki gibi değil == şeklinde çalışır.
        System.out.println(strB1.equals(strB2)); // false
        System.out.println(strB1.equals("Ahmet")); // false

        // System.out.println(strB1=="Ahmet");        Stringe eşitleyemeyiz.
        // System.out.println(strB1.compareTo("Ahmet")); // compareTo () String için kullanılamaz.
        StringBuilder strB6=new StringBuilder("Java öğrenmeyi seviyorum");
        strB6.insert(14," çok");
        System.out.println(strB6); // insert () methodunun bir çok versiyonu vardır. İncelemenizi tavsiye ederim.
        strB6.insert(19,"çok ama çok",0,8);
        System.out.println(strB6);
        // Burada da 19 strB6 daki index yeri, 0/8 ise benim girdiğim String içinde nereyi alsın.
        System.out.println(strB6.substring(5,8));
        System.out.println(strB6.substring(5));
        /* substring() methodunu kullandıktan sonra String methodlarını kullanabiliriz. Nedeni
        substring() Stringe çevirir. */
        String strD=strB6.substring(5,8);

        System.out.println(strB6.subSequence(5,8));
        /* Aynı şekilde subSequence() methodu da aynı şeyi döndürür. Fakat bu method sadece
        * char dizini olarak alır. String e çevirmez.Aşağıdaki gibi hata verir*/
       // strD=strB6.subSequence(5,8);

        StringBuilder trimStr=new StringBuilder("   Java ne kadar güzel bir dil   ");
        System.out.println(trimStr.length());
        System.out.println(trimStr.capacity());
        trimStr.trimToSize();   // Baştaki ve sondaki boşlukları aldık.
        System.out.println(trimStr.capacity());

        /////**********************************//////
        //String ile String Build arasındaki hız kıyaslaması

            String strTime="Hasan";
            StringBuilder strTimeS=new StringBuilder("Hasan");
        long timeSb1=System.nanoTime();
        for(int i=0;i<1000;i++){
            strTimeS.append(" ");
        }
        long timeSb2=System.nanoTime();
        long timeSb3=timeSb2-timeSb1;
        long timeS1=System.nanoTime();
        for(int i=0;i<1000;i++){
            strTime+=" ";
        }
        long timeS2=System.nanoTime();
        long timeS3=timeS2-timeS1;
        if(timeS3-timeSb3>0){
            System.out.println("String Build daha hızlıdır.");
            System.out.println("Hız oranı ="+timeS3/timeSb3);
        }
        else {
            System.out.println("String daha hızlıdır.");
            System.out.println("Hız oranı ="+timeSb3/timeS3);}



    }
}
