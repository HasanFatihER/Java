package javaExercisesGeneral;

import java.util.Scanner;

/* { /// Task1 : Write a Java program to convert temperature from Fahrenheit
to Celsius degree.
 */
public class FahrenheitTOCC {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Fahrenheit değerinin giriniz");
        double deger=scan.nextDouble();

        System.out.println("Girdiğiniz Fahrenheit :"+fToCC(deger)+"Celsius'tur.");   }
    public static double fToCC(double deger){
        deger=(deger-32)/1.8000;
        return deger;
    }
}
