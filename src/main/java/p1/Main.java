package p1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = null;
    try {
      scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      System.out.println(a + b);
    } catch (Exception e) {
      throw new Exception("wrong");
    } finally {
      scanner.close();
    }
  }
}
