package Shorting.CyclicShort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllduplicateNumberMicrosoft {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(cyclicSort(arr));
    }

    static List<Integer> cyclicSort(int[] arr) {
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
        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {//check if arr[j] is in corect index if not it is duplicate
                list.add(arr[j]);
            }
        }
        return list;
    }
}
