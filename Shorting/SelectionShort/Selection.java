package Shorting.SelectionShort;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 0};
        sShort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sShort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //keep dcreasing the last index from shorted section to un shorted secton
            int last = arr.length - i - 1;

            //taking the first elem as max
            int max = 0;

            //find max elem in arr till last
            for (int j = 0; j <= last; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }

            //swap max elem from lase elem
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;

        }
    }
}
