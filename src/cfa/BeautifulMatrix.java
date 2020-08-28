package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/263/problem/A
 * Description : You've got a 5 × 5 matrix, consisting of 24 zeroes and
 * a single number one. Let's index the matrix rows by numbers from 1 to
 * 5 from top to bottom, let's index the matrix columns by numbers from 1
 * to 5 from left to right. In one move, you are allowed to apply one of
 * the two following transformations to the matrix:
 * 1- Swap two neighboring matrix rows, that is, rows with indexes i and i + 1
 * for some integer i (1 ≤ i < 5).
 * 2- Swap two neighboring matrix columns, that is, columns with indexes j and
 * j + 1 for some integer j (1 ≤ j < 5).
 * You think that a matrix looks beautiful, if the single number one of the
 * matrix is located in its middle (in the cell that is on the intersection
 * of the third row and the third column). Count the minimum number of moves
 * needed to make the matrix beautiful.
 *
 * @author EL HABTI Najat
 */
public class BeautifulMatrix {

    /**
     * Lets say x is the x-coordinate of the value one in the matrix, and y is its y-coordinate
     * The minimal number of moves = |x-3|+|y-3|
     * Lets find first the coordinates of the "One"
     */

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int minNumberOfMoves;

        //x, the x-coordinate for the value one
        int x=1;
        //y, the y-coordinate for the value one
        int y=1;

        for (x=1; x <=5 ; x++) {
            //Less variables is more optimization in memory
            if (scanner.nextInt() == 1) {
                break;
            }

            if (x == 5) {
                y++;
                // To avoid using two loops, for rows and columns, we initialize x if it exceeds 5
                x = 0;
            }
        }

        minNumberOfMoves=Math.abs(x-3)+Math.abs(y-3);
        System.out.println(minNumberOfMoves);
    }
}
