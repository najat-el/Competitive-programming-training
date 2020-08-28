package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/231/problem/A
 * Description : One day three best friends Petya, Vasya and Tonya
 * decided to form a team and take part in programming contests.
 * Participants are usually offered several problems during programming
 * contests. Long before the start the friends decided that they will
 * implement a problem if at least two of them are sure about the solution.
 * Otherwise, the friends won't write the problem's solution.
 *
 * @author EL HABTI Najat
 */
public class Team {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        //n is the number of problems in the contest
        int n=scanner.nextInt();
        int numberOfImplementedSolutions=0;

        for (int i = 0; i <n ; i++) {
            int teamMemberOpinion=0;
            for (int j = 0; j <3 ; j++) {
                teamMemberOpinion+=scanner.nextInt();
            }
            if (teamMemberOpinion>=2){
                numberOfImplementedSolutions++;
            }
        }
        System.out.println(numberOfImplementedSolutions);
    }
}
