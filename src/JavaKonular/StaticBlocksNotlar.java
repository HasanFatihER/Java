package JavaKonular;



public class StaticBlocksNotlar {
    /*
--- Static block, class ilk calistirilmaya baslandiginda
calisir ve static variable’lara ilk deger atamasi
yapar (initialize)
--- Static block’lar constructor’lardan, tum
method’lardan ve main method’dan once calisir.
--- Eger 1'den fazla static block varsa ustteki blok
daha once calisir.
 */

    static {
        System.out.println("Static block 1 çalıştı.");
    }
    static {
        System.out.println("Static block 2 çalıştı.");
    }

    public static void main(String[] args) {

        System.out.println("Main method çalıştı.");
    }
}
