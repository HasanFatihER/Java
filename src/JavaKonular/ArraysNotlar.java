package JavaKonular;



import java.sql.Array;
import java.util.Arrays;

public class ArraysNotlar {
    // Arrays dizi demektir. Birden fazla objeyi içinde tutan bir data.Non-primitive datadır.
    // Arrayslar, içinde primitive dataları ya da non-primitive dataların referanslarını tutarlar.
    // Runtime da oluşurlar. İçine farklı farklı data tipini koyamayız. String-int-float vs gibi
    //Arrays declare edildiinde stack memory de referansı oluşturulur. Ne zaman run yapılır heapte oluşur.


    public static void main(String[] args) {
// int [] myArrays=new int[]; // Dizinin length tini girmek zorundayız hata verir.
        int [] myArrays= new int[5];  // int myArays []= şeklinde de yazılabilir.
        int [][] ikiKatliArray=new int[3][4];
        int [][] ikiKatArrays={{1,3},{6,5},{9,8}}; // Burada kaç katlı olduğunu görmenin ilk trick noktası
        //soldan ilk sayıya kadar kaç parantez var ona bakın. Ya da en sondan :)
        System.out.println(myArrays); // Bu haliyle yazarsan referansınız verir.
        myArrays[0]=10;
        myArrays[1]=9;
        myArrays[2]=2;  // Arraylere değer atama yöntemi. [i] her bir indexi gösterir.
        myArrays[3]=36;
        myArrays[4]=8;
        for (int i=0; i<myArrays.length;i++)  // Array in son elemanı myArrays.length-1
        {
            System.out.print(myArrays[i]+ "  ");
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(myArrays)); // Arrays Classları ile kolay bir şekilde yazdırabiliriz.

        System.out.println(myArrays.length); // Arrayin boyutu-kapasitesi.
        // System.out.println(myArrays[myArrays.length]); Exception verir. Out of bounds

        // Array Elemanlarını küçükten büyüğe sıralama
        Arrays.sort(myArrays);
        // Array sort yapıldığında içeriği kalıcı olarak değişir. Bu unutulmamalı.
        System.out.println(Arrays.toString(myArrays));
        // Arrayleri büyükten küçüğe sıralamak istersek önce sort yapıp daha sonra
        // yeni bir array oluşturup tersten atama yapabiliriz.
        System.out.println(Arrays.binarySearch(myArrays,5));
        // binarySearch () methodunun çalışması için öncelikle   Arrays.sort(myArrays);
        // metodunun çalıştırılması gerekir.
        System.out.println(Arrays.binarySearch(myArrays,8)); // Bulduğu yerin indexini döner.
        System.out.println(Arrays.binarySearch(myArrays,10));
        System.out.println(Arrays.binarySearch(myArrays,11));
        // Olmayan elemanlar için index değil sıra nosunu döner. Yani index+1

        String [] aile=new String[8];
        aile[0]="Hüseyin";
        aile[1]="Selvet";
        aile[2]="Hasan";
        aile[3]="Azize";
        aile[4]="Ferhat";
        aile[5]="Mısra";
        aile[6]="Serhat";
        aile[7] ="x";
        System.out.println(Arrays.toString(aile));
        Arrays.sort(aile);
        System.out.println(Arrays.toString(aile));
        System.out.println(Arrays.binarySearch(aile,"Recep"));
        System.out.println(Arrays.binarySearch(aile,"recep"));




        // Görüldüğü üzere binarSearch() CaseSensitive. Aradığınız kelimede büyük küçük harfe dikkat etmelisiniz.

        int [] myArrays2= new int[5];
        myArrays2[0]=2;
        myArrays2[1]=2;
        myArrays2[2]=2;
        myArrays2[3]=36;
        myArrays2[4]=8;
        System.out.println(Arrays.toString(myArrays2));
        System.out.println(Arrays.toString(myArrays));
        System.out.println(Arrays.equals(myArrays2,myArrays)); /// False verir çünkü myArrays i sort() yapıp düzenlemiştik.
        Arrays.sort(myArrays2);
        System.out.println(Arrays.toString(myArrays2));
        System.out.println(Arrays.equals(myArrays2,myArrays)); // True verir.
        // Burada Arrays Class 'ı üzerinden bir kıyaslama olur. Fakat aşağıdaki gibi direk listeleri kıyaslarsak
        // False verir.
        System.out.println(myArrays == myArrays2);
        // YA DA
        System.out.println(myArrays.equals(myArrays2)); // Obje sınıfı üzerinden bir kıyaslama da "False" verir.

        // Arraylerden eleman silemeyiz ya da yeni data ekleyemeyiaz. Sadece eleman atayabiliriz.
        // Bunu şu şekilde sağlarız. Yeni bir array tanımlar eskiyi istenmeyen dataları çıkraıp
        // yenisine ekleriz.


        //*******************************************************************************//



        /* Arraylerde kullanılan Methodlar.

        length :
        clone() :
        stream().   : Bir çok methoda dönüşebilir.
        equals() :
        hashCode() :
        toString ():
        getClass()  :
        notify() :
        notifyAll()  :
        wait()  :
        arg / cast / field / par / stream / val /var / varl  :
        */

      /*  Arrays Methodları
           ----------------///////////////////-----------

        -- toString ():
        -- binarySearch() :
        -- compare()  :
        */
        // -- copyOf()   :
        int [] array1={1,2,3,8,68};
        int [] array2={5,9,8,99,87,7};
        int [] birlestirArray=Arrays.copyOf(array1,array1.length+array2.length);
        System.out.println(Arrays.toString(birlestirArray));  // İlk arrayi yazdırır. ikinci
        //arraye 0(sıfır) değerlerini atar. Bu birleştirmeyi 2 ayrı for döngüsü ile de yapabilirsiniz.
        System.out.println(birlestirArray.length);
        for(int i=0;i<array2.length;i++){
            birlestirArray[i+array1.length]=array2[i]; // Arrays.copyOf() sonrası
        }
        System.out.println(Arrays.toString(birlestirArray));

        /*
        -- copyOfRange()  :
        -- equals()   :  Hem değerleri hem de indexleri karşılaştırır. Birebir aynı ise "true" değil ise "false" döner
        -- hashCode()  :
        -- mismatch()   :
        -- spliterator()  :
        -- stream()    :
        -- asList() :
        -- deepEquals()   */
        //****************************************************************************//

        // -- deepToString ()  :  Multi Dimensional Arrays leri yazdırmak için kullaılan methodtur.
        System.out.println(Arrays.deepToString(ikiKatArrays));
        System.out.println(Arrays.toString(ikiKatArrays)); // Bu şekilde yaparsak ikiKatArrays non-primitive bir data olduğu için referansını yazdırır.
        System.out.println(Arrays.toString(ikiKatArrays[1]));
        /*
        -- eepHashCode()  :
        -- parallelPrefix()  :
        -- parallelSetAll() :
        -- parallelSort() :
        -- fill()  :
        -- setAll()  :
        -- sort()  :

       */

    }

}