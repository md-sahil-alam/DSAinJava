package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<>();

    list.add(56);
    list.add(54);
    list.add(57);
    list.add(576);
    list.add(564);
    System.out.println(list);

    System.out.println(list.get(2));
    list.set(4, 99);
    list.remove(3);
    System.out.println(list);

    list.contains(99);

  }
}
