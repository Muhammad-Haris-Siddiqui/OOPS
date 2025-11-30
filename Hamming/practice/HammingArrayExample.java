package practice;
import java.util.Arrays;
import java.util.Scanner;

public class HammingArrayExample {

    // Input: 8-bit data array
    // Output: 12-bit Hamming array (even parity)
    public static int[] makeHamming12Even(int[] data8) {
        int[] frame = new int[12];
        int z = 0; // index for data bits

        // Fill frame with parity placeholders and data bits
        for (int pos = 1; pos <= 12; pos++) {
            if ((pos & (pos - 1)) == 0) {  // parity bit position
                frame[pos - 1] = 0; // temporary parity
            } else {
                frame[pos - 1] = data8[z++];
            }
        }

        // Calculate parity bits (even parity)
        for (int p = 1; p <= 8; p <<= 1) {
            int sum = 0;
            for (int j = p; j <= 12; j++) {
                if ((j & p) != 0) sum += frame[j - 1];
            }
            frame[p - 1] = sum % 2; // even parity
        }

        return frame; // return array directly
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input as int array
        int[] data8 = new int[8];
        System.out.println("Enter 8 data bits (0 or 1):");
        for (int i = 0; i < 8; i++) {
            data8[i] = sc.nextInt();
        }

        // Generate Hamming
        int[] hamming12 = makeHamming12Even(data8);

        // Display array
        System.out.println("Hamming 12-bit array:");
        System.out.println(Arrays.toString(hamming12)); // [1,0,1,...]
    }
}
