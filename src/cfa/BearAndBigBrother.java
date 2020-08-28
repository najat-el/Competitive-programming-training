package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/791/problem/A
 * Description : Bear Limak wants to become the largest of bears, or at
 * least to become larger than his brother Bob. Right now, Limak and Bob
 * weigh a and b respectively. It's guaranteed that Limak's weight is
 * smaller than or equal to his brother's weight. Limak eats a lot and
 * his weight is tripled after every year, while Bob's weight is doubled
 * after every year. After how many full years will Limak become strictly
 * larger (strictly heavier) than Bob?
 *
 * @author EL HABTI Najat
 */

public class BearAndBigBrother {
    /**
     * after one year : Limak weights 3*a pounds, and Bob 2*b pounds
     * after 2 years : Limak weights 3*3*a pounds, and Bob 2*2*b pounds
     * after x years : Limak weights a*3^x pounds, and Bob b*2^x
     * a*3^x > b*2^x means x > log3/2(b/a)
     * --> x > ln(b/a) / ln (3/2)
     */
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        // a is Limak's weight
        double a=scanner.nextInt();
        // b is Bob's weight
        double b=scanner.nextInt();

        double domineering=Math.log(b/a);
        double denominator=Math.log(3.0/2.0);

        double quotient= domineering / denominator;
        int x = (int) (Math.floor(quotient)+1);

        System.out.println(x);

    }

}
