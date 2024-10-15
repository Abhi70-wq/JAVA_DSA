package FUNCTIONS;
import java.util.Scanner;
public class f1{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("max is"+max(a,b,c));
    }
    static int max(int a,int b,int c){
        return a>b?a>c?a:c:b>c?b:c;
    }
}
