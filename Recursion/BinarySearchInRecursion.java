package Recursion;

public class BinarySearchInRecursion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        System.out.println((search(arr, 66, 0, arr.length - 1)));
    }

// step 1 ) return type = int
//step 2) argument -> will go into next function call -> here( start & end)
    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        //step 3) variable of body of the function 
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            //step 4) make sure to return the result of a function call of the return type 
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);
    }
}
