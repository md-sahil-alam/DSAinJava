package Shorting.BubbleShort;

import java.util.Arrays;

public class bubble {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        int end = arr.length - 1;
        boolean swapped;
        while (end > 0) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
