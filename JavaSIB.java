
//Q)Write a java program using a static intialization block to read height and breadth of a 
// paralleogram from input. if both values are positive, print the area , otherwise print-
// -"java.lang.Exception: Breadth and height must be positive"..
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSIB {
    public static int H;
    public static int B;
    public static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        B = sc.nextInt();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}// end of class
