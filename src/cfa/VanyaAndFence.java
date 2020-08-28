package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/677/problem/A
 * Description : Vanya and his friends are walking along the fence of height h
 * and they do not want the guard to notice them. In order to
 * achieve this the height of each of the friends should not exceed h.
 * If the height of some person is greater than h he can bend down and
 * then he surely won't be noticed by the guard. The height of the i-th
 * person is equal to a i.
 *
 * @author EL HABTI Najat
 */

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //n is the number of friends
        int n=scanner.nextInt();
        // h is the height of fence
        int h=scanner.nextInt();
        int a=0;
        int minWidth=0;

        for (int i = 0; i <n ; i++) {
            // a is height of the i-th person
            a=scanner.nextInt();
            if (a>h)
                // the width of the bent person is equal to 2
                minWidth+=2;
            else
                // the width of the person walking as usual is equal to 1
                minWidth+=1;
        }
        System.out.println(minWidth);
    }
}
