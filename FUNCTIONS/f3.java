package FUNCTIONS;
import java.util.Scanner;
public class f3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeornot(n);
    }
    static void primeornot(int n){
        int i=2;
       while (i*i<n-1) {
        if(n%i==0){
            System.out.println("non prime");
            return;
        }
        else{
            i++;
        }
       }
       System.out.println("prime");
       
    }
}
