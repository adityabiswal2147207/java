import java.util.Scanner;
import java.util.*;

public class factorial {
    public static void main(String[] args){
        int i;
        int fact = 1;
        Scanner sc = new Scanner(System.in); // system.in is a standard input stream
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        for(i=1;i<number;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
