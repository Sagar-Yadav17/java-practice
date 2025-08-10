import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    //swap();
    //vowelcheck();
     //repeatCheck();
    //primeCheck();
    //reverseSentance();
    //findKey();
    //palindromeCheck();

  }

  static void swap() {
    int a = 10;
    int b = 20;
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a=" + a);
    System.out.println("b= " + b);
  }

  static void vowelcheck() {
    // char[] arr={'a','e','i','o','u'};
    List<Character> list = List.of('a', 'e', 'i', 'o', 'u');

    int count = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string or line");

    String s = scanner.nextLine();

    char[] chars = s.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      if (list.contains(chars[i])) {
        count++;
      }

    }
        /*for(int i=0;i<s.length();i++){
            for(int j = 0; j < arr.length; j++) {
                if(c[i]==arr[j]){
                    count++;
                }
            }
        }*/
    System.out.println(count);
    System.out.println(String.valueOf(chars));
  }

  static void repeatCheck() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string or line");

    String s = scanner.nextLine();

    char[] chars = s.toCharArray();
    Set<Character> temp = new HashSet<>();
    for (int i = 0; i < chars.length; i++) {
        for (int j = i + 1; j < chars.length; j++) {
          if (chars[i] == chars[j] && !temp.contains(chars[j])) {
            temp.add(chars[i]);
            System.out.println(chars[i]);
            break;
          }

        }

    }
  }

  static void primeCheck() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number to check prime or not");
    for (int j = 0; ; ) {
      int n = scanner.nextInt();

      if (n == 0) {
        break;
      }
      boolean isPrime = false;

      if (n == 0 || n == 1) {
        isPrime = true;
      }
      for (int i = 2; i < n / 2; i++) {
        if (n % i == 0) {
          isPrime = true;
        }
      }

      if (!isPrime) {
        System.out.println(n + " is a prime number");
      } else {
        System.out.println(n + "is not a prime number");
      }

    }
  }

  static void reverseSentance() {
    String s = "this is a boy";

    String[] arr = s.split(" ");
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println(arr[i]);
    }
  }

  static void findKey() {
    int n1 = 7686;
    int n2 = 9876;
    int n3 = 7963;

    int hundredDigit= (n1/100)%10;
    int tenDigit= (n2/10)%10;

    long key = 0;

    List<Integer> numberList = new ArrayList<>();
    String numString = String.valueOf(n3);
    char[] chars = numString.toCharArray();
    for(Character c : chars) {
      numberList.add(Character.getNumericValue(c));
    }
    Collections.sort(numberList, Collections.reverseOrder());
    System.out.println(numberList.get(0));
    key = (hundredDigit*tenDigit) - numberList.get(0);
    System.out.println(key);

  }

  static void palindromeCheck() {

    Scanner  sc = new Scanner(System.in);
    System.out.println("enteer the string");
    String s= sc.next();

    char[]  c = new char[s.length()];

    c = s.toCharArray();
    int size = s.length();
    for(int i = 0; i <size/2; i++) {
      c[i] = c[size-1-i] ;
      }
    String s1 = new String(c);
    if(s.equals(s1)){
      System.out.println("Palindrome");
    } else {
      System.out.println("NOT");
    }
    }






}
