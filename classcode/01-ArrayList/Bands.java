import java.util.*;

public class Bands {
  public static void main(String[] args) {
    ArrayList<String> list1 = new ArrayList<String>(
                                      Arrays.asList("Pink Floyd",
                                                    "The Beatles",
                                                    "Green Day",
                                                    "The Strokes",
                                                    "The Doors"));

    // System.out.println(list1.toString());
    // removeEvenLength(list1);
    // System.out.println(list1.toString());

    ArrayList<String> list2 = new ArrayList<String>();
    list2.add("Pink Floyd"); //even
    list2.add("Coldplay"); //even
    list2.add("The Beatles"); //odd
    list2.add("Kiss"); //even
    list2.add("Imagine Dragons"); //odd
    list2.add("Gorillaz"); //even

    removeEvenLengthReverse(list2);
    System.out.println(list2);

  }// end main method


  public static void removeEvenLength(ArrayList<String> list) {
    // iterate through the entire list
    for (int i = 0; i < list.size(); i++) {
      // condition (is the length of the individual String even?)
      if (list.get(i).length() % 2 == 0) {
        // if yes, then remove
        list.remove(i);
        // NOTE: we need to decrement i to avoid skipping
        i--;
      }// end if statement
    }// end for loop
  }// end removeEvenLength method

  public static void removeEvenLengthReverse(ArrayList<String> list) {
    // iterate from the end to the front
    for (int i = list.size() - 1; i >= 0; i--) {
      // condition (is the length of the individual String even?)
      if (list.get(i).length() % 2 == 0) {
        // if yes, then remove
        list.remove(i);
      }// end if statement
    }// end for loop
  }// end removeEvenLengthReverse method

}// end class
