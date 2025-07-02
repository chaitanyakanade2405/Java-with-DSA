import java.util.Scanner;
import java.util.Arrays;
public class arrobj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
        str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
        in.close();
    }
}

//arays are mutable, so you can change the values of the elements after the array is created.
//strings are immutable, so you cannot change the value of a string after it is created.