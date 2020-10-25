package cfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/268/problem/A
 * Description : There are n teams taking part in the national championship.
 * The championship consists of n·(n - 1) games: each team invites each other
 * team to its stadium. At this point Manao wondered: how many times during
 * the championship is a host team going to put on the guest uniform? Note
 * that the order of the games does not affect this number.
 * You know the colors of the home and guest uniform for each team. For
 * simplicity, the colors are numbered by integers in such a way that no
 * two distinct colors have the same number. Help Manao find the answer
 * to his question.
 *
 * @author EL HABTI Najat
 */
public class Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> home=new ArrayList<>();
        List<Integer> guest=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            home.add(scanner.nextInt());
            guest.add(scanner.nextInt());
        }

        int count=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if(home.get(i)==guest.get(j))
                    count++;
            }
        }
        System.out.println(count);
    }
}
