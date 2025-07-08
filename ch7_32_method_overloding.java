 
public class ch7_32_method_overloding{
    // static void change(int a){
//         a = 98;
//     }
//     static void change2(int []arr ){
//        arr[0] = 98;
//     }
//     static void Joke(){
//         System.out.println("i am invented a new word! \n" + "Plagiarism!");

//     }
//     public static void main(String[] args) {

        
//     int x = 45;
//     change(x);
//     System.out.println("The value of after running change is - " + x);
    
     
//     int [] marks = {52,73,77,89,98,94};
//     change2(marks);
//     System.out.println("The value of after running change is - " + marks[0]);

   static void foo(){
    System.out.println("Good morning bro!");
}
   static void foo(int a){
    System.out.println("Good mornig" + a + "bro!");
}
static void change(int a, int b){
    a = 98;
}
static void change2(int[]arr){
    arr[0] = 98;
}

static void tellJoke(){
System.out.println("I invented a new word! \n" + "Plagiarism!");
}
 
public static void main(String [] args){
 foo();
 
}
}