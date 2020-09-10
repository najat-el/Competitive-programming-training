package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/112/problem/A
 * Description : Little Petya loves presents. His mum bought him two
 * strings of the same size for his birthday. The strings consist of
 * uppercase and lowercase Latin letters. Now Petya wants to compare
 * those two strings lexicographically. The letters' case does not
 * matter, that is an uppercase letter is considered equivalent to
 * the corresponding lowercase letter. Help Petya perform the comparison.
 *
 * @author Najat EL HABTI
 */

public class PetyaAndStrings {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        String string1=scanner.nextLine();
        String string2=scanner.nextLine();
        String result="0";

        string1=string1.toLowerCase();
        string2=string2.toLowerCase();

        for (int i = 0; i <string1.length() ; i++) {

            if(string1.charAt(i)>string2.charAt(i)){
                result="1";
                break;
            }else if(string1.charAt(i)<string2.charAt(i)){
                result="-1";
                break;
            }
        }
        System.out.println(result);
    }
}
