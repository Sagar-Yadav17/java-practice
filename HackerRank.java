import java.io.*;
import java.util.*;

public class Solution {

     private static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    List<Integer> list = new java.util.ArrayList<>();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      String input = sc.next();

      try {
        int num = Integer.parseInt(input);
        if (isPrime(num)) {
          list.add(num);
        } else {
          list.add(-1);
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input");
      }
    }

    for (int i = 0; i < list.size()-1; i++) {
      if (i < 3) {
        if (list.get(i) != -1) {
          sb.append(list.get(i)).append(" ");
          System.out.println(sb.toString());
        } else {
          System.out.println(sb.toString());

        }
      } else if(i==3 && list.get(i) != -1){
        sb.append(list.get(i));
      }

    }
    if(list.get(4)!=-1) {
      System.out.println(sb.append(list.get(4)).toString());

    } else {
      System.out.println(sb.toString());

    }

  }
}
