package lev1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class LinelandMail {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        List<Integer> ox= new ArrayList<>();
        int n= scanner.nextInt();

        int max, min;

        for(int i=0; i<n; i++){
            ox.add(scanner.nextInt());
        }

        for(int i=0; i<n; i++){

            if(i==0){
                max= abs(ox.get(n-1)- ox.get(i));
                min= abs(ox.get(i+1)- ox.get(i)) ;

            }else if(i==n-1){
                max= abs(ox.get(0)- ox.get(i));
                min= abs(ox.get(i-1)- ox.get(i)) ;
            }else{
                max= Math.max( abs(ox.get(i)- ox.get(0)) , abs(ox.get(i)- ox.get(n-1)) );
                min= Math.min( abs(ox.get(i)- ox.get(i-1)), abs(ox.get(i)- ox.get(i+1)) );

            }

            System.out.println(min +" "+ max);

        }
    }
}

