
//Q)Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int LineNumber = 1; // here we are numbering the line 1 from one.

        // we will use while loop because we want to read until there is no more input
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(LineNumber + " " + line);
            LineNumber++; // for the increment of the line
        }
    }
}
