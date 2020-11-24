package cfa;

import java.util.Scanner;

/**
 * Link to the problem : http://codeforces.com/contest/71/problem/A
 *
 * @author Najat EL Habti
 */

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //number of words
        int n=scanner.nextInt();

        //needed to switch from nextInt() to nextLine()
        scanner.nextLine();

        String word;

        for (int i = 0; i <n ; i++) {
            word=scanner.nextLine();
            if (word.length()<=10)
                System.out.println(word);
            else
                System.out.println(word.charAt(0)+""+(word.length()-2)+word.charAt(word.length()-1));
        }
    }
}
