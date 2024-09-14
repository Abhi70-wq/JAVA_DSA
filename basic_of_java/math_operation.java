//perform the basic math operation
//  scs.next().charAt(0); it is used to take single character or symbols as input

import java.util.Scanner;
public class math_operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operand 1: ");
        int a=sc.nextInt();
        System.out.println("Enter the operator(+,-,x,/): ");
        char op=sc.next().charAt(0);
        System.out.println("Enter the operand 2: ");
        int b=sc.nextInt();
        if(op=='x')
        System.out.println("Sum is: "+a+b);
        else if(op=='-')
        System.out.println("Subtraction is : "+(a-b));
        else if(op=='*')
        System.out.println("Multiplication is: "+a*b);
        else{
            if(b!=0){
                System.out.println("Division is: "+a/b);
            }
            else
            System.out.println("Divide by zer is not possible");
        }
    }
}
