import javax.swing.*;
public class complex{

    public static void main(String [] args){
        int real, imag;
        String str1, str2;
        str1 = JOptionPane.showInputDialog(null,"Enter the real number:- ","Enter the number",JOptionPane.QUESTION_MESSAGE);
        real=Integer.parseInt(str1);
        str2 = JOptionPane.showInputDialog(null,"Enter the imaginary number:- ","Enter the number",JOptionPane.QUESTION_MESSAGE);
        imag=Integer.parseInt(str2);


        Complex comp1 = new Complex(real,imag);

        str1 = JOptionPane.showInputDialog(null,"Enter the real number:- ","Enter the number",JOptionPane.QUESTION_MESSAGE);
        real=Integer.parseInt(str1);
        str2 = JOptionPane.showInputDialog(null,"Enter the imaginary number:- ","Enter the number",JOptionPane.QUESTION_MESSAGE);
        imag = Integer.parseInt(str2);

        Complex comp2 =  new Complex(real,imag);


        Complex comp3 = new Complex();
            comp3 = comp1.add(comp1, comp2);
        System.out.println("\nThe additon of them is:-> "+comp3.real+"+"+comp3.imag+"i");


        Complex comp4 = new Complex();
            comp4 = comp1.sub(comp1,comp2);
        System.out.println("\nThe substraction of them is:-> "+comp4.real+"+"+comp4.imag+"i");
    }
};

class Complex{
    int real,imag;


    Complex(){
        real = 0;
        imag = 0;
    }

    Complex(int r, int i){
        real = r; 
        imag = i;
    }

    Complex add(Complex comp1, Complex comp2){
        Complex comp3 = new Complex();
        comp3.real = comp1.real + comp2.real;
        comp3.imag = comp1.imag + comp2.imag;
        return(comp3);
    }

    Complex sub(Complex comp1, Complex comp2){
        Complex comp4 = new Complex();
        comp4.real = comp1.real - comp2.real;
        comp4.imag = comp1.imag - comp2.imag;
        return(comp4);
    }
}