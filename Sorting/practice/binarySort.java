package practice;

import java.util.Scanner;

public class binarySort {
    public static void main(String args[]){
        System.out.println("Enter the number you want to find");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int[] arr = {10, 20, 30, 40, 50};
        
        int result = binarySearch(arr, inp);
        if(result != -1){
            result += 1;
            System.out.println("Element is at position " + result);
        }else{
            System.out.println("Not Found");

        }

    }

    public static int binarySearch(int[] arr, int inp){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == inp){
                return mid;      
            }else if(arr[mid] < inp){
                low = mid + 1; 
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
