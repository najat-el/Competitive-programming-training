package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/344/problem/A
 * Description : Mike starts by laying one magnet horizontally on
 * the table. During each following step Mike adds one more magnet
 * horizontally to the right end of the row. Depending on how Mike
 * puts the magnet on the table, it is either attracted to the previous
 * one (forming a group of multiple magnets linked together) or repelled
 * by it (then Mike lays this magnet at some distance to the right from
 * the previous one). We assume that a sole magnet not linked to others
 * forms a group of its own.
 *
 * @author EL HABTI Najat
 */

public class Magnets {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int numberOfMagnets=scanner.nextInt();

        scanner.nextLine();

        String string1=scanner.nextLine();
        String string2=null;

        int numberOfGroups=1;

        for (int i = 0; i <numberOfMagnets-1 ; i++) {
             string2=scanner.nextLine();

             if(!string1.equals(string2))
                 numberOfGroups++;
             string1=string2;
        }
        System.out.println(numberOfGroups);
    }
}
