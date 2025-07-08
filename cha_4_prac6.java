
import java.util.Scanner;

public class cha_4_prac6 {
    public static void main(String[] args) {
        String website;
       System.out.println(" Check the Website ");
       Scanner sc = new Scanner(System.in);
       website = sc.next();
       if (website.endsWith(".org")) {
        System.out.println("This is an Organization Website");}
         else if (website.endsWith(".com")) {
            System.out.println("This is a commerial Website");
         }
         else if (website.endsWith(".in")) {
            System.out.println("This is an Indian");
         }
    
    }
}
