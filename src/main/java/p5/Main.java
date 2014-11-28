package p5;

import java.util.Scanner;

public class Main {

  public static int count(String a, String b) {
    int count = 0;
    while (b.length() >= a.length()) {
      int index = b.indexOf(a);
      if (index == -1) {
        break;
      } else {
        count++;
        b = b.substring(index + 1);
      }
    }
    return count;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int lineNum = Integer.valueOf(scanner.nextLine());
    int[] resultArr = new int[lineNum];
    for (int i = 0; i < lineNum; i++) {
      String a = scanner.nextLine();
      String b = scanner.nextLine();
      resultArr[i] = count(a, b);
    }

    scanner.close();

    for (int s : resultArr) {
      System.out.println(s);
    }
  }
}
