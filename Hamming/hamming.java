public class hamming {
    public static int getHammingBit(String parityScheme, int sum) {
        int hammingBit,a;
        int
        for(a=1,a<=array.length,a++){
            int i=2^a
        }

        if (parityScheme.equalsIgnoreCase("ODD")) {
            int r = sum % 2;
            if (r != 0)
                hammingBit = 0;
            else
                hammingBit = 1; 
        } else {
            int r = sum % 2;
            if (r != 0)
                hammingBit = 1;
            else
                hammingBit = 0;
        }
        return hammingBit;
    }
}