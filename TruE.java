public class TruE {
  public static void main(String[] arg) {
    int a = 10;
    int b = 3;
    int c = 13;

    boolean amount = checkSum(a, b, c);
    System.out.println(amount);
  }
  public static boolean checkSum(int a, int b, int c) {
    int sum = a + b;
    return sum == c;
  }
}
