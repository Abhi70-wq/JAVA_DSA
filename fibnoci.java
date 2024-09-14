// Fiboncci series
// use the while loop use the variables a abd b and sum in the loop assign b to a and sum of a+b to b
import java.util.Scanner;
public class fibnoci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;int b=1;
        System.out.println("Enter the value for N:");
        int N=sc.nextInt();
        int n=1;
        System.out.println("Fibnocci series");
        while(n<=N){
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
            n++;
        }
    }
}
