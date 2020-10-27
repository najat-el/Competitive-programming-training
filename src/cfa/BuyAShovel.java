package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/732/problem/A
 * Description : Policarp urgently needs a shovel! He comes to the
 * shop and chooses an appropriate one. The shovel that Policarp
 * chooses is sold for k burles. Assume that there is an unlimited
 * number of such shovels in the shop.
 * In his pocket Policarp has an unlimited number of "10-burle coins"
 * and exactly one coin of r burles (1 ≤ r ≤ 9).
 * What is the minimum number of shovels Policarp has to buy so that
 * he can pay for the purchase without any change?
 *
 * @author Najat EL
 */
public class BuyAShovel {
    static public void main(String[] args){
        //numberOfShovel*k = 10*M + r
        // --> numberOfShovel*k - r % 10 == 0

        Scanner scanner=new Scanner(System.in);

        int k=scanner.nextInt();
        int r=scanner.nextInt();
        int numberOfShovel=1;


        boolean boucle=true;

        while (boucle){
            if(((numberOfShovel*k) % 10)==0){
                boucle=false;
            }
            else if(((numberOfShovel*k -r) % 10)==0){
                boucle=false;
            }
            numberOfShovel++;
        }

        System.out.println(numberOfShovel-1);

    }
}
