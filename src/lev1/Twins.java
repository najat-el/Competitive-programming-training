package lev1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        List<Integer> coins= new ArrayList<>();
        int twin1=0, twin2=0;
        int numberOfCoins=0, index=0;

        for (int i = 0; i < n ; i++) {
            coins.add(scanner.nextInt());
            twin1+=coins.get(i);
        }

        Collections.sort(coins, Collections.reverseOrder());

        while (twin2 <= twin1){
            twin2+=coins.get(index);
            twin1-=coins.get(index);
            index++;
            numberOfCoins++;
        }

        System.out.println(numberOfCoins);
    }
}
