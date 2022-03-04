package javaExercisesGeneral;

import java.util.Scanner;

public class MukemmelSayi {

    // Mükemmel sayi : Kendisinden başka pozitif bölenlerinin sayıları toplamı
    //kendisine eşit sayı  örnek 6-1,2,3

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number=scan.nextInt();
        int total=0;
        for(int i=1;i<number;i++){
            if(number%i==0) {
                total = total + i;
            }
        } if(total==number){
            System.out.println("Girdiğiniz sayı mükemmel sayıdır");
        } else System.out.println("Girdiğiniz sayı mükemmel sayı değildir");
    }
}
