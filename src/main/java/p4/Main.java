package p4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static String sort(String str) {
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    StringBuffer sb = new StringBuffer();
    for(int i=0;i<arr.length;i++){
      sb.append(arr[i]+" ");
    }
    return sb.toString().trim();
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int lineNum = Integer.valueOf(scanner.nextLine());
    String[] resultArr = new String[lineNum];
    for (int i = 0; i < lineNum; i++) {
      resultArr[i]=sort(scanner.nextLine());
    }

    scanner.close();
    
    for(String s:resultArr){
      System.out.println(s);
    }
  }
}
