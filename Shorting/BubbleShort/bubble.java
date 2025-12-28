package Shorting.BubbleShort;

import java.util.Arrays;

public class bubble {
  public static void main(String[] args) {
    int[] arr = {3,1,5,4,2};
    int end = arr.length-1;
    while(end>0){
      for (int i = 0; i < arr.length-1; i++) {
        if (arr[i]>arr[i+1]) {
          int temp = arr[i];
          arr[i]=arr[i+1];
          arr[i+1]= temp;
        }
      }
      end--;
    }
    System.out.println(Arrays.toString(arr));
  }
}
