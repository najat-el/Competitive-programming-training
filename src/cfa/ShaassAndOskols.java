package cfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/294/problem/A
 * Description :
 *
 * @author Najat EL Habti
 */
public class ShaassAndOskols {
    static public void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        List<Integer> numberOfBirds=new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            numberOfBirds.add(scanner.nextInt());
        }

        int m=scanner.nextInt();
        int x,y;

        for (int i = 0; i <m ; i++) {
            x=scanner.nextInt();
            y=scanner.nextInt();
            if((x-1)-1>=0)
            numberOfBirds.set((x-1)-1,numberOfBirds.get((x-1)-1)+(y-1));
            if((x-1)+1<n)
            numberOfBirds.set((x-1)+1,numberOfBirds.get((x-1)+1)+numberOfBirds.get((x-1))-y);
            numberOfBirds.set((x-1),0);
        }

        numberOfBirds.forEach(number->System.out.println(number));
    }
}

