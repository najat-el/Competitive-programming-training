package lev1;

import java.util.*;

public class OathOfTheNightsWatch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int []arr=new int[x];
        int a;
        for(int i=0;i<x;i++)
        {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int ans=0;
        for(int i=1;i<x-1;i++)
        {
            if(arr[0]<arr[i]&&arr[x-1]>arr[i])ans++;

        }
        System.out.println(ans);
    }
}
