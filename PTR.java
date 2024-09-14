// calculate principle intrest 
import java.util.Scanner;
public class PTR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle Amount: ");
        int p=sc.nextInt();
        System.out.println("Enter the rate: ");
        int r=sc.nextInt();
        System.out.println("Enter the timme period(In months): ");
        int t=sc.nextInt();
        int res=(p*t*r)/100;
        System.out.println("Principe intrest is : "+res);

    }
}
