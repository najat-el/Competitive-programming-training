package cfa;

import java.util.*;

/**
 * Link of the problem : http://codeforces.com/contest/228/problem/A
 * Description : Valera the Horse is going to the party with friends.
 * He has been following the fashion trends for a while, and he knows
 * that it is very popular to wear all horseshoes of different color.
 * Valera has got four horseshoes left from the last year, but maybe
 * some of them have the same color.
 * However, in order to save the money, he would like to spend as
 * little money as possible, so you need to help Valera and determine
 * what is the minimum number of horseshoes he needs to buy to wear
 * four horseshoes of different colors to a party.
 *
 * @author Najat EL
 */
public class IsYourHorseshoeOnTheOtherHoof {
    static public void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        Set<Integer> horseShoesColors=new HashSet<>();

        for (int i = 0; i <4 ; i++) {
            horseShoesColors.add(scanner.nextInt());
        }

        System.out.println(4-horseShoesColors.size());
    }
}
