//importing java libraries:-->
import java.io.*;
import java.util.*;

public class caesars {
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

    //making of the encrypt function:-->
    public static String encrypt(String message, int shiftkey){
        message = message.toLowerCase();
        String cipherText = "";
        for(int i=0;i<message.length();i++){
            int charPosition = alpha.indexOf(message.charAt(i));
            int keyVal = (shiftkey + charPosition) % 26;
            char varReplace = alpha.charAt(keyVal);
            cipherText += varReplace;
        }
        return cipherText;
    }

    //making the main function:-->
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String message = new String();
        int key = 0;
        System.out.print("Enter the string for encryption:-  ");
        message= sc.next();

        System.out.println("\n\nEnter Shift Key: ");
        key = sc.nextInt();
        System.out.println("\nEncrypted message: "+ encrypt(message,key));
    }
    
}
