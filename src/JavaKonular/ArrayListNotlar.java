package JavaKonular;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListNotlar  {
    // ArrayList bir arraydir. Array lerden farkı ise length inin değiştirilebiliyor olmasıdır.
    // Arrayde length başta belirlenmek zorunda. Esnekliği bitiriyor bu durum. Arraylere eleman
    //ekleme çıkarma yapılamıyor. ArrayList ile bu sorun çözülmüştür.

    public static void main(String[] args) {
        List<Integer> arayListWrapper=new ArrayList<>(); // ArrayListlerde primitive datalarda
        // list oluşturamayız. Bunun için Wrapper Classları kullanırız.

        ArrayList<String> list1 = new ArrayList<String>(); // 3 şekilde oluşturabiliriz.
        ArrayList<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>(); // En cok bu kullanım şekli.

        //---------*****************************************************************-----------//
        /// ArrayList Methodları ///

        //add () :
        list1.add("Ali");  // sonuna ekler.
        list1.add(1,"Veli");
        // İçine girilen degeri sona ekler. add(1,"Ali") şeklinde indexli de ekleme yapılabilir.
        arayListWrapper.add(5);
        System.out.println(arayListWrapper);

        // addAll() Methodu : Bir listeyi diğerine eklemek için kullanabiliriz.

        list2.addAll(list1);
        list1.add("ayna");
        list1.add("duman");
        list1.add("A");
        list1.add("A");
        list1.add("A");
        System.out.println(list2);
        list2.addAll(1,list1);
        System.out.println(list2);

        // size() Methodu : Arraylerdeki lengthtir. ArrayList te size () olarak kullanılır.

        System.out.println(list1.size());

        // isEmpty () Methodu : Boş mu dolu mu sorgusu için kullanılır.
        System.out.println(list2.isEmpty());

        // get() Methodu: ArrayListteki değeri getirmek için kullanılır.
        System.out.println(list1.get(1));

        //remove () Methodu : Herhangi bir değeri silmek için kullanılır.2 kullanım şekli var.

        System.out.println(list1.remove(1));   // Sidiği elemanı döner
        list1.add("1");
        System.out.println(list1.remove(1));  // Bu çok önemli. Bizim girdiğimiz değer indexdir.
        System.out.println(list1);
        // Değer sayısal olduğu için hataya açıktır. Burada dikkatli olunmalı. Aşağıdaki gibi olursa siler.
        System.out.println(list1.remove("1"));
        System.out.println(list1);
        System.out.println(list1.remove("Zuhal")); // Bulamazsa False döner.
        System.out.println(list1.remove("A"));  // Sadece ilk A yı siler. True ya da false döner.
        System.out.println(list1);

        //removeAll() Methodu : Girilen listeyi siler.

        System.out.println(list2);
        list1.add("Deniz");
        System.out.println(list2.removeAll(list1));  // True False döner. Ve içerisindeki tüm list2 elemanlarını siler.
        System.out.println(list2);
        System.out.println(list1);

        // set() Methodu : listedeki değeri değiştirmek için kullanılır.
        list1.set(1,"Ayten");
        System.out.println(list1);

        // contains() Methodu : ArrayList’de bir elemanin var olup olmadigini
        //kontrol eder. Eleman varsa true, yoksa false return eder.

        System.out.println(list1.contains(list2));

        // equals() Methodu : iki listteki ayni indexteki elemanlarin ayni olup olmadigini kontrol
        //eder. Ayni indexteki tum elemanlar ayni ise true return eder, farkli ise false return eder.


        // clear() methodu  : ArrayList’teki tum elemanlari siler. Return type’i void’dir, hic bir sey donmez.

        /////------------------*********************************************-------------------///

        // Collections.sort() : sort() methodu ArrayList’deki elemanlari kucukten buyuge veya
        // alfabetik siraya gore sıralar. Arraylede Arrays. kullanırız ArrayListlerde Collections. classı kullanılır.
        Collections.sort(list2);
        System.out.println(list2);

        //////----*********ÖNEMLİ***********-------////
        // Arrayden List üretmek

        String [ ] arr = {"Fatma", "Ali" };
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
        // Bir listeyi yukarıdaki gibi arrayden türetebiliriz. Fakat bu durum ArrayListin özelliklerini değiştirir.
        // Uzunlugu degistirilemeyen bir list’e cevirir. Yani;yeni olusturulan listte add(),
        //remove() ve clear() methodlarini kullanamazsiniz.
        // list.add("ahmet");  : RTE verir. CTE vermez.
        arr[0]="Mehmet";
        System.out.println(list);
        // arr de yapılan bir değişiklik listi de etkiler.
        list.set(1,"Cemal");
        System.out.println(Arrays.toString(arr));
        // Aynı şekilde list te yapılan değişiklikte arr yi etkiler.

        //**********************//

        // Listten Array de mümkündür.

        List<String> list5 = new ArrayList<>();
        list5.add("Altın");
        list5.add("Dolar");
        System.out.println(list);
        // 1.yontem
        String arrl[ ] = list.toArray(new String[0]);
        System.out.println(arrl.length);

        System. out .println(Arrays. toString (arrl));
        // 2.yontem
        Object arrk[ ] = list.toArray( );
        System.out.println(arrl.length);

        System. out .println(Arrays. toString (arrk));


    }
}
