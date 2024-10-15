/*In this if the both variable is referencing to save object then using a==b for comaprision gives true else if both are referencing to different itgives false */
/*if  both varibales is referencing to different objets then use a.equals(b) to compare because it checks by value insted of charcyer comparision */
/* Sting a="abhi" and string b="abhi" thrn a==b true */
/* String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(s1.equals(s2)); the it gives true answer*/
public class comparision {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
