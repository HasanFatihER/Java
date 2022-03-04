package javaExercisesGeneral;

/* Write a Java program to get a String from user as input and
find the maximum occurring character in that string. (Ignore case sensitivity)
input :
Learning java is easy
output:
maximum occurring character is : a */

         import java.util.Scanner;

public class StringHarfSayisi {
    public static void main(String[] args) {
        System.out.println("Bir cümle yazınız");
        Scanner scan=new Scanner(System.in);
        String cumle=scan.nextLine();
        String [] arrays=cumle.split("");
        int counter=0;
        int flag=0;
        String harf="";
        for (int i=0;i<arrays.length-1;i++){
            for (int j=i+1;j<arrays.length;j++){
                if(arrays[i].equalsIgnoreCase(arrays[j])){
                    counter++;
                }
                if(flag<=counter){
                    flag=counter;
                    harf=arrays[i];
                }
            }

        }
        System.out.println("Girilen cumle : "+cumle);
        System.out.println("Girilen cümledeki en çok kullanılan harf :"+harf);
    }
}
