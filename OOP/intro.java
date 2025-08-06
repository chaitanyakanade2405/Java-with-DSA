package OOP;
import java.util.ArrayList;
import java.util.Arrays;
public class intro {
    public static void main(String[] args) {
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        //Student chaitanya;
        //System.out.println(Arrays.toString(students));

       Student chaitanya = new Student();
       
       chaitanya.changeName("Spiderman");
       chaitanya.greeting();

       Student random = new Student();
       System.out.println(random.name);
    //    System.out.println(chaitanya.rno);
    //    System.out.println(chaitanya.name);
    //    System.out.println(chaitanya.marks);

    Student one = new Student();
    Student two = one;

    one.name = "Something xyz";

    System.out.println(two.name);
       
    }
}

    class Student{
        int rno;
        String name;
        float marks = 90;

        void greeting(){
            System.out.println("Hello, How are you? " + this.name);
        }

        void changeName(String newName){
            name = newName;
        }

        Student(Student other){
             this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }
        Student(){
            this.rno = 23;
            this.name = "Chaitanya Kanade";
            this.marks = 95.6f;
        }

        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }

