package javaExercisesGeneral;
/*  Create a 10-element list. Swap the 8th element with the 3rd element.

INPUT : String[] names={"Umit","Emin","Kemal","Kerem",
"Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:

[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]*/


public class Arrays {
    public static void main(String[] args) {
        String[] names={"Umit","Emin","Kemal","Kerem",
                "Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
       /* List<String> lists=new ArrayList<>();
        for(int i=0;i<names.length;i++){
            lists.add(names[i]);
        }

        lists.set(2,names[7]);
        lists.set(7,names[2]);
        System.out.println(lists); */
        String []yeni=new String[names.length];
        for(int i=0;i<names.length;i++){
            if(i==2|i==7){
                yeni[2]=names[7];
                yeni[7]=names[2];
            } else  yeni[i]=names[i];

        }
        System.out.println(java.util.Arrays.toString(yeni));
    }
}
