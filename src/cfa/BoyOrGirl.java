package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/236/problem/A
 * Description : If the number of distinct characters in one's user
 * name is odd, then he is a male, otherwise she is a female. You are
 * given the string that denotes the user name, please help our hero
 * to determine the gender of this user by his method.
 *
 * @author Najat EL HABTI
 */
public class BoyOrGirl {

    public  int countUniqueCharacters(String input) {
        boolean[] isItThere = new boolean[255];
        for (int i = 0; i < input.length(); i++) {
            isItThere[input.charAt(i)] = true;
        }

        int count = 0;
        // i=97; i<123 --> because the input will be in lowercase english letters
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i] == true){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        String username=scanner.nextLine();
        BoyOrGirl boyOrGirl=new BoyOrGirl();
        int count =boyOrGirl.countUniqueCharacters(username);
        if((count%2)==1){
            System.out.println("IGNORE HIM!");
        }else{
            System.out.println("CHAT WITH HER!");
        }
    }
}
