package LeanierSearch;

public class SaearchInmultiDimen {

    public static void main(String[] args) {
        int[][] arr = {
            {2, 5, 33, 5},
            {77, 87, 0},
            {87, 543, 85, 88, 46, 78},
            {55, 66, 33, 22}
        };
        int target = 78;
        Lsearch(arr, target);
    }

    static void Lsearch(int[][] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    found = true;
                    System.out.println(target + " found at Position" + i + "," + j);
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }
}
