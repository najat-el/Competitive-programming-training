package cfa;

import java.util.Scanner;

/**
 * Link to the problem : http://codeforces.com/contest/443/problem/A
 *
 * @author Najat EL Habti
 */

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();

        int result=0;
        boolean[] markLetter=new boolean[124];

        for (int i = 1; i <input.length()-1 ; i++) {

            if(markLetter[input.charAt(i)]!=true && input.charAt(i)!=',' &&  input.charAt(i)!=' '){
                result++;
                markLetter[input.charAt(i)]=true;
            }
        }
        System.out.println(result);
    }
}
