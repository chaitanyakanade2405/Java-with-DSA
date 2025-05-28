import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter your rollno.: ");
        // // int rollno = input.nextInt();
        // // System.out.println("Your rollno. is: " + rollno);
        // // input.close();

        // float marks=input.nextFloat();
        // System.out.println("Your marks are: " + marks);

        String name=input.nextLine();
        System.out.println("Your name is: " + name);
        input.close();
    }
}
