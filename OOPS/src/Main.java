public class Main {
    public static void main(String[] args) {
        // Create a datatype to store 5 number and names
        int[] nums = new int[5];
        String[] names = new String[5];

        //to create a datatype to store student details
//        int[] rollno  = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];

        // Want to create a single datatpye insted of three
        //class
        Student[] students = new Student[5];



/*       // Assigning Values to student

        Student kunal = new Student();
        kunal.rollno = 10;
        kunal.name = "Kunal Kushwaha";
        kunal.marks = 90.7f;
        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);   */

        /*    //greet method by  Constructor
         Student kunal = new Student();
        kunal.greet();   */


            // will call the Student() Constructor and acces using this keyword
       /* Student kunal = new Student();
        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks); */

        //Will call the parameterized constructor
        Student kunal = new Student(15,"Pona",90.56f);
        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
    }
}
//create a class - first letter should be uppercase
class Student{
    int rollno;
    String name;
    float marks;

    void greet(){
        System.out.println("Hello "+this.name);
    }

    void greet(String name){
        System.out.println("Hello "+ name);
    }
    Student (){
        this.rollno = 10;
        this.name = "Kunal Kushwaha";
        this.marks = 90.7f;
    }

    Student (int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    Student (Student s){
        this.rollno = s.rollno;
        this.name = s.name;
        this.marks = s.marks;
    }
}
