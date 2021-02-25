import java.util.*;

public class Scale {
  public static void main(String[] args) {
    ArrayList<Integer> test1 = new ArrayList<Integer>();
    test1.add(4);
    test1.add(1);
    test1.add(2);
    test1.add(0);
    test1.add(3);

    System.out.println(test1.toString());
    scaleByK(test1);
    System.out.println(test1.toString());
  }

  public static void scaleByK(ArrayList<Integer> list) {
    for (int index = 0; index < list.size(); index++) {
      if (list.get(index) > 0) {
        for (int val = 1; val < list.get(index); val++) {
          list.add(index, list.get(index));
          index++;
        }
      }
      else {
        list.remove(index);
        index--;
      }
    }
  }
}
