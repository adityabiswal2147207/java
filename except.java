import java.util.Scanner;

class invalidusername extends Exception
{
    public invalidusername(String str)
    {
        //calling the parent of parent exception
        super(str);
    }
}

class Testusername
{
    void validate(String name) throws invalidusername{
        if(name.length() < 6)
        {
            throw new invalidusername("Username is not valid.\nIt should be less than 6 characters");
        }
    }
}

public class except {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Testusername obj1 = new Testusername();

        int ch;
        System.out.println("Welcome to student online exam portel");
        System.out.println("Please select one of the options from below");
        System.out.println("1.Press 1 to login");
        System.out.println("2.Press 2 to register");
        System.out.println("0.Press 0 to exit");

        lp : while(true)
        {
            System.out.println("Enter your choice:- ");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Welcome to the login portal for online examination portal");
            }
        }
    }
    
}
