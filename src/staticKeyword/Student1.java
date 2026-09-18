package staticKeyword;

public class Student1 {

    String name; // global/instance/object variables
    String location;
    int age;
    char gender;
    boolean isStudent;
    static String schoolName;


    public void watchingReels(){
        System.out.println("love watching reels instead of study");

    }
    public static void study(){
        System.out.println("I must study.");
    }

    public static void main(String[] args) {
        Student1 obj = new Student1();
        //I just declare the variable; didn't define. I created an object of the class so I can change the value of the variables.
        obj.name = "Rony";
        obj.location = "TX";
        obj.age = 25;
        obj.gender = 'M';
        obj.isStudent = true;
        obj.schoolName = "UTS";
        obj.watchingReels();
        Student1.study();

        Student1 obj1 = new Student1();
        obj1.name = "Jobayda";
        System.out.println(obj1.name);
        obj1.location = "TX";
        obj1.age = 24;
        obj1.gender = 'F';
        obj1.isStudent = true;
        obj1.schoolName = "UTS";
        obj1.watchingReels();

        Student1 obj2 = new Student1();
        obj2.name = "Versha";
        obj2.location = "NC";
        obj2.age = 25;
        obj2.gender = 'F';
        obj2.isStudent = true;
        obj2.schoolName = "UTS";
        obj2.watchingReels();

        Student1 obj3 = new Student1();
        obj3.name = "Bashir";
        obj3.location = "NY";
        obj3.age = 25;
        obj3.gender = 'M';
        obj3.isStudent = false;
        obj3.schoolName = "UTS";

        // Any variable common to all objects called static variable. Ex: UTS







    }


}
