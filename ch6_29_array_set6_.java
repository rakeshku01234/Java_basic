





public class ch6_29_array_set6_ {
    public static void main(String[] args) {
      
      // practice problem 1

//       float [] marks = {45.5f, 67.8f, 63.4f, 99.2f, 100.0f };  
//     float sum = 0;
//      for(float element:marks){
//         sum = sum + element;
//       }
//       System.out.println("The value of sum is " + sum);
//     }
// }

// practice problem 2

// float [] marks = {45.5f, 67.8f, 63.4f, 99.2f, 100.0f };  
// float num = 45.57f;
// boolean isInArray = false;
//  for(float element:marks){
//   if(num == element){
//  isInArray = true;
//  break;
//   }
//   }
//   if(isInArray){
//     System.out.println("The vlaue is present in the array");
//   }
//   else{
//     System.out.println("The value is not present in the array");

//   }

// practice problem 3
// float [] marks = {45.5f, 67.8f, 63.4f, 99.2f, 100.0f };
// float sum = 0;
//      for(float element:marks){
//         sum = sum + element;
//       }
//       System.out.println("The value average marks  is " + sum/marks.length);
//     }
  

// practice problem 4
// int [][] mat1 = {{1,2,3},{4,5,6}};
// int [][] mat2 = {{2,6,13},{3,7,1}};
// int [][] result = {{0,0,0},{0,0,0}};
  
// for (int i=0; i<mat1.length; i++) {
//     for(int j=0; j<mat1[i].length; j++){
//       System.out.format("Setting value for i=%d and j=%d\n" , i,j);
//       result[i][j] = mat1[i][j] + mat2[i][j];
      
//     }
//   }
//     for (int i=0; i<mat1.length; i++) {
//       for(int j=0; j<mat1[i].length; j++){
//       System.out.print(result[i][j] + " ");
//         result[i][j] = mat1[i][j] + mat2[i][j];
        
//       }
//       System.out.println("");
//     }


// // practice problem 5
//  int  [] arr = {1,2,3,4,5,6};
//  int l = arr.length;
//  int n = Math.floorDiv(l,2);
//  int temp;
//  for(int i=0; i<n; i++){
//   temp = arr[i];
//   arr[i] = arr[l-i-1];
//   arr[l-i-1] = temp;
//  }
// for(int element:arr){
//   System.out.print(element +" ");

// }


// practice problem 6
// int  [] arr = {1,2,3,4,5,6};
// int max = 0;
// for( int e: arr){
//   if(e>max){
//   max = e;
// }
// }
// System.out.println("the value of maximum element is:" + max);
    
// System.out.println(Integer.MIN_VALUE);
// System.out.println(Integer.MAX_VALUE);

// }}

// practice problem 7
boolean isSorted = true;
int  [] arr = {1,2,3,4,5,6};
  for(int i = 0; i < arr.length; i++){
  if(arr[i] > arr[1+1]){
    isSorted = false;
    break;
  }
  if(isSorted){
    System.out.println("The Array is sorted");
  }
  } 
    }
  }