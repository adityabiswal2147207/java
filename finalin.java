//Coded by:- Aditya Biswal

//java program that will be illustrating the use of final with the concept of inheritance


//importing java libraries:-->
import java.lang.String;
import java.io.*;

//making a base class
abstract class details
{
    private String name;
    private String age;
    private String address;


    //making a parameterized constructor:-->
    public details(String name, String age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //now getting the name as final so any class extending details cannot override it
    public final String getName()
    {
        return name;
    }

    public final String getAge()
    {
        return age;
    }

    public final String getAddress()
    {
        return address;
    }


    abstract String getDetails();
}



//creating a derived class now
class person extends details
{
    public void per_det(String name, String age, String address)
    {
        //calling detail class constructor
        Super(name,age,address);
    }

    final String getDetails()
    {
        return this.getName();
        return this.getAge();
        return this.getAddress();
    }
}

public class finalin {
    details obj1 = new person("Aditya","24","Bangalore");

    System.out.println("Name: " + obj1.getName());
    System.out.println("Age: " + obj1.getAge());
    System.out.println("Address: " + obj1.getAddress());
}
