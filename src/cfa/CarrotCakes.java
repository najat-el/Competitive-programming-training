package cfa;

import java.util.Scanner;

/**
 * Link to the problem : http://codeforces.com/contest/799/problem/A
 *
 * @author Najat EL Habti
 */

public class CarrotCakes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int t=scanner.nextInt();
        int k=scanner.nextInt();
        int d=scanner.nextInt();

        int oven1=0;
        int oven2=d;

        // number of cakes's groups
        int ratio = (int) Math.ceil(n / k);
        for (int i = 0; i <ratio ; i++) {
            if(oven1<=oven2)
                oven1+=t;
            else
                oven2+=t;
        }
        if (Math.max(oven1,oven2)<ratio*t)
        System.out.println("YES");
        else
        System.out.println("NO");
        //TODO : wrong nswer for the input 599 97 54 992
    }
}
