import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for N: ");
        int n=sc.nextInt();
        if(n%2==0)
        System.out.println("It is even number");
        else
        System.out.println("Its is odd number");
    }
}
