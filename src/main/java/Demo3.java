public class Demo3 {
  public static void main(String[] args) {
    System.out.println(getNum(22));
  }

  public static int getNum(int year) {
    if (year == 1 || year == 2 || year == 3) {
      return 1;
    }
    return getNum(year - 1) + getNum(year - 3);
  }
}
