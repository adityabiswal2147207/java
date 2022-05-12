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
    void validate() throws invalidusername{
        Scanner sc = new Scanner(System.in);
        try
        {
            String name;
            System.out.println("Enter your username for the account");
            name = sc.next();

            if(name.length()<6 || name.length() == 0)
            {
                System.out.println("Sorry the username cannot be less than 6 characters");
                throw new invalidusername("Check your username again!!!");
            }
            else
            {
                System.out.println("Welcome "+ name);
            }
        }
        catch(invalidusername ex)
        {
            System.out.println("Exception caught");
            System.out.println("Exception occured: "+ex);
        }
    }
}

public class except{
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
                    Testusername obj = new Testusername();
                    obj.validate();
            }
        }
    }
    
}
