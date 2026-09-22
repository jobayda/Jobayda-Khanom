package javaOperator;

public class OperatorsInJava {

/*
There are few operators in Java
1.Arithmatic
2. comparison
3. logical
4. assignment (=)
 */

public void arithmaticOperator(int a, int b){
    int result = a+b;
    System.out.println(result);
    int result1 = a-b;
    System.out.println(result1);
    int result2 = a*b;
    System.out.println(result2);
    float result3 = (float) a/b; // I'm forcing this to give me float value that's why I put (float) in parenthesis. It's called type casting.
    // In java equal means ==. But = means assignment. In java = value is assignment. Always right side assigns to left. Ex: a+b assigned to result.
    // will give me error for int because result will come as decimal
    System.out.println(result3);

}

public void comparisonOperator(int a, int b, int c){    // comparison statement always true or false. Symbols are <,>,<=,>=,==,!=(not equal)
 boolean result = a+b>c;
    System.out.println(result);
    boolean result1 = a-b+c<=10;
    System.out.println(result1);
    boolean result2 = a-b+c!=10;
    System.out.println(result2);
    boolean result3 = a-b+c==10;
    System.out.println(result3);

}

public boolean logicalOperator(int a, int b, int c){
// AND(&&)
//expression1 expression2 Result
//TRUE TRUE TRUE
//TRUE FALSE FALSE
//FALSE TRUE FALSE
//FALSE FALSE FALSE

// OR(||)
//expression1 expression2 Result
//TRUE TRUE TRUE
//TRUE FALSE TRUE
//FALSE TRUE TRUE
//FALSE FALSE FALSE
 boolean result = ((a+b>c)&&(b+c<a));
    // System.out.println(result);

    boolean result1 = ((a+b>c)||(b+c<a));
    // System.out.println(result1);
return result1;

}

public void assignmentOperator(){
    // In java equal means ==. But = means assignment. In java = value is assignment. Always right side assigns to left. Ex: a+b assigned to result.
    int a = 20;
    int b = 30;


}


    public static void main(String[] args) {
    OperatorsInJava obj = new OperatorsInJava();
    // obj.arithmaticOperator(20,23);
        // obj.comparisonOperator(5,7,9);
        System.out.println(obj.logicalOperator(10,15,20));

    }
}
