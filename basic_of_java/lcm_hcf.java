// Take two number as input comput HCF and LCM

import java.util.Scanner;
public class lcm_hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A(Enter the larger number): ");
        int a=sc.nextInt();
        System.out.println("Enter the value of B(Enter the smaller number): ");
        int b=sc.nextInt();
        int A=a;int B=b;
        int rem;
        while(b!=0){
            rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("The HCF of two numbers is : "+a);
        System.out.println("The LCM of two numbers is : "+(A*B)/a);
    }
}
