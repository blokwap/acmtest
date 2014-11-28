package p3;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] resultArr = new String[n];
    int i = 0;
    while (n > 0) {

      int m = scanner.nextInt();
      double x0 = scanner.nextDouble();
      double y0 = scanner.nextDouble();
      double x2 = x0, y2 = y0;
      double x1 = 0, y1 = 0;
      double sum = 0;
      double sums = 0.0;
      double gx = 0;
      double gy = 0;
      if (m > 1) {
        m -= 1;
        while (m > 0) {
          x1 = scanner.nextDouble();
          y1 = scanner.nextDouble();
          sum = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) / 2;
          sums += sum;
          gx += sum * (x0 + x1 + x2) / 3.0;
          gy += sum * (y0 + y1 + y2) / 3.0;
          x2 = x1;
          y2 = y1;
          m--;
        }
        DecimalFormat df = new DecimalFormat("0.000");
        if (Math.abs(sums) < 0.00001)
          resultArr[i] = df.format(sums) + " " + df.format(sums);
        else {
          resultArr[i] = df.format(Math.abs(sums)) + " " + df.format((gx + gy) / sums);
        }
        n--;
      }
      i++;
    }
    scanner.close();
    for (String s : resultArr) {
      System.out.println(s);
    }
  }
}
