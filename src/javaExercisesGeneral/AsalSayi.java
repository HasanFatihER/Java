package javaExercisesGeneral;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number=scan.nextInt();
        // Asal sayı : 1 ve kendisinden başka böleni olmayan sayıdır.
        boolean isPrime=true;
        if(number==1){
            System.out.println("Sayı asal değildir.");
            return;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Sayı asaldır.");
        } else{
            System.out.println("Sayı asal değildir");
        }
    }
}
