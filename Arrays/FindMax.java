package Arrays;

import java.util.Arrays;

public class FindMax 
{
    public static void main(String[] args) 
    {
      int [] arr = {10,28,34,56};
      System.out.println(max(arr));
    }
    static int max(int[] arr) 
    {
        int maxVal = arr[0];
        for (int i=0; i<arr.length; i++) 
        {
            if(arr[i] > maxVal) 
            {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}