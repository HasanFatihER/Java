package javaExercises;

import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        /* 33.Write a Java program and compute the sum of the digits of an integer
Input Data:
Input an integer: 25
Expected Output
The sum of the digits is: 7
*/     Scanner dj=new Scanner(System.in);
        System.out.println("Input an integer: ");
        int sayi=dj.nextInt();
        int total=0;
        int basamak=3;
        for(int i=0;i<basamak;i++){
            total+=sayi%10;
            sayi=sayi/10;
            if(sayi>9){
                basamak+=1;
            }

        }System.out.println(total);

        /* 2. Yöntem
        Scanner dj=new Scanner(System.in);
        System.out.println("Input an integer: ");
       String sayi=dj.nextLine();
       String []dizi=sayi.split("");
       int toplam=0;
       for (int i=0;i<dizi.length;i++){
           toplam+=Integer.parseInt(dizi[i]);
       }
        System.out.println(toplam); */


    }
}
