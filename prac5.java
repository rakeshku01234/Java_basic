
import java.util.Scanner;

public class Prac5 {
    public static String encrypt(String text, int[][] key) {
        text = (text.length() % 2 != 0) ? text + "X" : text;
        StringBuilder cipher = new StringBuilder();
        for (int i = 0; i < text.length(); i += 2) {
            int[] block = { text.charAt(i) - 'A', text.charAt(i + 1) - 'A' };
            int[] encryptedBlock = matrixMultiply(key, block);
            cipher.append((char) (encryptedBlock[0] + 'A')).append((char) (encryptedBlock[1] +
                    'A'));
        }
        return cipher.toString();
    }

    public static String decrypt(String text, int[][] key) {         StringBuilder plain = new StringBuilder();         int[][] inverseKey = inverseMatrix(key); 
        if (inverseKey == null) { 
            return "Error: Key matrix is not invertible!"; 
        } 
        for (int i = 0; i < text.length(); i += 2) { 
            int[] block = { text.charAt(i) - 'A', text.charAt(i + 1) - 'A' };             int[] decryptedBlock = matrixMultiply(inverseKey, block); 
            plain.append((char) (decryptedBlock[0] + 'A')).append((char) (decryptedBlock[1] + 
'A')); 
return plain.toString();
    }

    private static int[] matrixMultiply(int[][] matrix, int[] vector) {
        int val1 = (matrix[0][0] * vector[0] + matrix[0][1] * vector[1]) % 26;
        int val2 = (matrix[1][0] * vector[0] + matrix[1][1] * vector[1]) % 26;

        return new int[] {
                (val1 + 26) % 26,
                (val2 + 26) % 26
        };
    }

    private static int[][] inverseMatrix(int[][] matrix) {
        int det = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) % 26;
        if (det < 0)
            det += 26;
        if (invDet == -1)
            return null;
        return new int[][] {
                { (matrix[1][1] * invDet) % 26, (-matrix[0][1] * invDet + 26) % 26 },

                { (-matrix[1][0] * invDet + 26) % 26, (matrix[0][0] * invDet) % 26 }
        };
    }

    private static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++)
            if ((a * x) % m == 1)
                return x;
        return -1; // No modular inverse exists
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plaintext (uppercase only): ");
        String text = sc.next().toUpperCase();

        System.out.println("Enter 2x2 key matrix:");
        int[][] key = { { sc.nextInt(), sc.nextInt() }, { sc.nextInt(), sc.nextInt() } };

        String encrypted = encrypt(text, key);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);

        sc.close();

    }

}