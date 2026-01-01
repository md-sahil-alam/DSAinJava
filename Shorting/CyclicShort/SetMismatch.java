package Shorting.CyclicShort;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(find(arr)));
    }

    static int[] find(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[]{arr[j], j + 1};
            }
        }
        return new int[]{-1, -1};

    }
}
