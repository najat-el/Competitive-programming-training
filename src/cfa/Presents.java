package cfa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();

        int n = scanner.nextInt();
        List<Integer> givers = new ArrayList<>( Collections.nCopies(n, 0));

        for(int i=0; i<n; i++){
            givers.set(scanner.nextInt()-1, i+1);
        }



        for (int i = 0; i < givers.size(); i++) {
            sb.append(givers.get(i))
              .append(" ");
        }

        sb.append("\n");

        System.out.println(sb.toString());
    }
}
