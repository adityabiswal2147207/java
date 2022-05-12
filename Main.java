import java.io.*;
import java.util.*;
/*public class student{
     public static void main(String[] args) {
         System.out.println("Command-Line arguments is => ");
    
         // loop through all arguments
         for(String str: args) {
           System.out.println(str);
         }
       }
 }*/

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("[1] for Christ university Central Campus");
        System.out.println("[2] for Christ University Bannergetta Campus");
        System.out.print("Enter your choice => ");
        Scanner ch = new Scanner(System.in);
        int choice = ch.nextInt();
        if (choice == 1) {
            System.out.println("**********WELCOME TO CHRIST (DEEMED TO BE UNIVERSITY) Central Campus**********");
            christ obj = new christ();
            obj.insertStudents();
            obj.exam();
            obj.result();
            obj.scholarship();
            obj.campus();

        } else {
            System.out.println("**********WELCOME TO CHRIST (DEEMED TO BE UNIVERSITY) Bannergetta Campus**********");
            ami obj1 = new ami();
            obj1.insertStudents();
            obj1.exam();
            obj1.result();
            obj1.scholarship();
            obj1.campus();

        }
    }
}
interface UGC {
    void exam();

    void result();
}

interface university extends UGC {
    void scholarship();

    void campus();
}

class College {
    Scanner sc = new Scanner(System.in);
    student[] r = new student[10];

    // [s1, s2....s10]
    void insertStudents() {
        System.out.println("Enter the number of details you want to enter : ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            student obj = new student();
            obj.input();
            r[i] = obj;
        }
        for (int i = 0; i < size; i++) {
            r[i].display_studentdetails();
            System.out.println("---------------------------------");
        }
    }

}

class christ extends College implements university {
    public void exam() {
        System.out.println("Enter Subject Name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
    }

    public void result() {
        System.out.println("Enter Subject Id : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
    }

    public void scholarship() {
        System.out.println("Enter Scholarship Id : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
    }

    public void campus() {
        System.out.println("Enter Campus Id : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
    }
}

class ami extends College implements university{
    private int scholarship;
    private String campus;
    private String exam;
    private int result;
    Scanner sc = new Scanner(System.in);


    public void exam() {
        System.out.println("Enter Subject Name : ");
        this.exam = sc.next();
    }

    public void result() {
        System.out.println("Enter Subject Id : ");
        this.result = sc.nextInt();
    }

    public void scholarship() {
        System.out.println("Enter Scholarship Id : ");
        this.scholarship = sc.nextInt();
    }

    public void campus() {
        System.out.println("Enter Campus Id : ");
        this.campus = sc.nextLine();
    }

   

}

class student {

    String name;
    int result;
    int scholarship;
    String campus;

    Scanner sc = new Scanner(System.in);

    void display_studentdetails() {
        System.out.println("-------------------------------------");
        System.out.println("Name is:" + this.name);
        System.out.println("Result  is:" + this.result);
        System.out.println("Scholarship amount is:" + this.scholarship);
        System.out.println("Campus Id is:" + this.campus);
        System.out.println(" ");

    }

    void input() {
        System.out.print("Enter name => ");
        this.name = sc.nextLine();
        
        System.out.print("Enter campus =>");
        this.campus = sc.nextLine();

        this.result = -1;
        boolean flag = false;
        sc.nextLine();

        while(this.result < 0 || this.result > 100){
            if(flag){
                System.out.println("Enter number between 0-100");
            }
            try {
                System.out.print("Enter result => ");
                this.result = sc.nextInt();
                flag = true;
            } catch (Exception e) {
                sc.nextLine();

                //TODO: handle exception
                System.out.println("Enter valid number (0-100)");
            }
            
        }
        this.scholarship = -1;
        while(this.scholarship < 0 || this.scholarship > 50000){
            if(flag){
                System.out.println("Enter number between 0-50000");
            }
            try {
                System.out.print("Enter Scholarship Amount =>");
                this.scholarship = sc.nextInt();
                flag = true;
            } catch (Exception e) {
                sc.nextLine();

                //TODO: handle exception
                System.out.println("Enter valid number (0-50000)");
            }
            
        }
        
    }
}

