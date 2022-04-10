import java.util.*;
import javax.print.DocFlavor.STRING;
import java.io.*;


class Conversion{
    public static final String alpha = "abcdefghijklmnopqrstuvwxyz";


    //making the encryption function-->
    public String encrypt(String message, int shiftkey){
        message = message.toLowerCase();  //making all the string to lowercase
        String ciphertext = "";
        for(int i=0;i<message.length();i++){
            int charPosition = alpha.indexOf(message.charAt(i));
            int keyVal = (shiftkey + charPosition) % 26;
            char varReplace = alpha.charAt(keyVal);
            ciphertext += varReplace;
        }
        return ciphertext;
    }
}

public class Convert {
    public static void main(String[] args){
        Conversion obj = new Conversion();
        Scanner sc = new Scanner(System.in);
        String message = new String();
        int key = 0;
        System.out.print("Enter your password: ");
        message = sc.next();

        System.out.print("Enter shiftkey for encryption process: ");
        key = sc.nextInt();

        System.out.println("Encryted key : "+obj.encrypt(message,key));


    }

    
}
