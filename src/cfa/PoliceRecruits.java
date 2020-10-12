package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/427/problem/A
 * Description : The police department of your city has just started
 * its journey. Initially, they don’t have any manpower. So, they
 * started hiring new recruits in groups.
 * Meanwhile, crimes keeps occurring within the city. One member of
 * the police force can investigate only one crime during his/her
 * lifetime.If there is no police officer free (isn't busy with crime)
 * during the occurrence of a crime, it will go untreated.
 * Given the chronological order of crime occurrences and recruit
 * hirings, find the number of crimes which will go untreated.
 *
 * @author Najat EL HABTI
 */

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp;

        int numberOfUntreatedCrimes = 0;
        int numberOfAvailableRecruits = 0;

        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();

            if (temp > 0)
                numberOfAvailableRecruits += temp;
            else if (temp < 0) {
                if (numberOfAvailableRecruits <= 0)
                    numberOfUntreatedCrimes++;
                else
                    numberOfAvailableRecruits--;
            }

        }
        System.out.println(numberOfUntreatedCrimes);
    }
}
