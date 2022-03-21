package lev1;

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int x=0, y=0, z=0;

        for (int i = 0; i <n ; i++) {
            x+=scanner.nextInt();
            y+=scanner.nextInt();
            z+=scanner.nextInt();
        }

        if(x!=0 || y!= 0 || z!=0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
