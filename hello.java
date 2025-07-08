import java.util.Scanner;
public class hello {
 public static void main(String[]args){
    System.out.print("What is your name:\n");
    String name;
    Scanner sc = new Scanner(System.in); 
    name = sc.nextLine();
    System.out.print("Hello " + name + " have a good day!");
 }
 }