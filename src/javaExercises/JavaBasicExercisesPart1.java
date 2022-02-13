package javaExercises;

import java.util.Scanner;

public class JavaBasicExercisesPart1 {
    public static void main(String[] args) {
        //  Java Basic Exercises

/*1.Write a Java program to print 'Hello' on screen and then print your name on a separate line.

Expected Output:
Hello
Alexandra Abramov
*/
        System.out.println("Hello");
        System.out.println("Alexandra Abramov");

/*Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output
110
*/
        int number1 = 74;
        int number2 = 36;
        System.out.println(number1 + number2);


/* 3.Write a Java program to divide two numbers and print on the screen.
Test Data :
50/3
Expected Output:
16
*/
        int number3 = 50;
        int number4 = 3;
        System.out.println(number3 / number4);
//
/* 4.Write a Java program to print the result of the following operations.
Test Data:
 a. -5 + 8 * 6
 b. (55+9) % 9
 c. 20 + -3*5 / 8
 d. 5 + 15 / 3 * 2 - 8 % 3
 Expected Output:
 43
 1
 19
 13
*/
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + (-3 * 5 / 8));
        System.out.println((5 + (15 / 3) * 2) - (8 % 3));
/* 5.Write a Java program that takes two numbers as input and display the product of two numbers.
 Test Data:
 Input first number: 25
 Input second number: 5
 Expected Output:
 25 x 5 = 125
*/
        int number5 = 25;
        int number6 = 5;
        System.out.println(number5 + "*" + number6 + " = " + number5 * number6);


/* 6.Write a Java program to print the sum (addition), multiply, subtract,
divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
        int number7 = 125;
        int number8 = 24;
        System.out.println(number7 + "+" + number8 + " = " + (number7 + number8));
        System.out.println(number7 + "-" + number8 + " = " + (number7 - number8));
        System.out.println(number7 + "*" + number8 + " = " + (number7 * number8));
        System.out.println(number7 + "/" + number8 + " = " + (number7 / number8));
        System.out.println(number7 + "+" + number8 + " = " + (number7 % number8));


/* 7.Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output:
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
        int number9 = 8;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number9 + " * " + i + " = " + (number9 * i));
        }

/* 8.Write a Java program to display the following pattern.
Sample Pattern :
   J    a   v     v  a
   J   a a   v   v  a a
J  J  aaaaa   V V  aaaaa
 JJ  a     a   V  a     a



*/
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 26; j++) {
                if (i == 0) {
                    switch (j) {
                        case 3:
                            System.out.print("J");
                            break;
                        case 8, 21:
                            System.out.print("a");
                            break;
                        case 12, 18:
                            System.out.print("v");
                            break;
                        default:
                            System.out.print(" ");
                            break;
                    }
                } else if (i == 1) {

                    switch (j) {
                        case 0:
                            System.out.println();

                            break;
                        case 4:

                            System.out.print("J");
                            break;
                        case 8, 10, 21, 23:

                            System.out.print("a");
                            break;
                        case 14, 18:

                            System.out.print("v");
                            break;
                        default:
                            System.out.print(" ");
                            break;
                    }
                } else if (i == 2) {

                    switch (j) {
                        case 0:
                            System.out.println();
                            System.out.print("J");
                            break;
                        case 3:
                            System.out.print("J");
                            break;
                        case 6, 7, 8, 9, 10, 19, 20, 21, 22, 23:

                            System.out.print("a");
                            break;
                        case 14, 16:

                            System.out.print("V");
                            break;
                        default:
                            System.out.print(" ");
                            break;
                    }
                } else if (i == 3) {

                    switch (j) {
                        case 0:
                            System.out.println();
                            break;
                        case 2, 3:
                            System.out.print("J");
                            break;
                        case 6, 12, 19, 25:
                            System.out.print("a");
                            break;
                        case 16:
                            System.out.print("V");
                            break;
                        default:
                            System.out.print(" ");
                            break;
                    }
                }

            }
        }
        System.out.println();
/* 9.Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889
*/
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));


/* Write a Java program to compute a specified formula.
Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765
*/
        System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
