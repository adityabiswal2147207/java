import java.util.Scanner;
import java.util.sca
class Pen{
    String color;
    String type;

    public void check(){
        if(color == "red" && type == "gel")
            System.out.println("Your pen color is red which is of gel type");
        else
            System.out.println("Unknown brand");
    }

    public void printColor(){
        System.out.print("Color: ");
        System.out.println(this.color);
    }

    public void printType(){
        System.out.print("Type: ");
        System.out.println(this.type);
    }
}

public class oops {
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";

        pen1.check();
        pen1.printColor();
        pen1.printType();
    }

    
}
