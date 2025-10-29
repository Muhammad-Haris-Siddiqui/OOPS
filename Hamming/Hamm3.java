
public class Hamm3{
    public static void main(String[] args) {
        int [] inp ={1,1,0,0,0,0,1,1,1,0,0,1};
        int [] msg ={2,9,9,1,9,1,0,0,9,0,0,1,1,1,0,0,9,1};
        String Parsch = "ODD";
        int msglenght = msg.length;
        int start = n;
        int sum = 0;
        for(int i=start;i<msglenght;i+=8){
            int f = 0;
            int k = i;
            while(f < start){
                sum += msg[k++]
                f++;
            }

        }
        if(Parsch.equals("ODD")){
            int r = sum % 2;
            if(r!=0){
                int h3 = 0;
            }
            else
               h3 = 1;
        }
        System.out.println(msglenght);
        System.out.println(s3);
        System.out.println(h3);

    }
    public static int getHammingBit (String parityScheme, int sum)
{
 int hammingBit;
  if (parityScheme.equalsIgnoreCase("ODD"))
 {
  int r = sum % 2;
  if (r != 0)
  hammingBit = 0;
  else
  hammingBit = 1;
 }
 else{
 int r = sum % 2;
 if (r != 0)
 hammingBit = 1;
 else
 hammingBit = 0;
 }
 return hammingBit;
}
}