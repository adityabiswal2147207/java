import java.util.Scanner;

public class holiday {

    static void myfunc(String sleep){
        if(sleep=="weekday"){
            System.out.println("Sleeping");
        }
        else if(sleep=="vacation"){
            System.out.println("Awake");
        }
        else{
            System.out.println("Wrong Input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How are you feeling: ");
        String str = sc.nextLine();

        System.out.print(str);

        myfunc(str);
    }
}
