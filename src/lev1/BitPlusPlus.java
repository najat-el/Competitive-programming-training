package lev1;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();

        int x=0;
        String statement;

        for (int i = 0; i < n; i++) {
            statement= scanner.next();
            if(statement.contains("++"))
                x++;
            else
                x--;
        }

        System.out.println(x);
    }
}
