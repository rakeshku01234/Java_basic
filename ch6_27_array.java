

public class ch6_27_array {
   public static void main(String[] args) {
   //  int [] marks = {98,45,79,99,80};
    float [] marks =  {98.1f,45.5f,79.5f,99.5f,80.5f};
   System.out.println(marks.length);
   System.out.println(marks[0]);
   System.out.println(marks[1]);
   System.out.println(marks[3]);
  
  //Displaying the array (for loop)
  System.out.println("Printing using for loop");
  for(int i=0;i<marks.length; i++)
  {
   System.out.println(marks[i]);
  }
   // Displaying the array(for loop)
   System.out.println("Printing using for loop in reverse order");
     for(int i=marks.length-1; i>=0; i--)
  {
   System.out.println(marks[i]);
}
System.out.println("Printing using for each loop");
 for(float element: marks){
   System.out.println(element);
 }

   } 
}
