package cfa;

import java.util.Scanner;
import java.util.Stack;

/**
 * Link to the problem : http://codeforces.com/contest/490/problem/A
 *
 * @author Najat EL Habti
 */

public class TeamOlympiad {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        Stack<Integer> prgSkill = new Stack<Integer>();
        Stack<Integer> mathSkill = new Stack<Integer>();
        Stack<Integer> peISkill = new Stack<Integer>();

        for(int i=0;i<num;i++){
            int teamMember = in.nextInt();

            if(teamMember == 1)
                prgSkill.push(i+1);
            else if(teamMember == 2)
                mathSkill.push(i+1);
            else
                peISkill.push(i+1);
        }

        StringBuilder team = new StringBuilder();
        int numberOfTeam = Math.min(Math.min(prgSkill.size(), mathSkill.size()), peISkill.size());
        team.append(numberOfTeam).append("\n");

        for(int i=0;i<numberOfTeam;i++)
            team.append(String.format("%d %d %d\n",prgSkill.pop(), mathSkill.pop(), peISkill.pop()));
        System.out.print(team.toString());
        in.close();
    }
}
