//importing class scanner
import java.util.Scanner;


public class exam {
    public static void main(String[] args) {
        int ch;  //for storing the users choice

        Scanner sc = new Scanner(System.in);

        //Displaying the menu:-->
        System.out.println("===========Online Examination System=============");
        System.out.println("\n\n\tSelect your subject from below options to give the exams\n");
        System.out.println("\n1.Java Programming Language");
        System.out.println("\n2.C Programming Language");
        System.out.println("\n3.Python Programming Language");
        System.out.println("\n4.C++ Programming Language");
        System.out.println("\n5.Web Stack Development");
        System.out.println("\n6.Computer Networks");
        System.out.println("\n7.Exit from the application");

        lp: while (true) {
            System.out.println("\nMake Your Choice:- ");
            ch = sc.nextInt();   //Reading the users choice and storing it to ch variable

            switch(ch)
            {
                case 1: //for java programming language
                    System.out.println("\nJava Programming Language Exam");
                    java();
                break;

                case 2: //for c programming language
                    System.out.println("\nC Programming Language Exam");
                    clan();
                break;

                case 3: //for python programming language
                    System.out.println("\nPython Programming Language Exam");
                    python();
                break;

                case 4: //for C++ programming language 
                    System.out.println("\nC++ Programming Language Exam");
                    cpp();
                break;

                case 5: //for webstack development
                    System.out.println("\nWeb Stack Development Exam");
                    web();
                break;

                case 6: //for computer networks
                    System.out.println("\nComputer Networks Exam");
                    cn();
                break;

                case 7: //to exit from application
                //exiting from the switch case as well as from the while loop
                break lp;

                default:
                    System.out.println("\nInvalid Choice! Make a correct choice");
            }
            
        }

        
    }





    static void java(){
        Scanner sc = new Scanner(System.in);
        int score;
        int opt;
        System.out.println("\nWelcome to Java Programming Test");
        jv:while(true){
            System.out.println("\nPress 1 to Start the test");
            opt = sc.nextInt();
            


        }
        
    }
    

    static void clan(){
        System.out.println("\nWelcome to C Programming Test");

    }

    static void python(){
        System.out.println("\nWelcome to Python Programming Test");

    }

    static void cpp(){
        System.out.println("\nWelcome to C++ Programing Test");

    }

    static void web(){
        System.out.println("\nWelcome to Web Development Test");

    }
    
    static void cn(){
        System.out.println("\nWelcome to Computer Networks Test");

    }
}