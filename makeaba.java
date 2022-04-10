//coded by: Aditya Biswal
//Register number:- 2147207
//Date:- 10/03/2022

//importing libraries or files
import java.util.Scanner;
import java.util.*;

//making a class
public class makeaba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // system.in is a standard input stream
        System.out.print("Enter your first input: ");
        String a = sc.nextLine(); // storing the input in a
        System.out.print("Enter your second input: ");
        String b = sc.nextLine(); // storing the input in b

        String str = a + b + b + a; // main logic ofthe program
        System.out.print(str); // showing the output
    }
}
