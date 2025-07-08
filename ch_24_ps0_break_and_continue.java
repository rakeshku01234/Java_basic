public class ch_24_ps0_break_and_continue {
    public static void main(String[] args) {
//         int i;
//         for(i=0; i<5; i++){
//             System.out.println(i);
// System.out.println("Java is great");
//         if(i==3 ){
// System.out.println("Ending the loop");
//            break;
// 
int i;
for (i=0; i<5; i++) {
    
    if(i==2){
        System.out.println("Ending the loop");
        continue;
    }
    System.out.println(i);
    System.out.println("java is great");
     }
   }   
 }