import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        switch (isLeapYear(year)) {
            case 0:
                System.out.println(year + " is not a leap year.");
                break;
            case 1:
                System.out.println(year + " is a leap year.");
                break;
        }

        sc.close();
    }

    public static int isLeapYear(int year) {
        if (year % 400 == 0) {
            return 1; // Leap year
        } else if (year % 100 == 0) {
            return 0; // Not a leap year
        } else if (year % 4 == 0) {
            return 1; // Leap year
        } else {
            return 0; // Not a leap year
        }
    }
}
