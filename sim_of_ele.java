//Take input of the numbers until user types "X"
// In this case use the infinite loop
//  input.equalsIgnoreCase("x") it ifnores the input string either lowecase or uppercase
//  double number=Double.parseDouble(input); it converts the input string into the double datatype
import java.util.Scanner;
public class sim_of_ele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0;
        while(true){
            System.out.println("Enter the value or enter 'x' to stop");
            String input=sc.next();
            if(input.equalsIgnoreCase("x")){
                break;
            }
            else{
                double number=Double.parseDouble(input);
                    sum+=number;
            }
        }
        System.out.println("sum of all numbers is : "+sum);
    }
}
