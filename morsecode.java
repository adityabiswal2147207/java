import java.util.ArrayList;
import java.util.List;


public class morsecode {
    final static String[][] code = {
            {"A", ".-     "}, {"B", "-...   "}, {"C", "-.-.   "}, {"D", "-..    "},
            {"E", ".      "}, {"F", "..-.   "}, {"G", "--.    "}, {"H", "....   "},
            {"I", "..     "}, {"J", ".---   "}, {"K", "-.-    "}, {"L", ".-..   "},
            {"M", "--     "}, {"N", "-.     "}, {"O", "---    "}, {"P", ".--.   "},
            {"Q", "--.-   "}, {"R", ".-.    "}, {"S", "...    "}, {"T", "-      "},
            {"U", "..-    "}, {"V", "...-   "}, {"W", ".-   - "}, {"X", "-..-   "},
            {"Y", "-.--   "}, {"Z", "--..   "}, {"0", "-----  "}, {"1", ".----  "},
            {"2", "..---  "}, {"3", "...--  "}, {"4", "....-  "}, {"5", ".....  "},
            {"6", "-....  "}, {"7", "--...  "}, {"8", "---..  "}, {"9", "----.  "},
            {"'", ".----. "}, {":", "---... "}, {",", "--..-- "}, {"-", "-....- "},
            {"(", "-.--.- "}, {".", ".-.-.- "}, {"?", "..--.. "}, {";", "-.-.-. "},
            {"/", "-..-.  "}, {"-", "..--.- "}, {")", "---..  "}, {"=", "-...-  "},
            {"@", ".--.-. "}, {"\"", ".-..-."}, {"+", ".-.-.  "}, {" ", "/"}};

    final static List<String> ascii = new ArrayList<String>();
    static{
        for (String [] pair : code)
        {
            ascii.add(pair[0].charAt(0),pair[1].trim());
        }
    }
    public static void main(String[] args){
        printMorse("Hello Aditya");
    }

    static void printMorse(String input){
        System.out.printf("%s %n",input);

        input = input.trim().replaceAll("[]+"," ").toUpperCase();
    }
    }
}
