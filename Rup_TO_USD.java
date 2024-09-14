//Converting the indian currency to americian usd
import java.util.Scanner;
public class Rup_TO_USD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Indian currency in rupesss: ");
        double ind=sc.nextDouble();
        double usd=91;
        System.out.println("Indian rupees to American USD is : "+(ind/usd)+"USD");
    }
}
