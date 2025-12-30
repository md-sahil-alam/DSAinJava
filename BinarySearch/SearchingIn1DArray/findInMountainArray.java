package BinarySearch.SearchingIn1DArray;

public class findInMountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        //fist find max in the arr
        int max = -1;
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        max = start;
        // if arr[mid] target return mid
        if (arr[max] == target) {
            ans = max;
        } else {//else do asending and de sending search
            int a = asearch(arr, target, max - 1);
            int d = dsearch(arr, target, max + 1);
            System.out.println(giveans(a, d));
        }
    }

    static int giveans(int a, int d) {
        if (a != -1) {
            return a;
        }
        return d;
    }

    static int asearch(int[] arr, int target, int end) {
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int dsearch(int[] arr, int target, int start) {
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
