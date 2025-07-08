


public class ch7_31_array_method{


     static int logic(int x , int y) {
        int z;
        if(x>y){
         z = x+y;
        }
        else{
           z = (x + y)*5;
        }
        return z;

    }
public static void main(String[] args){
int a = 5;
int b = 6;
// int c = (a+b)*5;
// System.out.println("");
// System.out.println(c);
int c;
// ch7_31_array_method obj = new ch7_31_array_method();

c = logic(a,b);
int a1 = 1;
int b1 = 4;
int c1;
if( a1>b1){
    c1 = a+b;
}
   
c = logic(a1,b1);
System.out.println(c);
}
}