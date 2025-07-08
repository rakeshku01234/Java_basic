import java.util.Scanner;
public class ch_18_ps02_switch {
    public static void main(String[] args) {
        char var;
        System.out.println("Enter your Var");
        Scanner sc = new Scanner(System.in);
        var = sc .next().charAt(0);
        switch(var){
            case'r':
            System.out.println("you are Rakesh");
            break;
            case'c':
            System.out.println("you are cow");
            break;
            case'h':
            System.out.println("you are Horse");
            break;
            default:
            System.out.println("Enjoy your name");
         }
         System.out.println("Thank for using my Java code!");
      
//    switch(var){
//       case"Rakesh":
//       System.out.println("you are Rakesh");
//       break;
//       case"Subham":
//       System.out.println("youn are Subham");
//       break;
//       case"Raj":
//       System.out.println("you are Raj");
//       break;
//       default:
//       System.out.println("Enjoy your name");
//    }
//    System.out.println("Thank for using my Java code!");

    //     switch(Age)
    //     {
    //     case 18: 
    //         System.out.println("you are going to becomenan Adualt");
    //         break;       
        
    // case 21:
    //   System.out.println("you are going to join a job");
    //  break;
    // case 56:
    //   System.out.println("you are going to get retired");
    //  break;
    // case 60:
    //   System.out.println("you are going to becomenan Adualt");
    //  break;
    // default:
    //  System.out.println("Enjoy your life");
    // }
    // System.out.println("Thanks for using my java Code");

   }
    }
