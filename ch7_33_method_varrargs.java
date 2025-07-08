public class ch7_33_method_varrargs {
       static int sum(int a, int b ){
        return a+b;
       }
       static int sum(int a, int b ,int c ){
        return a+b+c;
       }
       public static void main(String[] args){
        System.out.println("Welcome to Vararges Tutorials");
        System.out.println("The sum of 4 and 5 is:" + sum( 4,5));
        System.out.println("The sum of the 10, 12 15 is:" +sum(10,12,15));
       }
    }
    
  

