package cfa;

import java.util.Scanner;

/**
 * Link of the problem http://codeforces.com/contest/734/problem/A
 * Description : Anton likes to play chess, and so does his friend
 * Danik. Once they have played n games in a row. For each game it's
 * known who was the winner — Anton or Danik. None of the games ended
 * with a tie.
 * Now Anton wonders, who won more games, he or Danik? Help him determine this.
 *
 * @author EL HABTI Najat
 */
public class AntonAndDanik {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        // number og games
        int n=scanner.nextInt();
        int wonByAnton=0;
        int wonByDanik=0;
        //string s, consisting of n uppercase English letters 'A' and 'D'
        // — the outcome of each of the games
        String s=scanner.next();
        for (int i = 0; i <s.length(); i++) {
            // put the i-th char in a string to be able to use the equals method
            String letter= String.valueOf(s.charAt(i));
            if("A".equals(letter)){
                wonByAnton++;
            }else if("D".equals(letter)){
                wonByDanik++;
            }
        }
        if(wonByAnton>wonByDanik){
            System.out.println("Anton");
        }else if(wonByAnton<wonByDanik){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
