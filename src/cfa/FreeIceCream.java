package cfa;

import java.util.Scanner;

/**
 * Link to the problem : http://codeforces.com/contest/686/problem/A
 *
 * @author Najat EL Habti
 */

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        String[] arrOfStr = line.split(" ");

        int n=Integer.parseInt(arrOfStr[0]);
        long x=Long.parseLong(arrOfStr[1]);

        String character = null;
        long d=0;
        int distressedKids=0;

        for (int i = 0; i <n ; i++) {
            line=scanner.nextLine();
            arrOfStr = line.split(" ");
            character=arrOfStr[0];
            d=Long.parseLong(arrOfStr[1]);

            if(character.equals("+"))
                x+=d;
            else{
                if((x-d)<0)
                    distressedKids++;
                else
                    x=x-d;
            }
        }
        System.out.println(x+" "+distressedKids);
    }
}
