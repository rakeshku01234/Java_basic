import java.util.Scanner;

public class ch_18_ps0 {  
     public static void main(String[] args) {
    int age;
    System.out.println("Enter your age");
    Scanner sc = new Scanner(System.in);
 age = sc.nextInt();
 if(age>46){
    System.out.println("you are experienced");
}
else if(age>36){
    System.out.println("you are semi-experienced");
  }
  else if(age>26){
System.out.println("you are semi-semi-experienced");
  }
  else{
    System.out.println("you are not experienced");
  }
 } 
}
