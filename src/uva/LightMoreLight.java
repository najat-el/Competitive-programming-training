package uva;

import java.util.Scanner;

public class LightMoreLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n!= 0){
            if(calculateDivisors(n)%2 == 0){
                System.out.println("no");
            } else {
                System.out.println("yes");
            }


            n = scanner.nextInt();
        }

    }

    private static int calculateDivisors(int n) {
        int numberOfDivisors = 2;
        for (int i=2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                if (n/i == i){
                    numberOfDivisors++;
                }else{
                    numberOfDivisors+=2;
                }
            }
        }
        return numberOfDivisors;
    }

}
