package LeanierSearch;

import java.util.Arrays;

public class multiLeaSer {
  public static void main(String[] args) {
    int[][] arr = {
    {6,4,67,4,6,3},
    {897,56,987,},
    {54,34,87,9,44,7,1},
    {23,67,3},
  };
  int target = 44;

  find(arr,target);
  int[] ans = find(arr, target);
  System.out.println(Arrays.toString(ans));
  }
  static int[] find(int[][] arr , int target){
    for (int i = 0; i < 4; i++) {
      for(int j = 0; j<arr[i].length; j++){
        if (arr[i][j] == target){
          return new int[]{i,j};
        }
      }
    }
    return new int[]{-1,-1};
  }
}

