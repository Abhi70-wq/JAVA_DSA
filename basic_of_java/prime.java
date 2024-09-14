
// here additionally in the while loop use (c*c) beacuse it decreases the time complexity 
// for ex 2*18=36 there is no need to check the additionally 18*2=36
// it decares the time complexity by half
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for n:  ");
        int n=sc.nextInt();
        int c=2;
        while(c*c<n-1){
            if(n%c==0)
            System.out.println("its nota prime number ");
            else{
                c++;
            }
        }
        System.out.println("Its a prime number");
    }
}
