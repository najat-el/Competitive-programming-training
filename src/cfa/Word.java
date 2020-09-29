package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/59/problem/A
 * Description : Vasya decided to invent an extension for his favorite
 * browser that would change the letters' register in every word so
 * that it either only consisted of lowercase letters or, vice versa,
 * only of uppercase ones. At that as little as possible letters should
 * be changed in the word. For example, the word HoUse must be replaced
 * with house, and the word ViP — with VIP. If a word contains an equal
 * number of uppercase and lowercase letters, you should replace all
 * the letters with lowercase ones.
 *
 * @author EL HABTI Najat
 */
public class Word {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        int numberOfLowerCase=0;
        int numberOfUpperCase=0;

        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))){
                numberOfUpperCase++;
            }else{
                numberOfLowerCase++;
            }
        }

        if (numberOfUpperCase>numberOfLowerCase)
            word=word.toUpperCase();
        else
            word=word.toLowerCase();

        System.out.println(word);
    }
}
