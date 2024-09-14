//to find the armstrong number for ex 1634
//   double n=String.valueOf(num).length(); it is inbuilt function in java it is used to find the length of the number first it converts to string 
// and then it calcilates the length
//Math.pow(rem, n) it math function it is used to find the power of a number

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int temp=num;
        double n=String.valueOf(num).length();
        double sum=0;
        while(num!=0){
            double rem=num%10;
            sum=sum+(Math.pow(rem, n));
            num=num/10;
        }
        if(temp==sum){
            System.out.println("its is armstrong number");
        }
        else{
            System.out.println("It is not a Armstrong number");
        }
    }
}
