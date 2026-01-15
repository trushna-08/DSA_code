package Arrays;

import java.util.Arrays;

public class SwapArraysIndex
{
    public static void main(String[] args) {
        int [] arr ={11,14,13,12,15};

        System.out.println("The given array is : " + Arrays.toString(arr));

        swap(arr,1,3);

        System.out.println( "After Swapping the index array is : " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
