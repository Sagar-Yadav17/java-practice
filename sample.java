import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        //swap();
        //vowelcheck();
//        repeatCheck();

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


        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[i]);

                }

            }


        }
    }


}
