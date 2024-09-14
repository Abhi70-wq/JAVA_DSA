//Largest of two numbers using terinary operator
//Largest of three numbers usinh terniary operator
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value for b: ");
        int b=sc.nextInt();
        System.out.println("Enter the value for c: ");
        int c=sc.nextInt();
        System.out.println("Largest of two numbers betewen a and b is : "+(a>b?a:b));
        System.out.println("Largest of three numbers is : "+(a>b?a>c?a:c:b>c?b:c));
    }
}
