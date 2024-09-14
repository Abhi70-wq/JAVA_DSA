
//  palindrome sequence in java for ex 121
//after converting it value should be same
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for num : ");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }

        if(temp==sum)
        System.out.println("Its is a palindrome");
        else
        System.out.println("It is not a palindrome");
    }
}
