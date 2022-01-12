package problems;

import java.util.*;

public class RemoveOdd extends ProblemBase {
  private List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
  private List<Integer> expected = new ArrayList<>(Arrays.asList(2,4,6,8,10));
  private List<Integer> result = new ArrayList<>();

  public void run() {
    for(Integer i : list) {
      if (i % 2 == 0) {
        result.add(i);
      }
    }

    this.test(expected, result);
  }
}
