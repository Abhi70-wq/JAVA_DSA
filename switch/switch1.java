import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
       switch(a){
            case "apple":System.out.println("Its apple");
                break;
            case "mango":System.out.println("its mango"); 
                break;
            case "water":System.out.println("its watermilion");
                break;
            default:System.out.println("invalid input");
        }
        // its is the enhanced switch statements
        switch (a) {
            case "apple" ->System.out.println("its mango");
            case "mango"->System.out.println("its mango");
            case "water"->System.out.println("its watermilion");
            default->System.out.println("invalid choice");
        }
    }
}
