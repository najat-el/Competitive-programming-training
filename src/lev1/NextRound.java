package lev1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int k=scanner.nextInt();

        List<Integer> scores=new ArrayList<>();

        int count=0;

        for (int i = 0; i < n; i++) {
            scores.add(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            if( scores.get(i) > 0 && scores.get(i) >= scores.get(k-1) )
                count++;
        }

        System.out.println(count);
    }

}
