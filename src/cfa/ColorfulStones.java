package cfa;


import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/265/problem/A
 * Description :
 *
 * @author Najat EL
 */
public class ColorfulStones {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String s=scanner.nextLine();
        String t=scanner.nextLine();

        int i=0;
        int count=1;

        for (int j = 0; j <t.length() ; j++) {
            if(s.charAt(i)==t.charAt(j)){
                count++;
                i++;
            }
        }

        System.out.println(count);
    }
}
