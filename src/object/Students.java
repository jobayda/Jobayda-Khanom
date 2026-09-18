package object;

public class Students {

  String name; // global/instance/object variables
  String location;
  int age;
  char gender;
  boolean isStudent;
  String schoolName;


  public void watchingReels(){
      System.out.println("love watching reels instead of study");

  }


    public static void main(String[] args) {
     Students obj = new Students();
     //I just declare the variable; didn't define. I created an object of the class so I can change the value of the variables.
        obj.name = "Rony";
        obj.location = "TX";
        obj.age = 25;
        obj.gender = 'M';
        obj.isStudent = true;
        obj.schoolName = "UTS";
        obj.watchingReels();

        Students obj1 = new Students();
        obj1.name = "Jobayda";
        obj1.location = "TX";
        obj1.age = 24;
        obj1.gender = 'F';
        obj1.isStudent = false;
        obj1.schoolName = "UTS";
        obj1.watchingReels();

        Students obj2 = new Students();
        obj2.name = "Versha";
        obj2.location = "NC";
        obj2.age = 25;
        obj2.gender = 'F';
        obj2.isStudent = true;
        obj2.schoolName = "UTS";
        obj2.watchingReels();







    }


}
