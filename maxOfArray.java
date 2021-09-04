import java.io.*;
import java.util.*;


public class maxOfArray {

    public static void main(String[] args) {
        // write your code here

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxOfArra(arr,0));
    }

    public static int maxOfArra(int[] arr, int idx){

        int max=Integer.MIN_VALUE;

        for (int j : arr) {

            if (j > max) {
                max = j;
            }
        }

        return max;

    }
}
