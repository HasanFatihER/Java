package javaExercises.w3schoolExe;

import java.util.Scanner;

import static java.lang.Math.tan;

public class JavaBasicExercises32x45 {
    public static void main(String[] args) {


/* 32.Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39
25 < 39
25 <= 39


        Scanner in=new Scanner(System.in);
        System.out.println("Input first integer: ");
        int first=in.nextInt();
        System.out.println("Input second integer: ");
        int second=in.nextInt();
        if(first<second){

            System.out.println(first+"!="+second);
            System.out.println(first+"<"+second);
            System.out.println(first+"<="+second);
        } else {System.out.println(first+"!="+second);
            System.out.println(first+">"+second);
            System.out.println(first+">="+second);} */


/* 34. Write a Java program to compute the area of a hexagon. 
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output
The area of the hexagon is: 93.53074360871938
  Scanner in=new Scanner(System.in);
        System.out.println("Write the length of a side of the hexagon:");
        int first=in.nextInt();
        System.out.println("Input the length of a side of the hexagon: "+first);

        double hexagon=(6 * first*first)/(4*tan(3.14159265/6));
        System.out.println("The area of the hexagon is: "+hexagon); */

/* 35. Write a Java program to compute the area of a polygon. 
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output
The area is: 130.82084798405722
*/
        


// 36. Write a Java program to compute the distance between two points on the surface of earth. 
// Distance between the two points [ (x1,y1) & (x2,y2)]
// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
// Radius of the earth r = 6371.01 Kilometers
// Input Data:
// Input the latitude of coordinate 1: 25
// Input the longitude of coordinate 1: 35
// Input the latitude of coordinate 2: 35.5
// Input the longitude of coordinate 2: 25.5
// Expected Output
// The distance between those points is: 1480.0848451069087 km
//
// 37. Write a Java program to reverse a string. 
// Input Data:
// Input a string: The quick brown fox
// Expected Output
// Reverse string: xof nworb kciuq ehT
//
// 38. Write a Java program to count the letters, spaces, numbers and other characters of an input string. 
// Expected Output
// The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
// letter: 23
// space: 9
// number: 10
// other: 6
//
// 39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there. 
// Expected Output
// 123
// 124
// ...
//
// 431
// 432
// Total number of the three-digit-number is 24
//
// 40. Write a Java program to list the available character sets in charset objects. 
// Expected Output
// List of available character sets:
// Big5
// Big5-HKSCS
// CESU-8
// EUC-JP
// EUC-KR
// GB18030
// GB2312
// GBK
//
// ...
//
// x-SJIS_0213
// x-UTF-16LE-BOM
// X-UTF-32BE-BOM
// X-UTF-32LE-BOM
// x-windows-50220
// x-windows-50221
// x-windows-874
// x-windows-949
// x-windows-950
// x-windows-iso2022jp
//
// 41. Write a Java program to print the ascii value of a given character. 
// Expected Output
// The ASCII value of Z is :90
//
// 42. Write a Java program to input and display your password. 
// Expected Output
// Input your Password:
// Your password was: abc@123
//
// 43. Write a Java program to print the following string in a specific format (see the output). 
// Sample Output
// Twinkle, twinkle, little star,
//         How I wonder what you are!
//                 Up above the world so high,
//                 Like a diamond in the sky.
// Twinkle, twinkle, little star,
//         How I wonder what you are
//
// 44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. 
// Sample Output:
// Input number: 5
// 5 + 55  + 555
//
// 45. Write a Java program to find the size of a specified file. 
// Sample Output:
// /home/students/abc.txt  : 0 bytes
// /home/students/test.txt : 0 bytes
//

}}
