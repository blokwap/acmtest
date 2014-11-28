package p6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int lineNum = Integer.valueOf(scanner.nextLine());
    int[] resultArr = new int[lineNum];

    for (int i = 0; i < lineNum; i++) {
      double sum = 0;
      int count = 0;
      int pointNum = scanner.nextInt();
      double[] arr = new double[pointNum];
      for (int j = 0; j < pointNum; j++) {
        double r = scanner.nextDouble();
        arr[j] = r;
      }
      Arrays.sort(arr);
      for (int k = pointNum - 1; k >= 0; k--) {
        double r = arr[k];
        double len = Math.sqrt(r * r - 1);
        sum += len * 2;
        count++;
        if (sum > 20) {
          resultArr[i] = count;
          break;
        }
      }
    }
    scanner.close();

    for (int s : resultArr) {
      System.out.println(s);
    }
  }
}
