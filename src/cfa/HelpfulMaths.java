package cfa;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Link to the problem : http://codeforces.com/contest/339/problem/A
 *
 * @author Najat EL Habti
 */

public class HelpfulMaths {

    static public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        String[] numbers=s.split("\\+");

        int[] array = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();

        bubbleSort(array);
        for (int i = 0; i <array.length-1 ; i++) {
                System.out.print(array[i]+"+");
        }

        System.out.print(array[array.length-1]+"\n");
    }
}
