package dataType;

public class DataType {

// to execute command we use 'main' method. In a class we can have only 1 main method. If I run from class, it will still run from main method.
    public static void main(String[] args) {
        // byte -- Stores whole numbers from -128 to 127

        byte age = 2;  // age is the variable.
        byte apaAshbe = -20;

        // byte wrongData = 150; //error because exceeds limit 127
        System.out.println("My age is "+age); // when 'exit code' is 0 that means it run smoothly. Here 'out' is variable and 'println' is method.
        System.out.println("he is "+age + " years old");
        System.out.println("I am "+ 12 + " years old"); // just write 'sout' and press enter to write System.out.println

        // short -- Stores whole numbers from -32,768 to 32,767

        short rollnumber = 32767;
        // short wrongData1 = 32800; //error because exceeds limit 127
        System.out.println("My roll number is "+rollnumber);
        System.out.println("My roll is "+161);

        // int -- Stores whole numbers from -2,147,483,648 to 2,147,483,647

        int couseTaken = 2;
        // int wrongData2 = 30000000000 // crossed the limit of 2,147,483,647
        System.out.println("I took "+ couseTaken+ "courses in this semester");

        // long -- Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        long numbers = 9223372036854775L; // need to write 'L' at the end
        // long wrongdata3 = 92233720368547758075L; // exceeds limit 9,223,372,036,854,775,807
        System.out.println("The number is "+numbers +"very long");

        // float -- Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits

        float cgpa = 3.65f; // need to write 'f' at the end
        float wrongdata4 = 3.99999999999999999999999999999999999f;
        wrongdata4 = 3.99999f; // float can be reduced (numbers after decimal)
        System.out.println("My cgpa is "+ cgpa);

        // double -- Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits

        double points = 3.66666666666666666666666666666666666666666666666666666666;
        double wrongdata5 = 3.4666666666666666666666666666666666; // it's not wrong because it will be increased in future.
        System.out.println("This decimal point is "+ "very big");

        // char -- Stores a single character/letter or ASCII values

        char example = 'A'; // char should be always in single character and in single quotation.
        // char wrongdata6 = "B"; // wrong because it's in double quotation
        // char wrongdata7 = 'AB'; // wrong as we used more than one character
        System.out.println("My grade in STST650 is "+example);

        // boolean -- it takes only true or false.

        boolean isStudent = true;

        String name = "jobayda"; // String should start with capital 'S' because it's a class as well, should be in double quotation and can hold more than one character.

        System.out.println("My name is "+ name);
        // 5 data type that we use a lot are: int, float, char, String, boolean
        // Q: How to go to string class directly? To find sting class in Java click 'String' and hold ctrl and click String again.


    }
}