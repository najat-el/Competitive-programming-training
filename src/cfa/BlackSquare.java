package cfa;

import java.util.Scanner;

/**
 * Link of the problem : https://codeforces.com/contest/431/problem/A
 * Description : In this game, the phone's screen is divided into four
 * vertical strips. Each second, a black square appears on some of the
 * strips. According to the rules of the game, Jury must use this second
 * to touch the corresponding strip to make the square go away. As Jury
 * is both smart and lazy, he counted that he wastes exactly ai calories
 * on touching the i-th strip.
 * You've got a string s, describing the process of the game and numbers
 * a1, a2, a3, a4. Calculate how many calories Jury needs to destroy all
 * the squares?
 *
 * @author Najat EL HABTI
 */

public class BlackSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1, a2, a3, a4;

        String s;
        a1 = scanner.nextInt();
        a2 = scanner.nextInt();
        a3 = scanner.nextInt();
        a4 = scanner.nextInt();
        //necessary for the switch from nextInt() to newtLine()
        scanner.nextLine();

        s = scanner.nextLine();

        int numberOfCalories = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '1':
                    numberOfCalories += a1;
                    break;
                case '2':
                    numberOfCalories += a2;
                    break;
                case '3':
                    numberOfCalories += a3;
                    break;
                case '4':
                    numberOfCalories += a4;
                    break;
            }

        }

        System.out.println(numberOfCalories);

    }
}
