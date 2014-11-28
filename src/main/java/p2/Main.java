package p2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static final String YES = "Yes";
  public static final String NO = "No";

  public static char getOpposite(char c) {
    char opposite = 0;
    switch (c) {
      case '(':
        opposite = ')';
        break;
      case '[':
        opposite = ']';
        break;
    }
    return opposite;

  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int lineNum = Integer.valueOf(scanner.nextLine());
    String[] resultArr = new String[lineNum];
    for (int i = 0; i < lineNum; i++) {
      resultArr[i] = YES;
      Stack<Character> stack = new Stack<Character>();
      String line = scanner.nextLine();
      for (int j = 0; j < line.length(); j++) {
        char c = line.charAt(j);
        char current = 0;
        switch (c) {
          case '(':
            stack.push(c);
            break;
          case '[':
            stack.push(c);
            break;
          case ')':
            if (stack.isEmpty()) {
              resultArr[i] = NO;
              break;
            }
            current = stack.pop();
            if (getOpposite(current) != c) {
              resultArr[i] = NO;
              break;
            }
            break;
          case ']':
            if (stack.isEmpty()) {
              resultArr[i] = NO;
              break;
            }
            current = stack.pop();
            if (getOpposite(current) != c) {
              resultArr[i] = NO;
              break;
            }
            break;
        }
      }
      if (!stack.isEmpty()) {
        resultArr[i] = NO;
      }
    }

    for (int k = 0; k < resultArr.length; k++) {
      System.out.println(resultArr[k]);
    }
    scanner.close();
  }
}