/* 11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/
        double pi = 3.14159;
        double radius = 7.5;
        double areaCircle;
        double perimeterCircle;
        System.out.println("Perimeter is = " + (2 * pi * radius));
        System.out.println("Area is = " + (pi * radius * radius));



// 12 Write a Java program that takes three numbers as input to calculate and print the
// average of the numbers.

        Scanner scan = new Scanner(System.in);
        System.out.println("Write three numbers");
        System.out.println("Number one : ");
        double numberOne = scan.nextDouble();
        System.out.println("Number Two : ");
        double numberTwo = scan.nextDouble();
        System.out.println("Number Three : ");
        double numberThree = scan.nextDouble();
        double average = (numberOne + numberThree + numberTwo) / 3;
        System.out.println("Average of the numbers = " + average);



/* 13.Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.6 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/
        double recWitdth = 5.6;
        double recHeight = 8.5;
        System.out.println("Area is 5.6 * 8.5 = " + (recHeight * recWitdth));
        System.out.println("Perimeter is 2 * (5.6 + 8.5) = " + (2 * (recHeight + recWitdth)));
/* 14.Write a Java program to print an American flag on the screen.
Expected Output
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
==============================================
==============================================
==============================================
==============================================
==============================================
==============================================


*/
        String[][] flag = new String[15][46];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 46; j++) {
                if (i < 9 && j < 13 && j % 2 == 1 && i % 2 == 1) {
                    flag[i][j] = "*";
                } else if (i < 9 && j < 14) {

                    if (j % 2 == 0 && i % 2 == 0) {
                        flag[i][j] = "*";
                    } else flag[i][j] = " ";

                } else flag[i][j] = "=";


                System.out.print(flag[i][j]);

            }
            System.out.println();
        }


// 15.Write a Java program to swap two variables.

        int numbr = 25;
        int numbr2 = 45;
        numbr = numbr2 - numbr;
        numbr2 = numbr2 - numbr;
        numbr = numbr2 + numbr;
        System.out.println("Number1 :" + numbr);
        System.out.println("Number2 :" + numbr2);

        // Diğer Yöntem
        int nmr = 25;
        int nmr2 = 45;
        int repo = nmr;
        nmr = nmr2;
        nmr2 = repo;
        System.out.println("Number1 :" + nmr);
        System.out.println("Number2 :" + nmr2);


//
/* 16.Write a Java program to print a face.
Expected Output
 +"""""+
[| o o |]
 |  ^  |
 | '-' |
 +-----+
*/
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {

                switch (i) {
                    case 0:
                        switch (j) {

                            case 1, 7:
                                System.out.print("+");
                                break;
                            case 2, 3, 4, 5, 6:
                                System.out.print("\"");
                                break;
                            default:
                                System.out.print(" ");
                                break;
                        }
                        break;
                    case 1:
                        switch (j) {
                            case 0:
                                System.out.print("\n" + "[");
                                break;
                            case 1, 7:

                                System.out.print("|");
                                break;
                            case 3, 5:


                                System.out.print("o");
                                break;
                            case 8:
                                System.out.print("]");
                                break;
                            default:
                                System.out.print(" ");
                                break;

                        }
                        break;

                    case 2:

                        switch (j) {

                            case 0:
                                System.out.print("\n" + "");
                                System.out.print(" ");
                                break;
                            case 1:

                                System.out.print("|");
                                break;
                            case 4:
                                System.out.print("^");
                                break;
                            case 7:
                                System.out.print("|");
                                break;
                            default:
                                System.out.print(" ");

                        }
                        break;

                    case 3:
                        switch (j) {
                            case 0:
                                System.out.print("\n" + "");
                                System.out.print(" ");
                                break;

                            case 1:
                                System.out.print("|");
                                break;
                            case 4:
                                System.out.print("^");
                                break;
                            case 3, 5:


                                System.out.print("'");
                                break;
                            case 7:
                                System.out.print("|");
                                break;
                            default:
                                System.out.print(" ");

                        }
                        break;

                    case 4:
                        switch (j) {
                            case 0:
                                System.out.print("\n" + "");
                                System.out.print(" ");
                                break;

                            case 1:
                                System.out.print("-");
                                break;
                            case 2, 3, 4, 5, 6:

                                System.out.print("\"");
                                break;
                            case 7:
                                System.out.print("-");
                                break;
                            default:
                                System.out.print(" ");

                        }
                        break;


                }
            }

        }


    }
}
