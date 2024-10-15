package FUNCTIONS;
import java.util.Scanner;
public class f2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        age1(age);
    }
    static void age1(int age){
        if(age<18){
            System.out.println("Not elifible");
        }
        else
        System.out.println("eligible");
    }
}
