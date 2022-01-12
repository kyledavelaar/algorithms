import problems.Problem1;

class Solver {
  public static void main(String[] args) {
    String problemName = args[0];
    Problem1 problem1 = new Problem1();
    problem1.run();
    System.out.println(problemName);
  }
}