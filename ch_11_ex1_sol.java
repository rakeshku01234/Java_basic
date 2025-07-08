import java.util.Scanner;

public class ch_11_ex1_sol {
   public static void main(String[] args) {
    int Physics,Chemistry,Math,English,Sst;

  Scanner sc = new Scanner(System.in);
System.out.println("Enter your Physics marks:");
 Physics =  sc.nextInt();
System.out.println("Enter your Chemistry marks: ");
  Chemistry = sc.nextInt();
System.out.println("Enter your Math marks: ");
  Math = sc.nextInt();
 System.out.println("Enter your English marks:");
  English = sc.nextInt(); 
  System.out.println("Enter your Sst marks:");
  Sst = sc.nextInt(); 
float Percentage = ((Physics + Chemistry + Math + English + Sst )/500.0f)*100;
System.out.println("Percentage:");
System.out.println(Percentage);
   } 
}
