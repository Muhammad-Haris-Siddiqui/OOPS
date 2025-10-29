public class hamming2 {
    public static void main(String[] args) {
        
        
        int[] msgBit = { 2, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0 };

        int h1 = 0;
        int s1 = 0;
        for (int i = 1; i < msgBit.length; i+=2) {
            s1 = s1 + msgBit[i ];
        }
        if ((s1%2) == 0) {
            h1 = 1;
        }else{
            h1 = 0;
        }

        System.out.println(h1);


        int h2 = 0;
        int s2 = 0;
        for (int i = 2; i < msgBit.length; i+=4) {
            s2 = s2 + msgBit[i ];

            if (i + 1 < msgBit.length) {
                s2 += msgBit[i + 1];
            }
        }
        if ((s2%2) == 0) {
            h2 = 1;
        }else{
            h2 = 0;
        }

        System.out.println(h2);


        int h3 = 0;
        int s3 = 0;
        for (int i = 1; i < msgBit.length; i+=8) {
            s3 = s3 + msgBit[i];

            if (i + 1 < msgBit.length) {
                s3 += msgBit[i + 1];
            }
            if (i + 2 < msgBit.length) {
                s3 += msgBit[i + 2];
            }
            if (i + 3 < msgBit.length) {
                s3 += msgBit[i + 3];
            }
        }
        if ((s3%2) == 0) {
            h3 = 1;
        }else{
            h3 = 0;
        }

        System.out.println(h3);

        int h4 = 0;
        int s4 = 0;
        for (int i = 1; i < msgBit.length; i+=16) {
            s4 = s4 + msgBit[i ];

            if (i + 1 < msgBit.length) {
                s4 += msgBit[i + 1];
            }
            if (i + 1 < msgBit.length) {
                s4 += msgBit[i + 2];
            }
            if (i + 1 < msgBit.length) {
                s4 += msgBit[i + 3];
            }
            if (i + 1 < msgBit.length) {
                s4 += msgBit[i + 4];
            }
            if (i + 1 < msgBit.length) {
                s4 += msgBit[i + 5];
            }
            if (i + 1 < msgBit.length) {
                s4 += msgBit[i + 6];
            }
            if (i + 1 < msgBit.length) {
                s4 += msgBit[i + 7];
            }
        }
        if ((s4%2) == 0) {
            h4 = 1;
        }else{
            h4 = 0;
        }

        System.out.println(h4);
    }
}