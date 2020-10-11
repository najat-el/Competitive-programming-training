package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/266/problem/A
 * Description : There are n stones on the table in a row, each of
 * them can be red, green or blue. Count the minimum number of stones
 * to take from the table so that any two neighboring stones had
 * different colors. Stones in a row are considered neighboring
 * if there are no other stones between them.
 *
 * @author EL HABTI Najat
 */

public class StonesOnTheTable {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();

        String s=scanner.nextLine();

        int numStonesToRemove=0;

        for (int i = 0; i <s.length()-1; i++) {

            if(s.charAt(i)==s.charAt(i+1))
                numStonesToRemove++;
        }

        System.out.println(numStonesToRemove);
    }
}
