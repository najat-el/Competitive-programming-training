package cfa;

import java.util.Scanner;

/**
 * Link of the problem : http://codeforces.com/contest/405/problem/A
 * Description : There are n columns of toy cubes in the box arranged
 * in a line. The i-th column contains ai cubes. At first, the gravity
 * in the box is pulling the cubes downwards. When Chris switches the
 * gravity, it begins to pull all the cubes to the right side of the box.
 * Given the initial configuration of the toy cubes in the box, find the
 * amounts of cubes in each of the n columns after the gravity switch!
 *
 * @author Najat EL
 */

public class GravityFlip {
    /**
     * After switching the gravity, the cubes move, so we'll
     * have the column with biggest number of cubes in the right.
     * To solve the problem, we need to ascending sort the numbers
     * of cubes in each column using one of the sorting algorithms.
     */

    // Sorting algorithm
    void bubbleSort(int arr[])
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

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        GravityFlip gravityFlip = new GravityFlip();
        Scanner scanner=new Scanner(System.in);

        //Number of the columns in the box
        int n=scanner.nextInt();

        //i-th number arr[i] (1 ≤ arr[i] ≤ 100) denotes the number of cubes in the i-th column.
        int arr[] = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i]=scanner.nextInt();
        }

        gravityFlip.bubbleSort(arr);
        gravityFlip.printArray(arr);
    }
}
