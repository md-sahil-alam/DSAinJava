package Shorting.CyclicShort;

import java.util.Arrays;

public class MissingNoLeetCodeAmazon {

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int sort(int[] arr) {
        int i = 0;
        //short
        while (i < arr.length) {
            int correct = arr[i];

            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        //search of missing no
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

}
