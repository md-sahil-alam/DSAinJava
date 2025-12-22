package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrListPractice {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      ArrayList<ArrayList<Integer>> lis = new ArrayList<>();

      //initalization
      for (int i = 0; i < 3; i++) {
        lis.add(new ArrayList<>());
      }

      //add element
      for (int i = 0; i <3 ; i++) {
        System.out.println("enter elem for the "+i+" row");
        for(int j  = 0 ; j<3 ; j++){
          lis.get(i).add(in.nextInt());
        }
      }
      System.out.println(lis);
  }
}
