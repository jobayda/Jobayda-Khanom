package parameterDemo;

public class Parameter {

    public void add(int a, int b){  // it's a custom method. Here a and b variables are parameter.
        // parameters are alos local variables because they are being declared inside the method. we're only declaring variables
        // int a = 300;
        // int b = 68;
        System.out.println(a+b);
    }

    public void substruction(int a, int b){
       add(10,10);
        // System.out.println(a-b);
        int c = a-b;
        System.out.println(c);
    }

    public void printName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Parameter obj = new Parameter();
        // obj.add(300, 68);
        // obj.add(21,9);
        // obj.add(30); I only gave value for a; not b

       // Parameter.add(); if I make add method as a 'static' then I can only call the method
        obj.substruction(21,9);
        obj.printName("Jobayda");



    }


}
