public class ch6_28_array_type {
    public static void main(String[] args) {
         int [] marks;     //A 1-D Array
         int [][] flats;  //A 2-D Array 
        int i, j;
        flats = new int [2][3];
        flats [0][0] = 101;
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;
        flats [1][1] = 202;
        flats [1][2] = 203;
        
        System.out.println("Printing a 2-D array using a loop:");
        for (i = 0; i<flats.length; i++) {
            for (j = 0; j<flats[i].length; j++) { 
                System.out.print(flats[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
