
import java.util.Scanner;

public class cha_4_prac4 {
    public static void main(String[] args) {
        int day;
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        System.out.println("Enter the day of week!");
  switch (day) {
      case 1:
      System.out.println("Monday");
          break;
          case 2:
      System.out.println("Tuesday");
          break;
          case 3:
      System.out.println("Wednesday");
          break;
          case 4:
      System.out.println("Thursday");
          break;
          case 5:
          System.out.println("Friday");
              break;
              case 6:
      System.out.println("Saturday");
          break;
          case 7:
      System.out.println("Sunady");
          break;

      default:
System.out.println("No day of week!");
  }
    }
}
