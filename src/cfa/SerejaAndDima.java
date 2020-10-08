package cfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/381/problem/A
 * Description : Sereja and Dima play a game. The rules of the game
 * are very simple. The players have n cards in a row. Each card contains
 * a number, all numbers on the cards are distinct. The players take turns,
 * Sereja moves first. During his turn a player can take one card: either
 * the leftmost card in a row, or the rightmost one. The game ends when
 * there is no more cards. The player who has the maximum sum of numbers
 * on his cards by the end of the game, wins.
 *
 * @author Najat EL HABTI
 */
public class SerejaAndDima {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> cardNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            cardNumbers.add(number);
        }

        boolean serejaTurn = true;

        int serejaCredits = 0;
        int dimaCredits = 0;

        int firstElement = 0;
        int lastElement = cardNumbers.size() - 1;

        while (firstElement <= lastElement) {
            if (cardNumbers.get(firstElement) > cardNumbers.get(lastElement)) {
                if (serejaTurn)
                    serejaCredits += cardNumbers.get(firstElement);

                else
                    dimaCredits += cardNumbers.get(firstElement);

                firstElement++;
            } else {

                if (serejaTurn)
                    serejaCredits += cardNumbers.get(lastElement);
                else
                    dimaCredits += cardNumbers.get(lastElement);

                lastElement--;
            }
            serejaTurn = !serejaTurn;
        }

        System.out.println(serejaCredits + " " + dimaCredits);
    }
}
