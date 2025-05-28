import java.util.Scanner;
public class switchcase{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of a fruit (Mango, Apple, Orange):");
        String fruit = in.next();

        switch(fruit){
            case "Mango":
            System.out.println("King of fruits");
            break;
            case "Apple":
            System.out.println("A sweet red fruit");
            break;
            case "Orange":
            System.out.println("A juicy citrus fruit");
            break;
            default:
            System.out.println("Enter valid fruit name");
            break;
        }
        in.close();
    }
}