//To check enterd year is a leap or not 20
import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the year: ");
       int year=sc.nextInt();
       if((year%4==0) && (year%100!=0 || year%400==0 ))
        System.out.println("It is a Leap year");
        else
            System.out.println("Its not leap year");
    }
}
