
import java.util.*;


class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      String ans = obj.divisorGame(n) ? "True" : "False";
      System.out.println(ans);
    }
  }
}


class Solution {
  public static boolean divisorGame(int N) {
    // code here
    return N%2==0;

  }
}
     