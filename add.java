import java.util.Scanner;

class Add {
    public static void main(String[] args) {
        int a, b, c, sum;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        a = sc.nextInt(); 
        b = sc.nextInt();
        c = sc.nextInt();
        
        sum = a + b + c ;
        System.out.println("The sum is: " + sum);
    }
}
