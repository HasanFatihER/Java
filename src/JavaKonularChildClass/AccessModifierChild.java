package JavaKonularChildClass;

import JavaKonular.AccessModifier;

/*  int number;   // default variable
    protected double number1=10.2;  //protected variable
    public float number2=20.5f;     // public  variable
*/

public class AccessModifierChild extends AccessModifier {
    public static void main(String[] args) {
        AccessModifierChild obj=new AccessModifierChild();
        System.out.println(obj.number1);
        System.out.println(obj.number2);
       /* System.out.println(obj.number);  default variable olduğu için ilgili olduğu
        JavaKonular package'ından ulaşılabilir.

        -- number1 protected olduğundan  ve AccessModifier class'ının child class'ı olduğu için
        ulaşabilir.
        -- number2 - public variable
        */
        obj.number1=45;
        System.out.println(obj.number1);

        /*Data'ya Acces Modifier olarak erişim hakkım varsa aynı zamanda değiştirebiliyorumdur.
        *  */
    }


}
