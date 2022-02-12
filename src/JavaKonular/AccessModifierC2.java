package JavaKonular;

public class AccessModifierC2 {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        /* System.out.println(obj.str);
        str objesi private olduğu için bu class'tan ulaşamam.
        /////////////////

        */
        System.out.println(obj.number); // default variable - JavaKonular package'dayız. Aynı package
        System.out.println(obj.number1);
        System.out.println(obj.number2);

        /* Şimdi src altında JavaKonularChildClass adında yeni bir package oluşturuyorum.
        Bu package altında da AccessModifierChild adında AccessModifier
        */
    }
}
