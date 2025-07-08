
import java.util.Scanner;
public class convert {
    public static void main(String[] args) {
      double kilometers;
      double conversionFactor = 0.621371;
      System.out.print("Convert kilometer to meter:\n"); 
      Scanner sc = new Scanner(System.in);
      kilometers = sc.nextDouble();
       double miles = kilometers*conversionFactor;

      System.out.print(kilometers +" kilometer is equal to " + miles + " miles.");

    }
}
