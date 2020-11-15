package cfa;

import java.util.Scanner;
/**
 * Link of the problem : http://codeforces.com/contest/709/problem/A
 *
 * @author Najat EL Habti
 */

public class Juicer {
    static public void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int b=scanner.nextInt();
        int d=scanner.nextInt();

        int sum=0;
        int emptyJuicerCount=0;
        int tmp;

        for (int i = 0; i <n ; i++) {
            tmp=scanner.nextInt();

            if(tmp<=b)
                sum+=tmp;

            if(sum> d){
                emptyJuicerCount++;
                sum=0;
            }

        }

        System.out.println(emptyJuicerCount);
    }
}
