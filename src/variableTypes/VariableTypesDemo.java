package variableTypes;

import javax.sound.sampled.FloatControl;

public class VariableTypesDemo {
    /*
    Variable has 3 parts.
    1) declaring
    2) defining
    3) using
     */

    /*
    There are 2 types of variables.
    1) Instance variable/global variable
    2) Local variable
    3) parameter
     */
    // Method also called as 'functions'.


    String location = "Texas"; // global or instance or object variable (inside the class but not inside the method)

    public static void method1(){  // custom method. Here, public static void method1() called method signature. And rest whatever in the block {} called method body.
        int zipcode = 77842;  // local variable
        System.out.println("method1");
        System.out.println(zipcode);
       //  location = "College station";
    }

    public static void main(String[] args) {
        System.out.println("location"); // need to print variables in the main method to execute.
        method1(); // I need to call custom method in the main method to execute.
        String name; // declare
        name = "Jobayda"; // define
        System.out.println(name); // use

        String work = "Software QA Engineer"; // declare and define. It is a local variable (it's borns and dies inside the method. It can be used in any place of the project.)
        System.out.println(work);

    }

}
