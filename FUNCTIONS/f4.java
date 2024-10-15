package FUNCTIONS;
import java.util.Scanner;
public class f4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);

    }
    static void prime(int n){
        int count=0;
        for(int i=2;i<n;i++){
            if(isprime(i)){
                count++;
            }
        }
        System.out.println("count"+count);
    }
    static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%1==0){
                return false;
            }
        }
        return true;
    }
}
