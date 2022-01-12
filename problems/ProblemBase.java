package problems;

public class ProblemBase implements ProblemInterface {
  public void run() {}

  public void log(Object o) {
    System.out.println(o.toString());
  }

  public void test(Object expected, Object result) {
    this.log("Expected: " + expected);
    this.log("Result: " + result);
  }
}
