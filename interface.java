//coded by:- Aditya Biswal
//implementing the concept of interface
import java.io.*;
import java.lang.String;



interface Student{
    void displayDetails(int a, int b);
    void displaySubjects(String c);
}

class semester implements Student{
    int reg_no;
    int batch_year;
    String subjects;

    public void displayDetails(){
        
    }
}