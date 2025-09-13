import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LinkedList> llArr = new ArrayList<>();
        llArr.add(new LinkedList(3, 2));  // idx0
        llArr.add(new LinkedList(1, 3));  // idx1
        llArr.add(new LinkedList(4, -1)); // idx2
        llArr.add(new LinkedList(2, 0));  // idx3

        boolean[] headFinder = new boolean[llArr.size()];
        for(int i=0 ; i < headFinder.length ; i++){
            if(llArr.get(i).ni != -1 ){
                headFinder[llArr.get(i).ni] = true;
            }
        }
        int head = -1;
        for(int i=0 ; i < headFinder.length ; i++) {
            if(!headFinder[i]){
                head = i;
                break;
            }
        }
        for(int i=head ; i!= -1 ; i=llArr.get(i).ni) {
            System.out.println(llArr.get(i).data);
        }
    }
}
class LinkedList {
    int data;
    int ni;
    LinkedList(int data, int ni){
        this.data = data;
        this.ni = ni;
    }
}
