package problemManager;

import java.util.*;
import problems.ProblemBase;
import problems.RemoveOdd;

/**
 * puts problemName : problemClass in Map
 * so when given a problemName can retrieve the class and call run() with given args
 */
public class ProblemManager {
  private Map <String, ProblemBase> problemMap = new HashMap<>();

  public void registerProblems() {
    this.register("RemoveOdd", new RemoveOdd());
  }

  private void register(String problemName, ProblemBase problem) {
    problemMap.put(problemName, problem);
  }

  public void runProblem(String problemName) {
    ProblemBase problem = problemMap.get(problemName);
    problem.run();
  }
}
