package JavaKonular;



public class ForEachLoopNotlar {
    public static void main(String[] args) {
        // For Each Loop : Enhanced (Gelistirilmis) For Looptur. İndexten bğımsız tüm elemanları
        // çağırmak istiyorsak kullanabilriz.

        int arr []={1,2,3,4,5,68,89,77};
        for(int w : arr){        // int data tipli arr ye git w ya ata şeklinde çalışır.
            System.out.print(w+" ");
        }
        // Geleneksel kod yazımında for each için w kullanılır.
    }
}