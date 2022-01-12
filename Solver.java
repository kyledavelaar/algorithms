import problemManager.ProblemManager;

class Solver {
  public static void main(String[] args) {
    String problemName = args[0];
    // System.out.println(problemName);

    ProblemManager problemManager = new ProblemManager();
    problemManager.registerProblems();
    problemManager.runProblem(problemName);
  }
}