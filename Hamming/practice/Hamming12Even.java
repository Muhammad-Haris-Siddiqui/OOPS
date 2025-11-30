package practice;
public class Hamming12Even {

    // Function to create 12-bit Hamming code (even parity) from 8 data bits
    public static String makeHamming12Even(String data8) {
        // Step 1: Convert input string to int array
        int[] data = new int[8];
        for (int i = 0; i < 8; i++) {
            data[i] = data8.charAt(i) - '0';
        }

        // Step 2: Prepare 12-bit frame (positions 1..12)
        int[] frame = new int[12];
        int z = 0; // index for data array

        for (int pos = 1; pos <= 12; pos++) {

            // Check if pos is a power of 2 => parity bit
            if ((pos & (pos - 1)) == 0) {
                frame[pos - 1] = 0; // temporary parity
            } else {
                frame[pos - 1] = data[z++];
            }
        }

        // Step 3: Compute parity bits (even parity)
        for (int p = 1; p <= 8; p <<= 1) {
            int sum = 0;

            for (int j = p; j <= 12; j++) {
                if ((j & p) != 0) {
                    sum += frame[j - 1];
                }
            }

            // Even parity → parity = sum % 2
            frame[p - 1] = sum % 2;
        }

        // Step 4: Convert array to string
        StringBuilder sb = new StringBuilder();
        for (int b : frame) {
            sb.append(b);
        }
        return sb.toString();
    }

    // Testing the function
    public static void main(String[] args) {
        String input = "10110010"; 
        String hamming = makeHamming12Even(input);

        System.out.println("Input (8-bit):       " + input);
        System.out.println("Hamming (12-bit):    " + hamming);
    }
}
